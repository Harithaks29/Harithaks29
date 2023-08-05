package com.sample.create;

import java.sql.Connection;
import java.sql.Statement;

import com.sample.connection.Connect;

public class Insert extends Connect {
	Connection c = null;
    Statement stmt = null;
	   public void insertion() {
		   Connect obj = new Connect();
		   Statement stmt = obj.connection();
		   
		   try {

	         String sql = "INSERT INTO COMPANY (ID,NAME,AGE,ADDRESS,SALARY) "
	            + "VALUES (9, 'Paul', 32, 'California', 20000.00 );";
	         stmt.executeUpdate(sql);

	         sql = "INSERT INTO COMPANY (ID,NAME,AGE,ADDRESS,SALARY) "
	            + "VALUES (10, 'Allen', 25, 'Texas', 15000.00 );";
	         stmt.executeUpdate(sql);

	         sql = "INSERT INTO COMPANY (ID,NAME,AGE,ADDRESS,SALARY) "
	            + "VALUES (11, 'Teddy', 23, 'Norway', 20000.00 );";
	         stmt.executeUpdate(sql);

	         sql = "INSERT INTO COMPANY (ID,NAME,AGE,ADDRESS,SALARY) "
	            + "VALUES (12, 'Mark', 25, 'Rich-Mond ', 65000.00 );";
	         stmt.executeUpdate(sql);

	         stmt.close();
	 
	    
	      } catch (Exception e) {
	         System.err.println( e.getClass().getName()+": "+ e.getMessage() );
	         System.exit(0);
	      }
	      System.out.println("Records created successfully");
	   }
}


