   import java.util.*
  
  
       public class Steps
       {
       public static int fib(int n)
       {
           if(n<=1)
           {
               return 1;
           }
           else return fib(n-1)+fib(n-2);
       }
       
       public static int counts(int s)
       {

           return fib(s+1);
       }


       public static void main(String[] args) {
           int s=4;
           System.out.println("steps"+counts(s));


       }