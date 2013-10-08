import java.util.Scanner;

/*
 * Below example shows how to find out sum of each digit in the given number using recursion logic.
 *  For example, if the number is 259, then the sum should be 2+5+9 = 16.
 */
public class SumDigitsRecursive {
	
		 
	    int sum = 0;
	     
	    public int getNumberSum(int number){
	         
	        if(number == 0){
	            return sum;
	        } else {
	            sum += (number%10);
	            getNumberSum(number/10);
	        }
	        return sum;
	    }
	     
	    public static void main(String a[]){
	    	Scanner s = new Scanner(System.in);
			System.out.println("What is the integer number? ");
			int n = s.nextInt();
	    	SumDigitsRecursive  mns = new SumDigitsRecursive();
	        System.out.println("Sum is: "+mns.getNumberSum(n));
	    }
	

}
