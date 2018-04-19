/*
 * Example from  https://docs.oracle.com/javase/tutorial/uiswing/misc/systemtray.html
 */
package demo.javatrayapp;

import java.awt.AWTException;
import java.awt.CheckboxMenuItem;
import java.awt.Image;
import java.awt.Menu;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DemoJavatrayApp {  

  public static void main(String[] a) throws Exception {
      
    PopupMenu popup = new PopupMenu(); 
     
    MenuItem aboutItem = new MenuItem("About");
    CheckboxMenuItem cb1 = new CheckboxMenuItem("Set auto size");
    CheckboxMenuItem cb2 = new CheckboxMenuItem("Set tooltip");
    Menu displayMenu = new Menu("Display");
    MenuItem errorItem = new MenuItem("Error");
    MenuItem warningItem = new MenuItem("Warning");
    MenuItem infoItem = new MenuItem("Info");
    MenuItem noneItem = new MenuItem("None");
    MenuItem exitItem = new MenuItem("Exit");

    //Add components to pop-up menu
    popup.add(aboutItem);
    popup.addSeparator();
    popup.add(cb1);
    popup.add(cb2);
    popup.addSeparator();
    popup.add(displayMenu);
    displayMenu.add(errorItem);
    displayMenu.add(warningItem);
    displayMenu.add(infoItem);
    displayMenu.add(noneItem);
    popup.add(exitItem);      
      
    String workingDir = System.getProperty("user.dir"); 
    System.out.println("Current working directory : " + workingDir);      
    Image image = Toolkit.getDefaultToolkit().getImage(workingDir+"\\tray2.gif");
    TrayIcon trayIcon = new TrayIcon(image, "Tray APP");        
       
    if (SystemTray.isSupported()) {
      SystemTray tray = SystemTray.getSystemTray();

      trayIcon.setImageAutoSize(true);
      trayIcon.setPopupMenu(popup);
      trayIcon.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
              System.out.println("In here");
              trayIcon.displayMessage("Tester!", "TEST Message", TrayIcon.MessageType.INFO);
        }
      });
      
      aboutItem.addActionListener(new ActionListener() {        
        public void actionPerformed(ActionEvent e) {
            System.out.println("In here");
            trayIcon.displayMessage("Tester!", "About APP", TrayIcon.MessageType.INFO);
          }
      });

      try {
        tray.add(trayIcon);
      } catch (AWTException e) {
        System.err.println("TrayIcon could not be added.");
      }
    }
  }
}