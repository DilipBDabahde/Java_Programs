import java.util.Scanner;

abstract class RBI
 {
    public int Amt;
    
    public void Credit(int value)
   {
     System.out.println("Successfully creadited:"+value);
     Amt+=value;
   }
   	
   public int Dibit(int value)
   {
     if(value > Amt)
     {
      return 0;
     }
     else
     {
     System.out.println("Successfully withdrawl");
     Amt=Amt-value;
     
     return value;
    }
   }
   
   public abstract float InterestSaving();
   public abstract float InterestLoan();
   
   public static void DisplayRule()
   {
      System.out.println("PAN is compulsory");
      System.out.println("KYC is compulsory");
   }
 }
 
 class SBI extends RBI
 {
    public float InterestSaving()
    {
      return 6.4f;
    }
    
    public float InterestLoan()
    {
      return 8.3f;
    }
    
    public void SBIOFFER()
    {
      System.out.println("We offer more interst for SENIOR CITIZON");
      System.out.println("We Provide Zero Balance AC");
    } 
 }
 
 class PMP extends RBI
 {
   public float InterestSaving()
   {
     return 8.5f;
   }
   
   public float InterestLoan()
   {
     return 10.5f;
   }
   
   public void PensionScheme()
   {
      System.out.println("We provide 10k pension to senior citizon");
   } 
 }
 
 class DriverToAll
   {
     public static void main(String arg[])
     {
       Scanner sobj=new Scanner(System.in);
       RBI robj=null;
       System.out.println("Enter bank name");
       String str=sobj.nextLine();
     
       
       if(str.equals("SBI"))
       {
         robj=new SBI();
       }
       else if(str.equals("PMP"))
       {
         robj=new PMP();
       }
       
       System.out.println("Enter amount to deposite");
       int amt=sobj.nextInt();
       
       robj.Credit(amt);
       
       System.out.println("Interest for saving is "+robj.InterestSaving());
       
       robj.DisplayRule();     
     }  
   }
