
/*In mathematics, the Fibonacci numbers or Fibonacci series or Fibonacci sequence are the numbers 
in the following integer sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144... 
By definition, the first two numbers in the Fibonacci sequence are 0 and 1, and each subsequent number
is the sum of the previous two. Below example shows how to create fibonacci series.
 */
public class Fibonacci {
 
    public static void main(String a[]){
         
         int fibCount = 25;
         int[] fib = new int[fibCount];
         fib[0] = 0;
         fib[1] = 1;
         for(int i=2; i < fibCount; i++){
             fib[i] = fib[i-1] + fib[i-2];
         }
 
         for(int i=0; i< fibCount; i++){
                 System.out.print(fib[i] + " ");
         }
    }
}