/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author user
 */
public class HibernateUtil {

    private static final SessionFactory sessionFactory;
    
    static {
        try {
//            
//            String databaseURL = "jdbc:mysql://johnny.heliohost.org:3306/krlwfdrs_db_firecast_community";
//            String user = "krlwfdrs_user";
//            String password = "teste";
//        Connection conn = null;
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            conn = DriverManager.getConnection(databaseURL, user, password);
//            if (conn != null) {
//                System.out.println("Connected to the database");
//            }
//        } catch (ClassNotFoundException ex) {
//            System.out.println("Could not find database driver class");
//            ex.printStackTrace();
//        } catch (SQLException ex) {
//            System.out.println("An error occurred. Maybe user/password is invalid");
//            ex.printStackTrace();
//        } finally {
//            if (conn != null) {
//                try {
//                    conn.close();
//                } catch (SQLException ex) {
//                    ex.printStackTrace();
//                }
//            }
//        }
//            
//            try {
//
//            Statement sqlStatement = conn.createStatement();
//            String readRecordSQL = "select * from cidade;";  
//            ResultSet myResultSet = sqlStatement.executeQuery(readRecordSQL);
//            while (myResultSet.next()) {
//                System.out.println("Record values: " + myResultSet.getString("WORK_ORDER_NO"));
//            }
//            myResultSet.close();
//            conn.close();
//
//        } catch (Exception e) {
//            System.out.println(e);
//        }      
            
            
            // Create the SessionFactory from standard (hibernate.cfg.xml) 
            // config file.
            sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            // Log the exception. 
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
