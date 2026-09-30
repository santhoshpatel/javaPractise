package com.java.test;

import java.sql.*;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DBConnection {

    // JDBC URL, username, and password (update as per your DB)
    private static final String URL = "jdbc:mysql://localhost:3306/testdb";
    private static final String USER = "root";
    private static final String PASSWORD = "password";

    // Singleton instance
    private static DBConnection instance;

    // JDBC Connection object
    private Connection connection;

    // Private constructor to prevent instantiation
    private DBConnection() {
        try {
            // Load MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create the connection
            this.connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Database connected successfully!");

        } catch (ClassNotFoundException e) {
            System.err.println("MySQL JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("Failed to connect to the database.");
            e.printStackTrace();
        }
    }

    /**
     * Returns the singleton instance of com.java.test.DBConnection.
     * Thread-safe with synchronized block.
     */
    public static DBConnection getInstance() {
        if (instance == null) {
            synchronized (DBConnection.class) {
                if (instance == null) {
                    instance = new DBConnection();
                }
            }
        }
        return instance;
    }

    /**
     * Returns the JDBC connection.
     */
    public Connection getConnection() {
        return connection;
    }

    public static class tests {
        static void main() {
        String s="swiss";
            List<Integer> list = Arrays.asList(1, 2, 2, 2, 2, 38, 8, 6, 4, 2, 11);
            Map<Character, Long> freequencyChar = s.chars().mapToObj(c -> (char) c)
                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
           Character characterStream = s.chars().mapToObj(c -> (char) c)
                    .filter(e -> freequencyChar.get(e) == 1)
                   .findFirst().orElse(null);
            System.out.println(characterStream);
            Map<Integer, Long> collect = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
            Integer i = list.stream().filter(e -> collect.get(e) == 1).findFirst().orElse(null);
            System.out.println(i);





        }
    }
}