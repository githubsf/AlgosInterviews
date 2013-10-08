import java.util.Arrays;

public class FindMiddleIndex {
	/*
	 * You are given an array of numbers. Find out the array
	 *  index or position where sum of numbers preceding the index
	 *   is equals to sum of numbers succeeding the index.
	 */
public static int findMiddleIndex(int[] numbers) throws Exception {
        // 2 indexes: startIndex for Left group, endIndex for Right group
	    // Must check the startIndex is not > than endIndex
        int endIndex = numbers.length - 1;
        int startIndex = 0;
        int sumLeft = 0;
        int sumRight = 0;
        // In an infinite loop compare the Left & Right Sums, if one is larger, 
        // add to the opposite Sum using the proper index(startIndex for L or endIndex for R,always increment startIndex, decrement endIndex)
        // You will stop when the startIndex has crossed (>) the endIndex & The Sums are equal. The "endIndex" is the one you want.
        // The two Ifs in the while(true) loop both check for 1st ) Sum and 2nd ) Index from the left being > than the right group.
        while (true) {
            if (sumLeft > sumRight) {
                sumRight += numbers[endIndex--];
            } else {
                sumLeft += numbers[startIndex++];
            }
            if (startIndex > endIndex) {
                if (sumLeft == sumRight) {
                    break;
                } else {
                    throw new Exception(
                            "Please pass proper array to match the requirement");
                }
            }
        }
        return endIndex;
    }
 
    public static void main(String a[]) {
        int[] num = { 2, 4, 4, 5, 4, 1 };
        try {
        	System.out.println("Array is : " + Arrays.toString(num));
            System.out.println("Starting from index 0, adding numbers till index "
                            + findMiddleIndex(num) + " and");
            System.out.println("adding rest of the numbers can be equal");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}