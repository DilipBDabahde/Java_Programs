//in this program we Know the use of Stack in java 


import java.util.Stack;
import java.util.Scanner;

public class Stack_Pop 
{
    public static void main(String a[]){
        
        
        Integer intArr[];
        
        Scanner s=new Scanner(System.in);
        System.out.println("Enter size of array");
        int size=s.nextInt();
        
        if(size !=0)
        {
        System.out.printf("Enter values for stack\n");
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0;i<size;i++){
            stack.push(s.nextInt());	
        }
        
        System.out.println("Non-Empty stack : "  + stack);
        
        System.out.println("Enter index to remove values");
        int x=s.nextInt();
        
        stack.remove(x);        
        System.out.println("Non-Empty stack : "  + stack); //given index value will be removed
        
       
        if(stack.size() != 0)
        {
        System.out.println("Pop() is used");
        stack.pop(); //last values enterd value will be removed
        System.out.println("Non-Empty stack : "  + stack);
        }
       }
       else
       {
        System.out.println("Stack is empty");
       }
 }
}
