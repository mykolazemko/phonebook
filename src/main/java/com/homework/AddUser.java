package com.homework;

import java.sql.*;
import java.util.Scanner;

public class AddUser {
    public void adduser() throws SQLException{
        String url = "jdbc:mysql://localhost:3306/usercontacts?serverTimezone=UTC";
        String user = "root";
        String userPassword = "138208";

        Connection connection = DriverManager.getConnection(url, user,userPassword);

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter name:");
        String name = scanner.nextLine();
        System.out.println("enter telephone:");
        int telephone = scanner.nextInt();

        String sql = "INSERT INTO userinfo (name, telephone) VALUES (?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, name);
        preparedStatement.setInt(2, telephone);

        preparedStatement.executeUpdate();

        connection.close();
    }
}
