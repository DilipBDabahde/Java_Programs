import java.sql. * ;

class Connect {
    public static void main(String args[]) {
        try 
        {
            String dbUrl = "jdbc:mysql://localhost:3306/STD?";
            String username = "root";
            String password = "Password"; //need to add here password to accept DBMS
            Class.forName("com.mysql.jdbc.Driver");
            Connection myconnection = DriverManager.getConnection(dbUrl, username, password);
            Statement mystatement = myconnection.createStatement();
            ResultSet myresultset = mystatement.executeQuery("select * from subject");
            System.out.println("Connected");
            while (myresultset.next())
            {           
                System.out.println("SubName: " + myresultset.getString("sub_name")+" "+"\nSubID : " + myresultset.getInt("sub_id"));               
            }

        }
        catch(Exception e) 
        {
            System.out.println(e);
        }
    }
}
