package com.eslam.webservices;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

@SpringBootApplication
public class WebServicesApplication implements ApplicationRunner {

    public static void main(String[] args) {
        SpringApplication.run(WebServicesApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/eslam?user=root&password=Eslam_01226596904");

            //Statement is created from the JDBC Connection object
            Statement stmt = con.createStatement();

            //A sample DDL statement execution
            stmt.executeUpdate("CREATE TABLE EMPLOYEE (EMP_ID  NUMBER NOT NULL, EMP_NAME VARCHAR)");


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
