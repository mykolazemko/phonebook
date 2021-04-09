package com.homework;

import java.sql.*;
import java.util.Scanner;

public class DeleteUser {
    public void deleteUser() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/usercontacts?serverTimezone=UTC";
        String user = "root";
        String userPassword = "138208";

        Connection connection = DriverManager.getConnection(url, user,userPassword);
        Statement statement = connection.createStatement();

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter user id:");
        int id = scanner.nextInt();

        String sql = "DELETE FROM userinfo WHERE id="+id;


        statement.executeUpdate(sql);

        connection.close();
    }

}


//DELETE FROM table_name WHERE condition;