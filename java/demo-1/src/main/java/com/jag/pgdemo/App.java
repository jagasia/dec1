package com.jag.pgdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException
    {
    	Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","password");
    	ResultSet rs = con.createStatement().executeQuery("SELECT * FROM Employee");
    	while(rs.next())
    	{
    		System.out.println(rs.getString(1)+"\t"+rs.getString(2));
    	}
        System.out.println( "Hello World!" );
    }
}
