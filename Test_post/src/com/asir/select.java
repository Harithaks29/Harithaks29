package com.asir;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;


public class select {
	   public static void main( String args[] ) {
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
	         
	        
	  
	         ResultSet rss = stmt.executeQuery( "SELECT * FROM MOVIE;" );
	         Movies obj=new Movies();
	         List<Movies> movies=new List<Movies>();
	         while ( rss.next() ) {
	        	 obj.setId( rss.getInt("id"));
	        	 obj.setName(rss.getString("name"));
	        	 obj.setType(rss.getString("type"));
	        	 obj.setLanguage(rss.getString("language"));
	        	 obj.setPay(rss.getInt("pay"));
	        	 movies.add(obj);
	        	
	         }
        	 System.out.println(movies);
	         rss.close();
	         stmt.close();
	         stmt=c.createStatement();

	         String  sql = "INSERT INTO LANGUAGE (ID,USERNAME,DATE,MOVIE) "
			            + "VALUES (1,'HARITHA','2023-01-01','' );";
	         stmt.executeUpdate(sql);
	         c.close();
	      } catch ( Exception e ) {
	         System.err.println( e.getClass().getName()+": "+ e.getMessage() );
	         System.exit(0);
	      }
	      System.out.println("Operation done successfully");
	   }
	}

