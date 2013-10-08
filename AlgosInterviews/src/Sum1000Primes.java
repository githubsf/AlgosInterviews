
public class Sum1000Primes {

		 
	    public static void main(String args[]){
	         
	        int number = 2;
	        int count = 0;
	        long sum = 0;
	        while(count < 1000){
	            if(isPrimeNumber(number)){ 
	                sum += number;
	                count++;
	                System.out.println(count + ")  " + number);
	            }
	            number++;
	        }
	        System.out.println("Sum=" + sum);
	    }
	     
	    private static boolean isPrimeNumber(int number){
	         
	        for(int i=2; i<=number/2; i++){
	            if(number % i == 0){
	                return false;
	            }
	        }
	        return true;
	    }
	
}
