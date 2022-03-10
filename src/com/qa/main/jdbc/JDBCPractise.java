package com.qa.main.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.apache.logging.log4j.*;
import java.sql.Statement;


public class JDBCPractise {
	
	public static final Logger LOGGER = Logger.getLogger(JDBCPractise.class.getName());

    private String jdbcConnectionURL;
    private String username;
    private String password;

    public JDBCPractise(String username, String password) {
        jdbcConnectionURL = "jdbc:mysql://localhost:3306/ims";
        this.username = username;
        this.password = password;
    }

    public JDBCPractise(String jdbcConnectionURL, String username, String password) {
        this.jdbcConnectionURL = jdbcConnectionURL;
        this.username = username;
        this.password = password;
    }

    public void readAll() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(jdbcConnectionURL, username, password);
        } catch (SQLException e) {
            LOGGER.debug(e.getStackTrace());
        } finally {
            try {
                if(conn != null) {
                    conn.close();
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
    
    public void create(Customer customer) {
        try(Connection conn = DriverManager.getConnection(jdbcConnectionURL, username, password);
                Statement statement = conn.createStatement()) {

            statement.executeUpdate("INSERT INTO customers(first_name, surname) VALUES('" +
                customer.getFirstName() + "','" + customer.getSurname() + "')");
        } catch (SQLException e) {
            LOGGER.debug(e.getStackTrace());
        }
    }
}