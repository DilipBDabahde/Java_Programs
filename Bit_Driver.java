//accept two number from user and from first number take first 2byte and from second number take last 2byte and from third num

class Bitwise
 {
   public  int iNo1;
   public  int iNo2;
 
   
    public Bitwise(int i,int j)
    {
        iNo1=0xd5cbdbbd;
        iNo2=0xb1fab927;
    }  
    
    public void Bit()
    {
      int imask1=0xffff0000;
      int imask2=0x0000ffff;
      
      System.out.println("Before change\n----------------------------------------------\n");
      System.out.println("Value of iNo1 :"+iNo1);      
      System.out.println("Value of iNo2 :"+iNo2);            
      System.out.println("Value of imask1 :"+imask1);      
      System.out.println("Value of imask2 :"+imask2);
      
      iNo1=iNo1 & imask1;
      iNo2=iNo2 & imask2;
       
      int Ians=iNo1 | iNo2; 
      
      System.out.println("After change\n----------------------------------------------\n");
      System.out.println("Value of iNo1 :"+iNo1); 
      System.out.println("Value of iNo2 :"+iNo2);           
      System.out.println("Value of imask1 :"+imask1);     
      System.out.println("Value of imask2 :"+imask2); 
      System.out.println("Answer is: "+Ians	); 
      
      
      System.out.println("----------------------------------------------");
     
    }
     
 
 }
 
 class Bit_Driver
 {
 
   public static void main(String arg[])
   {
      Bitwise obj=new Bitwise(10,20);  
      obj.Bit();
   }
 
 }
