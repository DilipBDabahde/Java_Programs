/*
App3

in this application we add record into Book table
*/

import java.sql.*;  
class Mysql_InsertRecord
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
			
			//create string to query/cmd
			String sql1 = "insert into Books values(213, 'C++', 'Bjarne Stroustrup')";			
			stmt.executeUpdate(sql1); //this method call insert records into table
			
			String sql2 = "Insert into Books values(555, 'Python', 'Guido Van Rossum')";
			stmt.executeUpdate(sql2);
			
			String sql3 = "insert into Books values(1010, 'C Programming', 'K & R')";
			stmt.executeUpdate(sql3);
		
			System.out.println("Records added successfully");
			//closing connection		
			con.close();  
		}
		catch(Exception e)  //if an exeception occure in try block then catch execute
		{
			 System.out.println(e);
		}  
	}  
}  
