

import java.util.Arrays;

public class MyArrayListImpl {
	//MUST Implement: add(o),remove(index),get(index),size(),
	// increaseListSize()
 
    private Object[] myStore;//an array of objects
    private int actSize = 0;
     
    public MyArrayListImpl(){
        myStore = new Object[10];
    }
     
    public Object get(int index){
        if(index < actSize){
            return myStore[index];
        } else {
            throw new ArrayIndexOutOfBoundsException();//in java.util.Arrays
        }
    }
     
    public void add(Object obj){
        if(myStore.length-actSize <= 5){
            increaseListSize();
        }
        myStore[actSize++] = obj;
    }
     
    public Object remove(int index){
        if(index < actSize){
            Object obj = myStore[index];
            myStore[index] = null;
            int tmp = index;
            while(tmp < actSize){
                myStore[tmp] = myStore[tmp+1];//move cells from index to end to left,
                myStore[tmp+1] = null;
                tmp++;
            }
            actSize--;//1 less element 
            return obj;
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
         
    }
     
    public int size(){
        return actSize;
    }
     
    private void increaseListSize(){
        myStore = Arrays.copyOf(myStore, myStore.length*2);
        System.out.println("\nincreased ArrayList size,New length: "+myStore.length);
    }
     
    public static void main(String a[]){
        MyArrayListImpl mal = new MyArrayListImpl();
        mal.add(new Integer(2));
        mal.add(new Integer(5));
        mal.add(new Integer(1));
        mal.add(new Integer(23));
        mal.add(new Integer(14));
        for(int i=0;i<mal.size();i++){
            System.out.print(mal.get(i)+" ");
        }
        mal.add(new Integer(29));
        System.out.println("Element at Index 5:"+mal.get(5));
        System.out.println("List size: "+mal.size());
        System.out.println("Removing element at index 2: "+mal.remove(2));
        for(int i=0;i<mal.size();i++){
            System.out.print(mal.get(i)+" ");
        }
    }
}