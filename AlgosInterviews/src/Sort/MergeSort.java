package Sort;

import java.util.Arrays;

/*
 * This class is different from the MergeSort in DataStructures & Algo Project.
 * It's easier to understand and the workspace equivalent is called resultArray.
 * To calculate complexity of a recursive function, We need to consider two things
1)The number of recursive calls required to solve the problem.
2)Amount of work done in each recursive call.
Number of recursive call in merge sort :
Consider a case if the input array is of size 4, then the number of recursive calls made by merge sort is 7.

Here is how it is, each mergeSort() call results in two recursive more calls - one call for each halves of the array since we split the array into two.
The first call starts off by making 2 calls. 
Each of these 2 calls in-turn make 2 more calls which makes it 4.
and so forth. till we hit the base case (which is single element array). 
So here is the pictorial representation of the above recursive calls for merge sort, you'll see that its like a balanced binary tree.
 An easy way to visualize merge sort is as a tree of recursive calls.

Here is the tree for input array of size 4.


So we see that for an array of four elements, we have a tree of depth 3.

Now try doing it for doubled the number of elements in the array i.e array size of 8, We'll have the same tree with one more level with depth increased to 4.


This suggests that the total depth of the tree is log(n), is the number of times we need to call sort routing/method recursively to reach the base case.

2)Now what is the work we do in each recursion ?
In the code above the only work we do is to call merge routine/method - So what is the complexity of merge routine/method?

Considering that given 2 arrays we are merging two array into the result array. If we just take the merge routine/method and see the complexity it would be O(n1 + n2).  

where
n1 is length of left array and
n2 is length of right array.

based on the above we may think the complexity of merge routine to be O(n) at every merge, but its NOT true.

We are dividing the array along the recursive path. So length n1 and n2 keeps changing and the complexity of merge routine/method at each call.
It is 'n' on the first call to recursion (leftArray of size n/2 and rightArray of size n/2) 
It is 'n/2' on the second call to recursion. (we merge two n/4 arrays) 
It is 'n/4' on the third call to recursion. (we merge two n/8 arrays) 
....... and so on ..... 
 till we merge just 2 items ( leftArray of size 1 and rightArray of size 1) and base case there is just one item, so no need to merge.
As you can see the first call to recursion is the only time the entire array is merged together at each level, a total of 'n' operations take place in the merge routine.

Based on the above,
there are log(n) levels of recursion(Depth of binary tree of N nodes)
a total of 'n' operations takes place in the merge routine/method at each level of recursion. 
Hence the time complexity is O(n * log(n)).
 */

public class MergeSort {  
	/// Time Complexity = O(nlog(n))     Space complexity = O(n)    

    public void sort(int[] array) {
        mergeSort(array, 0, array.length - 1);
    }

    /*
     * The mergeSort algorithm implementation
     */
    private void mergeSort(int[] array, int left, int right) {//left and right are indexes, when they are equal we have a base case(stops recursion)

        if (left < right) {

            //split the array into 2
            int center = (left + right) / 2;

            //sort the left and right array
            mergeSort(array, left, center);
            mergeSort(array, center + 1, right);

            //merge the result
            merge(array, left, center + 1, right);
        }
    }

    /*
     * The merge method used by the mergeSort algorithm implementation. To merge 2 already sorted array halves
     */
    private void merge(int[] array, int leftArrayBegin, int rightArrayBegin, int rightArrayEnd) {

        int leftArrayEnd = rightArrayBegin - 1;

        int numElements = rightArrayEnd - leftArrayBegin + 1;
        int[] resultArray = new int[numElements];//space complexity = O(N). Inside merge() we need an extra array to merge
        int resultArrayBegin = 0;

        // Find the smallest element in both these array and add it to the result
        // array i.e you may have a array of the form [1,5] [2,4]
        // We need to sort the above as [1,2,4,5]
        while (leftArrayBegin <= leftArrayEnd && rightArrayBegin <= rightArrayEnd) {// we use indexes in the whiles and array[index] compares in IF
            if (array[leftArrayBegin] <= array[rightArrayBegin]) {
                resultArray[resultArrayBegin++] = array[leftArrayBegin++];
            } else {
                resultArray[resultArrayBegin++] = array[rightArrayBegin++];
            }
        }

        // After the main loop completed we may have few more elements in
        // left array copy them first
        while (leftArrayBegin <= leftArrayEnd) {
            resultArray[resultArrayBegin++] = array[leftArrayBegin++];
        }

        // After the main loop completed we may have few more elements in
        // right array copy them
        while (rightArrayBegin <= rightArrayEnd) {
            resultArray[resultArrayBegin++] = array[rightArrayBegin++];
        }

        // Copy resultArray back to the main array
        for (int i = numElements - 1; i >= 0; i--, rightArrayEnd--) {//start from the end, i--
            array[rightArrayEnd] = resultArray[i];
        }
    }
    public static void main(String args[]) {

        System.out.println("Running mergeSort....");
        System.out.println("Running merge sort on..{7, 1, 8, 2, 0, 12, 10, 7, 5, 3}..");
        int array[] = {7, 1, 8, 2, 0, 12, 10, 7, 5, 3};

        MergeSort mergeSort = new MergeSort();

        mergeSort.sort(array);

        dumpArray(array);

        
    }

    /*
     * Utility for dumping the array
     */
    public static void dumpArray(int[] array) { 
    	System.out.println(Arrays.toString(array));

       // for (int value : array) {
        //    System.out.println(value);
        //}
    }
}
