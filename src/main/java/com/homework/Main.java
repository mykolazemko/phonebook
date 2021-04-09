package com.homework;

import java.sql.*;

public class Main {
    public static void main(String[] args) {

        try{
            ConsoleMenu menu = new ConsoleMenu();
            menu.enterNum();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

}