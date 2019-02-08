package com.lara;
import java.sql.*;//for relevent classes and interfaces 
class M1 
{
	public static void main(String[] args) throws Exception
	{
		String driverClass="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:XE";
		String username="system";
		String password="5858";

		Class.forName(driverClass);    //driver registeration       
		Connection con=DriverManager.getConnection(url,username,password); //set connection
		Statement stmt=con.createStatement();   //create statement
        String sql="CREATE TABLE LARA_TAB1(SNO NUMBER,NAME VARCHAR(90),AGE NUMBER)";//sql query
		stmt.execute(sql); //executing query
		System.out.println(" done!");
	}
}
