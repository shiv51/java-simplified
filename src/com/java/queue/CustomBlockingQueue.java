package com.java.queue;

import java.util.LinkedList;
import java.util.List;

public class CustomBlockingQueue<E> {
	 // BlockingQueue using LinkedList structure
    // with a constraint on capacity
    private List<E> queue = new LinkedList<E>();
  
    // limit variable to define capacity
    private int limit = 10;
  
    // constructor of BlockingQueue
    public CustomBlockingQueue(int limit) { this.limit = limit; }
  
    // enqueue method that throws Exception
    // when you try to insert after the limit
    public synchronized void enqueue(E item)
        throws InterruptedException
    {
        while (this.queue.size() == this.limit) {
            wait();
        }
        if (this.queue.size() == 0) {
            notifyAll();
        }
        this.queue.add(item);
    }
  
    // dequeue methods that throws Exception
    // when you try to remove element from an
    // empty queue
    public synchronized E dequeue()
        throws InterruptedException
    {
        while (this.queue.size() == 0) {
            wait();
        }
        if (this.queue.size() == this.limit) {
            notifyAll();
        }
  
        return this.queue.remove(0);
    }
    
    public static void main(String []args)
    {
    	CustomBlockingQueue<String> a = new CustomBlockingQueue<>(3);
    	Thread t1 = new Thread(()->{
    		try {
				a.enqueue("shiva");
				a.enqueue("shiva");
				a.enqueue("shiva");
				System.out.println(a);
				a.enqueue("shiva");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
    		
    	});
    	
    	Thread t2 = new Thread(()->{
    		try {
				Thread.sleep(4000);
				
				System.out.println(a);
				a.dequeue();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
    		
    	});
    	t1.start();
    	t2.start();
    }
}
