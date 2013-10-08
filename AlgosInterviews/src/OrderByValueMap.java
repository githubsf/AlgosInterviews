/*
Sort or order a HashMap or TreeSet or any map item by value. 
Write a comparator which compares by value, not by key.
 Entry class might helps you here.
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
 
public class OrderByValueMap {// GREAT EXAMPLE OF MAP API, Entry, entrySet(),Collections.sort(list, Comparator)...
 /* OUTPUT=
  * Why this kolavari ==== 93
  * Unix ==== 67
  * C++ ==== 45
  * MAC ==== 26
  * java ==== 20
  * Java2Novice ==== 2
  */
    public static void main(String a[]){
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("java", 20);
        map.put("C++", 45);
        map.put("Java2Novice", 2);
        map.put("Unix", 67);
        map.put("MAC", 26);
        map.put("Why this kolavari", 93);
        Set<Entry<String, Integer>> set = map.entrySet();// we want to use collections.sort() with a Comparator, but it only works on list, so get a set 1st,convert to list
        List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(set);//sort works only on list, so we convert the set to list here
        Collections.sort( list, new Comparator<Map.Entry<String, Integer>>()// the Comparator is defined as an inner class, compare() override
        {
            public int compare( Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2 )
            {
                return (o2.getValue()).compareTo( o1.getValue() );//o2.compareTo.o1 means order in descending order. o1.compareTo.o2 is ascending order
            }
        } );
        for(Map.Entry<String, Integer> entry:list){//Now go through the ordered list and print
            System.out.println(entry.getKey()+" ==== "+entry.getValue());
        }
    }
}