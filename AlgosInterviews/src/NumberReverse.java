
public class NumberReverse {
 
    public int reverseNumber(int number){
         
        int reverse = 0;
        while(number != 0){
            reverse = (reverse*10)+(number%10);
            number = number/10;
            System.out.println("reverse=" + reverse + " , number=" + number);
        } 
        return reverse;
    }
     
    public static void main(String a[]){
        NumberReverse nr = new NumberReverse();
        System.out.println("Result: "+nr.reverseNumber(17868));
        /*
         * Output: 
         * reverse=8 , number=1786 
         * reverse=86 , number=178
         * reverse=868 , number=17
         * reverse=8687 , number=1
         * reverse=86871 , number=0
         * Result: 86871
         */
        
        //Another way using available Java API
        //Convert to String, reverse(), then convert from String to int
        int x=1234;
        String s=String.valueOf(x);
        String revString = new StringBuilder(s).reverse().toString();
        int reverseInt = Integer.parseInt(revString);
        System.out.println(reverseInt + 4);//prints correctly 4325
    }
}
