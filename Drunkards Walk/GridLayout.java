//Gerardo Enriquez
//CSC 123 
//4-17-16
//Extra Credit # 2 


import javax.swing.JFrame;



public class GridLayout extends JFrame
{
    public GridLayout()
    {
     super("           Drunkard's Walk by GE");
     setBounds(50,50,625,625);

     Grid gPanel= new Grid();
     add(gPanel);
           
     setResizable(true);
     setVisible(true);
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    }
    
     public GridLayout(String Drunkardtitle)
    {
        
     super("           Drunkard's Walk");
     setBounds(50,50,625,625);
     
     Grid gPanel = new Grid();
     add(gPanel);

     setResizable(true);
     setVisible(true);
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    }
    
    
    
}
