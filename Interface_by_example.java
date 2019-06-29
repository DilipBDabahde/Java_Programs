//interface use in java  // all methods in interface by default consider as abstract so that we can's created object of interface


import java.util.Scanner;

interface bank
 {  
    
    public void Credit(int no);  //abstract method
    public void Debit(int no);//abstract method
    public void Rules(); //abstract method
 }
 
 class SBI implements bank	//in this class we craeted interface method bcs we implemets interface
 {
    public int amt;
    public void Credit(int no)		//concreated
    {
       amt=amt+no;
       System.out.println("Successfully creadited:"+amt);    
    }
    
    public void Debit(int no)	//concreated
    {
      System.out.println("Successfully Withdraw:"+no);    
    } 
    
    public void Rules()		//concreated
    {
      System.out.println("PAN Is compulsory");    
    }
 }
 
 class ICICI implements bank  //in this class we craeted interface method bcs we implemets interface
 { 
    public int amt;
    public void Credit(int no)		//concreated
    {
       amt=amt+no;
       System.out.println("Successfully creadited:"+amt);    
    }
    
    public void Debit(int no)		//concreated
    {
      System.out.println("Successfully Withdraw:"+no);    
    } 
    
    public void Rules()		//concreated
    {
      System.out.println("PAN Is compulsory");    
    }
 }
 
 
 class Manager
 {
    public static void main(String arg[])
     {
       Scanner s=new Scanner(System.in);
       bank bobj=null;
       System.out.println("Enter bank name");
       String str=s.nextLine();
       
       if(str.equals("ICICI"))
       {
         bobj=new ICICI();
       }
       else if(str.equals("SBI"))
       {
         bobj=new SBI();
       }
       
       System.out.println("Enter amount");
       int money=s.nextInt();
       bobj.Credit(money);
       bobj.Rules();   
     }
 
 }
 
 
