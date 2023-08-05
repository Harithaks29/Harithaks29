package com.asir;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class PostgreSQLJDBC {
	   public static void main( String args[] ) {
	      Connection c = null;
	      Statement stmt = null;
	      try {
	         Class.forName("org.postgresql.Driver");
	         c = DriverManager
	            .getConnection("jdbc:postgresql://localhost:5432/moviedb",
	            "postgres", "admin");
	         System.out.println("Opened database successfully");

	         stmt = c.createStatement();
            String sql = "CREATE TABLE MOVIERENTAL " +
	         "(ID INT PRIMARY KEY     NOT NULL," +
           " USERNAME  CHAR(50),"+ " Date  DATE,"+"NAME VARCHAR(30)  REFERENCES MOVIE(NAME))";
         stmt.executeUpdate(sql);
	         
//	         String sql = "CREATE TABLE MOVIE " +
//	                 "(ID INT PRIMARY KEY     NOT NULL," +
//	                 " NAME   VARCHAR(50) UNIQUE,"+ " TYPE VARCHAR(30),"+"PAY INT,"+"LANGUAGE VARCHAR(30))";
//	     	         stmt.executeUpdate(sql);
	         stmt.close();
	         c.close();
	      } catch ( Exception e ) {
	         System.err.println( e.getClass().getName()+": "+ e.getMessage() );
	         System.exit(0);
	      }
	      System.out.println("Table created successfully");
	   }
	}


