//Gerardo Enriquez
//CSC 123
//Assignment 6

public class Generic {

    public static void main(String[] args) 
    {
         
        Queue<Integer> IntergerQ = new Queue<Integer>();  //Type Int
        Queue<String> StringQ = new Queue<String>();	// Type String
        Queue<Point> PointQ = new Queue<Point>();  // Type Point
        
        try
        {
        IntergerQ.enqueue(3);
        IntergerQ.enqueue(8);
        System.out.println(IntergerQ); //debug  
        System.out.println(IntergerQ.dequeue());  
        System.out.println(IntergerQ.dequeue());  //section 1d
               
        StringQ.enqueue("Vin");
        StringQ.enqueue("Scully");
        System.out.println(StringQ); //debug
        System.out.println(StringQ.dequeue());  //section 1a
        System.out.println(StringQ.dequeue());	//section 1d
          
        Point Pone= new Point(0,1);
        Point Ptwo= new Point(1,2);
        PointQ.enqueue( Pone);
        PointQ.enqueue(Ptwo);
        System.out.println(PointQ); //debug
        System.out.println(PointQ.dequeue());  //section 1a
        System.out.println(PointQ.dequeue());	//section 1d
		
		
        System.out.println(PointQ.dequeue()); //Testing Exception for empty queue
        }
        
       catch(Exception e) 		// exception
               {
               System.out.println(e);
               
               }
        
    }
    
}
