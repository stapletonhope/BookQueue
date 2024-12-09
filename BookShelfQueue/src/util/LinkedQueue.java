package util;

//********************************************************************
//  LinkedQueue.java     
//
//  Represents a linked implementation of a queue.
//********************************************************************




public class LinkedQueue<T> implements QueueADT<T>
{
   private int count;
   private LinearNode<T> front, rear;

   //-----------------------------------------------------------------
   //  Creates an empty queue.
   //-----------------------------------------------------------------
   public LinkedQueue()
   {
      this.count = 0;
      this.front = this.rear = null;
   }

   //-----------------------------------------------------------------
   //  Adds the specified element to the rear of the queue.
   //-----------------------------------------------------------------
   public void enqueue (T element)
   {
      LinearNode<T> node = new LinearNode<T>(element);

      if (isEmpty())
         this.front = node;
      else
         this.rear.setNext (node);

      this.rear = node;
      this.count++;
   }

   //-----------------------------------------------------------------
   //  Removes the element at the front of the queue and returns a
   //  reference to it. 
   //-----------------------------------------------------------------
   public T dequeue() 
   {
	T result = null;
       if (isEmpty())
    	  System.out.println("Queue is empty");
     else
     {
      result  = this.front.getElement();
      this.front = this.front.getNext();
      this.count--;

      if (isEmpty())
         this.rear = null;
     }
      return result;
   }
   
   //-----------------------------------------------------------------
   //  Returns a reference to the element at the front of the queue.
   //  The element is not removed from the queue.    
   //-----------------------------------------------------------------
   public T first() 
   {
       if (isEmpty())
      {
    	  System.out.println("Queue is empty");
          return null;
         }
      else
         return this.front.getElement();
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
   //  Returns a string representation of this queue. - Commenting this
   // out as it technically we should not be able to access every element 
   //of a queue
   //-----------------------------------------------------------------
 /*  public String toString()
   {
      String result = "";
      LinearNode<T> current = this.front;

      while (current != null)
      {
         result = result + (current.getElement()).toString() + "\n";
         current = current.getNext();
      }

      return result;
   } */
}

