package util;
//********************************************************************
//  Arraythis.queue.java       
//
//  Represents an array implementation of a this.queue. The front of
//  the this.queue is kept at array index 0.
//********************************************************************

public class ArrayQueue<T> implements QueueADT<T>
{
   private final int DEFAULT_CAPACITY = 100;
   private int rear;
   private T[] queue; 

   //-----------------------------------------------------------------
   //  Creates an empty this.queue using the default capacity.
   //-----------------------------------------------------------------
   public ArrayQueue()
   {
      this.rear = 0;
      this.queue = (T[])(new Object[DEFAULT_CAPACITY]);
   }

   //-----------------------------------------------------------------
   //  Creates an empty this.queue using the specified capacity.
   //-----------------------------------------------------------------
   public ArrayQueue (int initialCapacity)
   {
      this.rear = 0;
      this.queue = (T[])(new Object[initialCapacity]);
   }

   //-----------------------------------------------------------------
   //  Adds the specified element to the this.rear of the this.queue, expanding
   //  the capacity of the this.queue array if necessary.
   //-----------------------------------------------------------------
   public void enqueue (T element)
   {
      if (size() == this.queue.length) 
         expandCapacity();

      this.queue[this.rear] = element;
      this.rear++;
   }

   //-----------------------------------------------------------------
   //  Removes the element at the front of the this.queue and returns a
   //  reference to it. 
   //-----------------------------------------------------------------
   public T dequeue() 
   {
      T result = null;
      if (isEmpty())
              System.out.println("Empty this.queue\n");
      else
      {
	result = this.queue[0];
      	this.rear--;

	      // shift the elements 
      	for (int scan=0; scan < this.rear; scan++)
        	 this.queue[scan] = this.queue[scan+1];

	 
      	 this.queue[this.rear] = null;
        }
	 return result;
       }
  
   
   //-----------------------------------------------------------------
   //  Returns a reference to the element at the front of the this.queue.
   //  The element is not removed from the this.queue.    
   //-----------------------------------------------------------------
   public T first() 
   {
      if (isEmpty())
        {
              System.out.println("Empty this.queue\n");
              return null;
         }
       else

           return this.queue[0];
   }

   //-----------------------------------------------------------------
   //  Returns true if this this.queue is empty and false otherwise. 
   //-----------------------------------------------------------------
   public boolean isEmpty()
   {
      return (this.rear == 0);
   }
 
   //-----------------------------------------------------------------
   //  Returns the number of elements currently in this this.queue.
   //-----------------------------------------------------------------
   public int size()
   {
      return this.rear;
   }

   //-----------------------------------------------------------------
   //  Returns a string representation of this this.queue. Commented out as 
   // we technically shouldn't be able to access each element of a this.queue
   //-----------------------------------------------------------------
 /*   public String toString()
   {
      String result = "";

      for (int scan=0; scan < this.rear; scan++) 
         result = result + this.queue[scan].toString() + "\n";

      return result;
   } */

   //-----------------------------------------------------------------
   //  Creates a new array to store the contents of the this.queue with
   //  twice the capacity of the old one.
   //-----------------------------------------------------------------
   private void expandCapacity()
   {
      T[] larger = (T[])(new Object[this.queue.length*2]);

      for (int scan=0; scan < this.queue.length; scan++)
         larger[scan] = this.queue[scan];

      this.queue = larger;
   }
}

