/*
app2
in this application we create table only inside provided database 
*/

import java.sql.*;  
class Mysql_CreateTable
{  
	public static void main(String args[])
	{ 
		try
		{ 
			//register driver
			Class.forName("com.mysql.jdbc.Driver");  
			
			//create connection with driver 
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Geetai?useSSL=false",
														"root","Current-Root-Password");  
														
			//root is user name and password is : Current-Root-Password
			//craate sql statement
			Statement stmt = con.createStatement();  
			
			
			//statement to create table inside database
			int n = stmt.executeUpdate("create table Books(Bkid int, BkName varchar(255), BkAuthorName varchar(255))");
			
			System.out.println("Table created Successfully");	
			
			
			//closing connection		
			con.close();  
		}
		catch(Exception e)  //if an exeception occure in try block then catch execute
		{
			 System.out.println(e);
		}  
	}  
}  
