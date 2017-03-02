//Gerardo Enriquez
//CSC 123
//Assignment 6

import java.util.ListIterator;
import java.util.LinkedList;

import java.lang.IllegalArgumentException;
import java.util.NoSuchElementException;

public class Queue<E>
{
 public <E> Queue()
 {
  Queue = new LinkedList<>();
 }
 
 public void enqueue(E value) //section 1a
 {
     if (Queue.size() >= 55) 
     {
      throw new IllegalArgumentException("Max Size is 55, Queue is full!");
     }  
       Queue.addFirst(value);
 }
 
 public E dequeue()		//section 1a
 {
      if (Queue.size() == 0) 
     {
      throw new NoSuchElementException("Queue is empty!");
     }
      
 return Queue.removeLast();
 }
 
  public boolean isEmpty() {
      return (Queue.isEmpty());
   }
  
								// Dynamic-queue-class pdf
 
  public String toString()
 {
 ListIterator<E> iterator = Queue.listIterator();
 String values = " ";
 while (iterator.hasNext())
 values = values + iterator.next() + " ";
 return values;
 }

private LinkedList<E> Queue;
}