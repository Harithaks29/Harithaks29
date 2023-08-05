package com.asir;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Insert {
	   public static void main(String args[]) {
	      Connection c = null;
	      Statement stmt = null;
	      try {
	         Class.forName("org.postgresql.Driver");
	         c = DriverManager
	            .getConnection("jdbc:postgresql://localhost:5432/moviedb",
	            "postgres", "admin");
	         c.setAutoCommit(false);
	         System.out.println("Opened database successfully");

	         stmt = c.createStatement();
	 	    
	 	    String 
	         
	         sql = "INSERT INTO MOVIE (ID,NAME,TYPE,PAY,LANGUAGE) "
			            + "VALUES (1,'THERI','ACTION',150,'tamil' );";
	         stmt.executeUpdate(sql);
	         
	         sql = "INSERT INTO MOVIE (ID,NAME,TYPE,PAY,LANGUAGE) "
			            + "VALUES (2,'ENGLISH' );";
	         stmt.executeUpdate(sql);
	         
	         sql = "INSERT INTO MOVIE (ID,NAME,TYPE,PAY,LANGUAGE) "
			            + "VALUES (3,'HINDI' );";
	         stmt.executeUpdate(sql);
	         
	         sql = "INSERT INTO MOVIE (ID,NAME,TYPE,PAY,LANGUAGE) "
			            + "VALUES (4,'MALAYALAM' );";
	         stmt.executeUpdate(sql);
	         
	         
	         stmt.close();
	         c.commit();
	         c.close();
	      } catch (Exception e) {
	         System.err.println( e.getClass().getName()+": "+ e.getMessage() );
	         System.exit(0);
	      }
	      System.out.println("Records created successfully");
	   }
	}


