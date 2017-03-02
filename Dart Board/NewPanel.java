//Gerardo Enriquez
//CSC 123 Extra Credit
//4-12-16

import java.util.Random;

import javax.swing.*;

import java.awt.*;

public class NewPanel extends JPanel
{
   public void paintComponent(Graphics g)
   {
    int x1, y1,sum=10000;
    int hits=0, miss=0;
    double distance, pi, z, rad;
	
 //From Page 915 in textbook
 // Same width and Height makes oval into a circle, same for Rect.
 
     super.paintComponent(g);
     g.drawRect(0, 0, 500, 500);
     g.drawOval(0, 0, 500, 500);
     
//Radius of circle provides us with the middle point from the center
     rad=500/2.0;
     Random Nnum= new Random();
     
     for(int i=1;i<=sum;i++)
     {
      x1=Nnum.nextInt(500)+1; // randum numbers between 1-500
      y1=Nnum.nextInt(500)+1; 
         
      z=Math.pow((x1-250), 2)+Math.pow((y1-250), 2);
      distance=Math.sqrt(z);
         
//If z/dis is less than the radius than it means it hit within the circle
		if(distance<rad)
        hits++;
// If it is greater than the radius than it hit outside the circle but within the square         
		else miss++;
       g.drawLine(x1, y1, x1, y1);	   
     }
     pi=4.0*hits/sum;  //from assignment ti calculate pi and ratio
	 
     System.out.print("Throws:"+sum+" Hits:"+hits+" Ratio:"+ pi);
     
   } 
    
}
