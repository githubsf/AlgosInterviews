import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
	 
public class FindDuplicateInRange1toN {
	/*
	 * You have got a range of numbers between 1 to N, where one of 
	 * the number is repeated. You need to write a program to find out
	 *  the duplicate number.
	 */
	// The key is that 1 + 2 + 3 + ... + N is = N * (N+1)/2
	
	 
	    public int findDuplicateNumber(List<Integer> numbers){
	         
	        int highestNumber = numbers.size() - 1;
	        int total = getSum(numbers);
	        int duplicate = total - (highestNumber*(highestNumber+1)/2);
	        return duplicate;
	    }
	     
	    public int getSum(List<Integer> numbers){
	         
	        int sum = 0;
	        for(int num:numbers){
	            sum += num;
	        }
	        return sum;
	    }
	     
	    public static void main(String a[]){
	    	// Get the list of numbers from user
			Scanner s = new Scanner(System.in);
			System.out.println("What is the max integer number(N)in your 1-N range? ");
			int n = s.nextInt();
	        List<Integer> numbers = new ArrayList<Integer>();
	        for(int i=1;i<=n;i++){
	            numbers.add(i);
	        }
	        //add duplicate number into the list
	        int dup=1 + (int)(Math.random() * (( n - 1) + 1));
	        System.out.println("Generating Random Duplicate Number in the range 1-" + n +": " + dup);
	        numbers.add(dup);
	        FindDuplicateInRange1toN dn = new FindDuplicateInRange1toN();
	        System.out.println("Found Duplicate Number: "+dn.findDuplicateNumber(numbers));
	    }
	
}
