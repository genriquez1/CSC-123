//Gerardo Enriquez
//CSC 123
//Assignment 6

import java.util.logging.Logger;

public class Point
{
    private int x;
    private int y;

    Point(int a, int b) 
    {
        x = a;
        y = b;
             
    }
    
   public int getX()
   {
     return x;
     
   }

    public int getY() {
        return y;
    }   
								// point class from website pdf
    public void setX(int x1) {
        x = x1;
    }

    public void setY(int y1) {
        y = y1;
    }

    public String toString() {
        return "(" +  x  + ", " + y +" ) ";
    }
    

}