/*
where clause use in Database in java

*/


import java.sql.*;

public class Mysql_WhereClause
{


	//step 2
	//main method
	public static void main(String args[])
	{
		//created ref 
	
		try
		{
			//step2 Register JDBC driver
			Class.forName("com.mysql.jdbc.Driver");
			
		//create connection with driver 
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Geetai?useSSL=false",
														"root","Current-Root-Password");  
														
			System.out.println("Database connected successfully");
			
			//step 4 Execute command
			
			//create stmt
			Statement stmt = con.createStatement();
						
			ResultSet  rs = stmt.executeQuery("select * from Books where Bkid >= 555");
			
			//display records using loops
			while(rs.next())
			{
			
				//retrive  by col name
				int bkid = rs.getInt("Bkid");
				String bkname = rs.getString("BkName");
				String BkAuthorName = rs.getString("BkAuthorName");
				
				//display vvalues
				System.out.print("Bkid : "+bkid +" <--> ");
				System.out.print("BkName : "+bkname +" <--> ");
				System.out.println("BkAuthorName : "+BkAuthorName);			
			}		
		}
		catch(Exception e)
		{
		
		}
	
	}



}













