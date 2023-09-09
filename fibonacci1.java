// Print fibonacci series using loop in java.
import java.util.Scanner;

public class fibonacci1
{
     public static void main(String[] arg)
     {
          System.out.print("How many terms you found in fibonacci series : ");
          Scanner sc = new Scanner(System.in);
          int term = sc.nextInt();
          sc.close(); //closing scanner class

          // print one by one all terms of fibonacci series which is seperated by single space.
          try 
          {
               for(long i:fibonacci(term))
                    System.out.print(i+" ");               
          } 
          catch (Exception e) 
          {
               System.out.print(e);
          }  
     }
     // Create a function that take no. of terms and return fibonacci series in the form of array. 
     static long[] fibonacci(int term)
     {
          long[] fibo = new long[term];

          if(term>1)
               fibo[1]=1;

          for(int i=2;i<term;i++)
               fibo[i] = fibo[i-1]+fibo[i-2];

          return fibo;
     }
}