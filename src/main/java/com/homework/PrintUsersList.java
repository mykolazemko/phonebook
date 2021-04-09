package com.homework;

import java.sql.*;

public class PrintUsersList {
        public void printUser() throws SQLException {
            String url = "jdbc:mysql://localhost:3306/usercontacts?serverTimezone=UTC";
            String user = "root";
            String userPassword = "138208";


            Connection connection = DriverManager.getConnection(url, user,userPassword);
            Statement statement = connection.createStatement();

            ResultSet resultset = statement.executeQuery("SELECT * FROM userinfo");

            while (resultset.next()){
                System.out.println("id: " + resultset.getString("id"));
                System.out.println("name: " + resultset.getString("name"));
                System.out.println("telephone: " + resultset.getString("telephone"));
                System.out.println("");
            }
        }
}
