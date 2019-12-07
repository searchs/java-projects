package com.ohprice.jvmworld;

import java.sql.Connection;
import java.sql.DriverManager;


/**
 * JsonToJava
 */
public class App {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String user = "root"; //of course this should be read from config
        String password = "root"; //red from config
        //com.mysql.cj.jdbc.Driver
        Class.forName("com.mysql.cj.jdbc.Driver"); //load the driver dynamically
        Connection conn = null;

        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Business", user, password);
        Statement st = conn.createStatement();

        ResultSet resultSet = st.executeQuery("SELECT * FROM Customerinfo LIMIT 3;");


        while(resultSet.next()) {
            System.out.println(resultSet.getString(1));
            System.out.println(resultSet.getString(2));
            System.out.println(resultSet.getInt(3));
            System.out.println(resultSet.getString(4));
        }
        conn.close();
    }

    /**
     * Read and print ResultSet
     * @param rs
     */
    private void printCustomerRowData(ResultSet rs) {
        while (rs.next()) {
            System.out.println(rs.getString(1));
            System.out.println(rs.getString(2));
            System.out.println(rs.getInt(3));
            System.out.println(rs.getString(4));
        }
    }
}
