/*
 * Write a program to find top two maximum numbers in the
given array. You should not use any sorting functions. You
should iterate the array only once. You should not use any
kind of collections in java.
 */
public class TwoMaxNumbers {
 
    public void printTwoMaxNumbers(int[] nums){
        int maxOne = 0;
        int maxTwo = 0;
        for(int n:nums){
        	System.out.println("At the beg of for loop: n="+n+ " , maxOne=" + 
                                maxOne + " , maxTwo= " +maxTwo);
            if(maxOne < n){//handles cases where maxTwo < maxOne < n
                maxTwo = maxOne;
                maxOne =n;
            } else if(maxTwo < n){//handles cases where maxTwo < n < maxOne
                maxTwo = n;
            }//the case where n<maxtwo<maxOne is ignored as we dont need to update
            System.out.println("At the end of for loop: n="+n+ " , maxOne=" + 
                    maxOne + " , maxTwo= " +maxTwo + "\n");
        }
        System.out.println("First Max Number: "+maxOne);
        System.out.println("Second Max Number: "+maxTwo);
    }
     /*
      *
      * At the beg of for loop: n=5 , maxOne=0 , maxTwo= 0
At the end of for loop: n=5 , maxOne=5 , maxTwo= 0

At the beg of for loop: n=34 , maxOne=5 , maxTwo= 0
At the end of for loop: n=34 , maxOne=34 , maxTwo= 5

At the beg of for loop: n=78 , maxOne=34 , maxTwo= 5
At the end of for loop: n=78 , maxOne=78 , maxTwo= 34

At the beg of for loop: n=2 , maxOne=78 , maxTwo= 34
At the end of for loop: n=2 , maxOne=78 , maxTwo= 34

At the beg of for loop: n=45 , maxOne=78 , maxTwo= 34
At the end of for loop: n=45 , maxOne=78 , maxTwo= 45

At the beg of for loop: n=1 , maxOne=78 , maxTwo= 45
At the end of for loop: n=1 , maxOne=78 , maxTwo= 45

At the beg of for loop: n=99 , maxOne=78 , maxTwo= 45
At the end of for loop: n=99 , maxOne=99 , maxTwo= 78

At the beg of for loop: n=23 , maxOne=99 , maxTwo= 78
At the end of for loop: n=23 , maxOne=99 , maxTwo= 78

First Max Number: 99
Second Max Number: 78
      */
    public static void main(String a[]){
        int num[] = {5,34,78,2,45,1,99,23};
        TwoMaxNumbers tmn = new TwoMaxNumbers();
        tmn.printTwoMaxNumbers(num);
    }
}
