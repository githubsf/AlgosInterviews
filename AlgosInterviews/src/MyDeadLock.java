/*
 * Deadlock describes a situation where two or more threads are blocked
 *  forever, waiting for each other. Deadlocks can occur in Java when 
 *  the synchronized keyword causes the executing thread to block 
 *  while waiting to get the lock, associated with the specified object.
 *   Since the thread might already hold locks associated with other
 *    objects, two threads could each be waiting for the other to
 *     release a lock. In such case, they will end up waiting forever.
 *     
 */

public class MyDeadLock {
 
    String str1 = "Java";
    String str2 = "UNIX";
     
    Thread trd1 = new Thread("My Thread 1"){
        public void run(){
        	int count=0;
            while(true){
                synchronized(str1){
                    synchronized(str2){count++;
                        System.out.println(count + " " + str1 + str2);
                    }
                }
            }
        }
    };
     
    Thread trd2 = new Thread("My Thread 2"){
        public void run(){
        	int count=0;
            while(true){
                synchronized(str2){
                    synchronized(str1){count++;
                        System.out.println(count + " " + str2 + str1);
                    }
                }
            }
        }
    };
     
    // Will only print JavaUnix meaning that thread2 is deadlocked
    // Sometimes it deadlocks at count=15, other times 179,etc.But sooner
    // or later it will deadlock
    public static void main(String a[]){
        MyDeadLock mdl = new MyDeadLock();
        mdl.trd1.start();
        mdl.trd2.start();
    }
}