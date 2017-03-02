//Gerardo Enriquez
//CSC 123 
//4-17-16
//Extra Credit # 2 

import java.util.Random; 
import javax.swing.JPanel;
import java.awt.Graphics;
import java.util.logging.Logger;
import java.util.logging.Level;


public class Grid extends JPanel 
{
     private int x=255;
     private int y=255;
     private int direction;
    
   public void paintComponent(Graphics z)
   {
  
     super.paintComponent(z);
	 
     z.drawOval(x, y, 30, 30); 
     z.drawRect(50,50,500,500); 
     
       while(x<=550&&y<=550&&x>=50&&y>=50) //Makes sure it stays within bounds of Grid
       {
        
             direction=(int)(Math.random()*4); //Each time there is a 25% chance of step
             switch (direction)
             {
                 case 0:
                     z.clearRect(x,y,50,50);   
                     y+=50; //UP
                     break;				 
                 case 1:
                     z.clearRect(x,y,50,50);
                     x+=50; //RIGHT
                     break;
                 case 2:
                     z.clearRect(x,y,50,50);
                     y-=50;	//LEFT				 
                     break;
                 case 3:
                     z.clearRect(x,y,50,50);
                     x-=50; //DOWN				 					 
                     break;                    
             }            			 
             z.drawOval(x, y, 30, 30);       
         }    
    
   
//Begin Grid		 
//Vertical
     for(int i=100;i<550;i+=50)
     { 
       z.drawLine(i, 50, i, 550);
     }
     
//Horizontal
     for(int i=100;i<550;i+=50)
     { 
       z.drawLine(50, i, 550, i);
     }
  
   }
      
}
