package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;


public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserServiceImpl us = new UserServiceImpl();
        us.createUsersTable();
        //us.dropUsersTable();
        us.saveUser("имя", "фамилия", (byte) 26);
        us.saveUser("имя2", "2фамилия", (byte) 66);
        us.saveUser("имя3", "3фамилия", (byte) 55);
        us.saveUser("имя4", "4фамилия", (byte) 15);
        System.out.println(us.getAllUsers());
        us.removeUserById(3);
        /*us.cleanUsersTable();
        System.out.println(us.getAllUsers());
        us.dropUsersTable();*/


    }
}
