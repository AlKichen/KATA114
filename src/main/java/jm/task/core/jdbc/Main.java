package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;


public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserServiceImpl us = new UserServiceImpl();
        us.createUsersTable();
        us.saveUser("имя", "фамилия", (byte) 26);
        us.saveUser("имя", "фамилия", (byte) 26);
        us.saveUser("имя", "фамилия", (byte) 26);
        us.saveUser("имя", "фамилия", (byte) 26);
        System.out.println(us.getAllUsers());
        us.removeUserById(3);
        us.cleanUsersTable();
        System.out.println(us.getAllUsers());
        us.dropUsersTable();


    }
}
