/*
 * The binary numeral system, or base-2 number system, 
 * represents numeric values using two symbols: 0 and 1. 
 * More specifically, the usual base-2 system is a positional notation with a radix of 2. 
 * Because of its straightforward implementation in digital electronic 
 * circuitry using logic gates, the binary system is used internally by almost all modern computers.
 */
public class IsBinary {
	
		 
	    public boolean isBinaryNumber(int binary){
	         
	        boolean status = true;
	        while(true){
	            if(binary == 0){//end the while infinite loop
	                break;
	            } else {
	                int tmp = binary%10;//deals with the digit in question, rightmost always
	                if(tmp > 1){//max allowed is 1, 3 fails
	                    status = false;
	                    break;
	                }
	                binary = binary/10;//go to the next left digit
	            }
	        }
	        return status;
	    }
	     
	    public static void main(String a[]){
	    	IsBinary mbc = new IsBinary();
	        System.out.println("Is 1000111 binary? :"+mbc.isBinaryNumber(1000111));
	        System.out.println("Is 10300111 binary? :"+mbc.isBinaryNumber(10300111));
	    }
	

}
