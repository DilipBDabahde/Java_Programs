/*
app2
database connection created  
display existing database tables records
*/

import java.sql.*;  
class MysqlCon
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
			
			//execute the statement
			ResultSet rs = stmt.executeQuery("select * from Staff_info");  
			
			//displaying resultset records
			while(rs.next())  
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5));  
				
				System.out.println("----------------------------------------------");
			}
			
			//closing connection		
			con.close();  
		}
		catch(Exception e)  //if an exeception occure in try block then catch execute
		{
			 System.out.println(e);
		}  
	}  
}  
