// Find nth element from fibonacci series using loop in java.
import java.util.Scanner;

public class fibonacci2
{
     public static void main(String[] arg)
     {
          System.out.print("Which term you get from fibonacci series : ");
          Scanner sc = new Scanner(System.in);
          int term = sc.nextInt();
          sc.close(); //closing scanner class

          if(term>0)
               System.out.println(fibonacci(term));
          else
               System.out.println("something went wrong.");
          
     }
     // Create a function that take term and return nth element of fibonacci series. 
     static long fibonacci(int term)
     {
          long f1=0, f2=1, fn=0;

          if(term==1 || term==2)
               return term-1;

          for(int i=2;i<term;i++)
          {
               fn = f1+f2;
               f1 = f2;
               f2 = fn;
          }
          return fn;
     }
}