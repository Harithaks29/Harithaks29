package com.asir;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSetMetaData;
import java.sql.ResultSet;

public class Sqlconnection {
	Connection c = null;
    java.sql.Statement stmt=null;
    public  void myConnection() {
    try {
       Class.forName("org.postgresql.Driver");
       Connection con = DriverManager
          .getConnection("jdbc:postgresql://localhost:5432/moviedb",
          "postgres", "admin");

       String sql = ("SELECT * FROM movie;");
       ResultSet sfa = stmt.executeQuery(sql);
       //sfa.first();
       ResultSetMetaData metaData = sfa.getMetaData();
       Integer columnCount = metaData.getColumnCount();
       System.out.println(columnCount);
 
       stmt.close();
       //c.close();
       //stmt.executeUpdate(sql);
       //stmt.close();
    } catch (Exception e) {
       e.printStackTrace();
       System.err.println(e.getClass().getName()+": "+e.getMessage());
       System.exit(0);
    }
   System.out.println("Opened database successfully");
    
	
    //return stmt ;
    

 }

}


