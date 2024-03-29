import java.util.Scanner;

/*
 * A prime number (or a prime) is a natural number greater than 1 that has no positive divisors other
 *  than 1 and itself. A natural number greater than 1 that is not a prime number is called a 
 *  composite number. For example, 5 is prime, as only 1 and 5 divide it, 
 *  whereas 6 is composite, since it has the divisors 2 and 3 in addition to 1 and 6. 
 *  The fundamental theorem of arithmetic establishes the central role of primes in number theory: 
 *  any integer greater than 1 can be expressed as a 
 * product of primes that is unique up to ordering. This theorem requires excluding 1 as a prime.
 */
public class IsPrimaryNumber {

		 
	    public boolean isPrimeNumber(int number){
	         
	        for(int i=2; i<=number/2; i++){
	            if(number % i == 0){
	                return false;
	            }
	        }
	        return true;
	    }
	     
	    public static void main(String a[]){
	    	IsPrimaryNumber mpc = new IsPrimaryNumber();
	        System.out.println("Is 17 prime number? "+mpc.isPrimeNumber(17));
	        System.out.println("Is 19 prime number? "+mpc.isPrimeNumber(19));
	        System.out.println("Is 15 prime number? "+mpc.isPrimeNumber(15));
	        Scanner s = new Scanner(System.in);
	        while(true){ // ctrl-c out of the program
	        	System.out.println("Now input your integer to see if it's a Primary #? ");
	        	int n = s.nextInt();
	        	System.out.println("Is " + n + " prime number? "+mpc.isPrimeNumber(n));}
	    }
	

}
