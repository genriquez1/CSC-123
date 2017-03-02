//Gerardo Enriquez
//CSC123
//Assignment 4

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

// Create the menu for the clock application

public class ClockMenuFrameH extends JFrame
{
 public ClockMenuFrameH(ClockAppH clockRef)
 {
 // Construct menu
 JMenuBar menuBar = new JMenuBar();
 setJMenuBar(menuBar);
 menuBar.add(createFileMenu());
 menuBar.add(createShowMenu());
 setSize(FRAME_WIDTH, FRAME_HEIGHT);
 clock = clockRef;
 }
 // Creates the File menu.
 public JMenu createFileMenu()
 {
 JMenu menu = new JMenu("File");
 menu.add(createFileExitItem());
 return menu;
 }
 // Creates the File->Exit menu item and sets its action listener.

 public JMenuItem createFileExitItem()
 {
 JMenuItem item = new JMenuItem("Exit");

 class MenuItemListener implements ActionListener
 {
 public void actionPerformed(ActionEvent event)
 {
 System.exit(0);
 }
 }

 ActionListener listener = new MenuItemListener();
 item.addActionListener(listener);
 return item;
 }
 public JMenu createShowMenu()
 {
 JMenu menu = new JMenu("Show");
 menu.add(createSecondHandItemOn());
 menu.add(createSecondHandItemOff());
 return menu;
 }
 // Creates the File->SecondHand menu item and sets its action listener.
 public JMenuItem createSecondHandItemOn()
 {
 JMenuItem item = new JMenuItem("Second Hand On");

 class MenuItemListener implements ActionListener
 {
 public void actionPerformed(ActionEvent event)
 {
 clock.showSecondHand();
 }
 }

 ActionListener listener = new MenuItemListener();
 item.addActionListener(listener);
 return item;
 }
 // Creates the File->SecondHand menu item and sets its action listener.
 public JMenuItem createSecondHandItemOff()
 {
 JMenuItem item = new JMenuItem("Second Hand Off");

 class MenuItemListener implements ActionListener
 {
 public void actionPerformed(ActionEvent event)
 {
 clock.hideSecondHand();
 }
 }

 ActionListener listener = new MenuItemListener();
 item.addActionListener(listener);
 return item;
 }
private ClockAppH clock;
private static final int FRAME_WIDTH = 200;
private static final int FRAME_HEIGHT = 200;
}