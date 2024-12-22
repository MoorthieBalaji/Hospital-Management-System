package com.kce.util;
import java.sql.*;
public class HospitalManagementConnection{
public static Connection DBconnect()
{
	   Connection con=null;
       try {
       Class c=Class.forName("com.mysql.cj.jdbc.Driver");
       String url = "jdbc:mysql://localhost:3306/Hospital"; // Replace with your MySQL database name
       String username = "root"; // Replace with your MySQL username
       String password = "root"; // Replace with your MySQL password
       con=DriverManager.getConnection(url,username,password);
       }catch(Exception e)
	   {
		System.out.println(e);
	   }
       return con;
}
}