
/*Write a program to identify common elements or numbers between
two given arrays. You should not use any inbuilt methods are list to
find common values.
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class CommonElementsInArray {
 
    public static void main(String a[]){
        int[] arr1 = new int[]{4,7,3,9,2};
        int[] arr2 = new int[]{3,2,12,9,40,32,4};
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    System.out.println(arr1[i]);
                }
            }
        }
        //2nd way of doing this using Collections
       // Use Collection.retainAll().
        List<Integer> listA = new ArrayList<Integer>();//there is no auto boxing from int[] to Integer[]
        for (int e:arr1){listA.add(e);}// so we must add each element from array to the list
        List<Integer> listB = new ArrayList<Integer>();
        for (int e:arr2){listB.add(e);}
        /* Although originally it made sense to use Arrays.asList, there is no auto boxing of int[] to Integer[]
        List listA = Arrays.asList(arr1);System.out.println("The listA is:" + listA);
        List listB = Arrays.asList(arr2);System.out.println("The listB is:" + listB);
        * At the println line it prints something like "[[I@190d11]" which means that
        *  you have actually constructed an ArrayList that contains int arrays.
        */
        //listA.retainAll(listB); // This one modifies listA
        // listA now contains only the elements which are also contained in listB.
        //If you want to avoid that changes are being affected in listA, then you need to create a new one.
        System.out.println("The listA is:" + listA);
        System.out.println("The listB is:" + listB);
        List<Integer> common = new ArrayList<Integer>(listA);
        common.retainAll(listB);
        // common now contains only the elements which are contained in listA and listB.
        //for (Integer i:common){System.out.println(i);}
     // printing the list
        System.out.println("The list is:" + common);
    }
}