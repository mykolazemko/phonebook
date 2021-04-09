package com.homework;

import java.util.Scanner;
import java.sql.*;

public class ConsoleMenu {

    public void enterNum() throws SQLException{

            AddUser addUser = new AddUser();
            PrintUsersList printUser = new PrintUsersList();
            DeleteUser deleteUser = new DeleteUser();

        Scanner scanner = new Scanner(System.in);
        String div = "____________________";
        boolean loop = true;
        while (loop){

            System.out.println("Press [1] to Show All Contacts \n" +
                    "Press [2] to Add New Contact \n" +
                    "Press [3] to Delete Contact \n" +
                    "Press [4] to Exit");

            if (scanner.hasNextInt()){
                int n = scanner.nextInt();
                switch (n){
                    case 1:
                        System.out.println("Contacts List:");
                        printUser.printUser();
                        System.out.println(div);
                        break;
                    case 2:
                        System.out.println("Add New Contact");
                        addUser.adduser();
                        System.out.println(div);
                        System.out.println("Contact added successfully");
                        break;
                    case 3:
                        System.out.println("Delete Contact");
                        deleteUser.deleteUser();
                        System.out.println("Contact deleted");
                        System.out.println(div);
                        break;
                    case 4:
                        System.out.println("Exit");
                        loop = false;
                    default:
                }
            } else{
                System.out.println("Enter Integer Number!");
                loop = false;
            }
        }
    }
}
