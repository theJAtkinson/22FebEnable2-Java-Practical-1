package com.qa.main.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.sql.Statement;
import java.sql.*;



public class JDBCPractise {
	
	public static final Logger LOGGER = LogManager.getLogger(JDBCPractise.class);

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
            //Add whatever code to be executed here.
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
    
    /**
     * CREATE in SQL
     * @param customer Customer object which in this case consists of a fname and lname.
     */
    public void create(Customer customer) {
        try(Connection conn = DriverManager.getConnection(jdbcConnectionURL, username, password);
                Statement statement = conn.createStatement()) {

            statement.executeUpdate("INSERT INTO customers(first_name, surname) VALUES('" +
                customer.getFirstName() + "','" + customer.getSurname() + "')");
        } catch (SQLException e) {
            LOGGER.debug(e.getStackTrace());
        }
    }
    
    /**
     * returns a customer from the resultset.
     * 
     * @param resultSet
     * @return
     * @throws SQLException
     */
    public Customer customerFromResultSet(ResultSet resultSet) throws SQLException {
        Long id = resultSet.getLong("id");
        String firstName = resultSet.getString("first_name");
        String surname = resultSet.getString("surname");
        return new Customer(id, firstName, surname);
    }

    /** Finds a customer object from the table using customer's id.
     * 
     * @param id
     * @return
     */
    public Customer readCustomer(Long id) {
        try(Connection conn = DriverManager.getConnection(jdbcConnectionURL, username, password);
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT FROM customers WHERE id = " + id)) {

            resultSet.next();
            return customerFromResultSet(resultSet);
        } catch (SQLException e) {
            LOGGER.debug(e.getStackTrace());
        }
        return null;
    }
    
    /**updates customer in the table using customer object as input. Returns the customer's new object.
     * 
     *
     * @return Customer
     */
    public Customer update(Customer customer) {
        try(Connection conn = DriverManager.getConnection(jdbcConnectionURL, username, password);
            Statement statement = conn.createStatement()) {

            statement.executeUpdate("UPDATE customer SET first_name = '" + customer.getFirstName()
                + "', surname = '" + customer.getSurname() + "' WHERE id = " + customer.getId());
                return readCustomer(customer.getId());
        } catch (SQLException e) {
            LOGGER.debug(e.getStackTrace());
        }
        return null;
    }
    
    /**
     * Delete whatever customer is at specific customer id.
     * @param id
     */
    public void delete(Long id) {
        try (Connection conn = DriverManager.getConnection(jdbcConnectionURL, username, password);
            Statement statement = conn.createStatement()) {

            statement.executeUpdate("DELETE FROM customers WHERE id = " + id);
        } catch (SQLException e) {
            LOGGER.debug(e.getStackTrace());
        }
    }
    
    /**
     * In this method, we are using a try-with-resources statement and passing it a connection as we have done previously.
	 * <p>
	 * We are also passing it a variable called statement of type PreparedStatement which is being instantiated with conn.prepareStatement.
	 * <p>
	 * In the prepareStatement method call we are passing it our SQL query, however instead of hard coding the values we are setting the values as "?".
	 * <p>
	 * Inside the try block we are then setting each of the two values we want in the SQL statement, giving it a number, which is the place of the variable in the order (1 is the first variable and so on), and a value (in this case it is a String as we used the setString method, there are other set methods for different types).
	 * <p>
	 * If an SQLException is thrown from within the try block then we are catching it and printing it using the LOGGER.
     * @param customer
     */
    public void createPrepared(Customer customer) {
        try(Connection conn = DriverManager.getConnection(jdbcConnectionURL, username, password);
            PreparedStatement statement = conn.prepareStatement("INSERT INTO customer VALUES(?,?)")) {

            statement.setString(1, customer.getFirstName());
            statement.setString(2, customer.getSurname());
            statement.executeUpdate();
        } catch (SQLException e) {
            LOGGER.debug(e.getStackTrace());
        }
    }
}