//********************************************************************
//  CircularArrayQueue.java      
//
//  Represents an array implementation of a this.queue in which the
//  indexes for the front and ear of the queue circle back to 0
//  when they reach the end of the array.
//
// Note that you will have to add code to the specified methods
// before this class can be used.
//********************************************************************

package util;



public class CircularArrayQueue<T> implements QueueADT<T>
{
   private final int DEFAULT_CAPACITY = 100;
   private int front, rear, count;
   private T[] queue; 

   //-----------------------------------------------------------------
   //  Creates an empty queue using the default capacity.
   //-----------------------------------------------------------------
   public CircularArrayQueue()
   {
      this.front = this.rear = this.count = 0;
      this.queue = (T[]) (new Object[DEFAULT_CAPACITY]);
   }

   //-----------------------------------------------------------------
   //  Creates an empty queue using the specified capacity.
   //-----------------------------------------------------------------
   public CircularArrayQueue (int initialCapacity)
   {
      this.front = this.rear = this.count = 0;
      this.queue = (T[])(new Object[initialCapacity]);
   }

   //-----------------------------------------------------------------
   //  Adds the specified element to the rear of the queue, expanding
   //  the capacity of the queue array if necessary.
   //-----------------------------------------------------------------
   public void enqueue (T element)
   {
      // ADD CODE HERE
    // 1. if the number of elements in the queue is equal to
    // queue.length then expand the capacity

	// 2. add element to rear position then update the value of rear by one 
    // ensuring that rear can loop back to position 0 if that is the next free
	//slot - see circular queue notes
	   
	//3. Increment the count variable
   }

   //-----------------------------------------------------------------
   //  Removes the element at the front of the queue and returns a
   //  reference to it.
   //-----------------------------------------------------------------
   public T dequeue() 
   {
   	   T result = null;
   	   
        // ADD CODE here
   	   
   	   //1.  if the queue is empty, display message 
   	   // else
   	   //2. Let the result be equal to the element at the front of the queue
   	   //3. Set this front element to null
   	   //4. add 1 to front ensuring that front can loop back to position 0.
   	   //5. Decrement the count variable.

      return result;
   }
   
   //-----------------------------------------------------------------
   //  Returns a reference to the element at the front of the queue.
   //  The element is not removed from the queue. 
   //-----------------------------------------------------------------
   public T first() 
   {
         T result = null;
	   if (isEmpty())
	          System.out.println("Empty queue");
	         
	   else 
		result = this.queue[this.front];
	  return result;
   }

   //-----------------------------------------------------------------
   //  Returns true if this queue is empty and false otherwise. 
   //-----------------------------------------------------------------
   public boolean isEmpty()
   {
      return (this.count == 0);
   }
 
   //-----------------------------------------------------------------
   //  Returns the number of elements currently in this queue.
   //-----------------------------------------------------------------
   public int size()
   {
      return this.count;
   }


   //-----------------------------------------------------------------
   //  Returns a string representation of this queue. 
   //-----------------------------------------------------------------
  public String toString()
  {
    String result = "";
    	int scan = this.front;
    
    while (scan < this.rear) {
    	// 	ADD CODE HERE
    }
    
    return result;

  }

   //-----------------------------------------------------------------
   //  Creates a new array to store the contents of the queue with
   //  twice the capacity of the old one.
   //-----------------------------------------------------------------
  private void expandCapacity()
  {
    T[] larger = (T[])(new Object[this.queue.length *2]);   

    for(int scan=0; scan < this.count; scan++)
    {
      larger[scan] = this.queue[this.front];
      this.front=(this.front+1) % this.queue.length;
    }

    this.front = 0;
    this.rear = this.count;
    this.queue = larger;
  }
}

