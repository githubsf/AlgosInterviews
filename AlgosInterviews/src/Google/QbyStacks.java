package Google;
import java.util.Stack;
/*
 * Keep 2 stacks, let's call them inbox and outbox.

Queue:
- Push the new element onto inbox

Dequeue:
- If outbox is empty, refill it by popping each element from inbox 
and pushing it onto outbox
- Pop and return the top element from outbox

Using this method, each element will be in each stack exactly once
 - meaning each element will be pushed twice and popped twice,
  giving amortized constant time operations.
  
  It is true that the worst-case time for a single pop operation is O(n) 
  (where n is the current size of the queue). However, the worst-case 
  time for a sequence of n queue operations is also O(n),
   giving us the amortized constant time. 
   I wouldn't implement a queue this way, but it's not that bad
   
   a) queue 1,2,3 => Inbox[3,2,1]/Outbox[]. 
   b) dequeue. outbox is empty,
    so refill => Inbox[]/Outbox[1,2,3]. Pop from outbox, return 1 => 
    Inbox[]/Outbox[2,3]. 
    c) queue 4,5 => Inbox[5,4]/Outbox[2,3]. 
    d) dequeue. outbox is not empty, so pop from outbox, return 2 => Inbox[5,4]/Outbox[3].
 */

public class QbyStacks<E> {
	
	

	    private Stack<E> inbox = new Stack<E>();
	    private Stack<E> outbox = new Stack<E>();

	    public void queue(E item) {
	        inbox.push(item);
	    }

	    public E dequeue() {
	        if (outbox.isEmpty()) {
	            while (!inbox.isEmpty()) {
	               outbox.push(inbox.pop());
	            }
	        }
	        return outbox.pop();
	    }

	}

