//Gerardo Enriquez
//CSC 123 Extra Credit
//4-12-16

import javax.swing.*;

import java.awt.*;

public class NewFrame extends JFrame
{
   public NewFrame()
   {
     super("             Dart Board by GE             ");
     setBounds(0, 0, 545, 545);
     NewPanel panel= new NewPanel();
     add(panel);
     setResizable(true);
     setVisible(true);
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   
public NewFrame(String title)
   {
     super(title);
     setBounds(0, 0, 545, 545);
     NewPanel panel= new NewPanel();
     add(panel);
     setResizable(true);
     setVisible(true);
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
   
   }

}
