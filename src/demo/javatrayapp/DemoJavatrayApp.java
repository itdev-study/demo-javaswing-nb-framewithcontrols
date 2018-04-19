/*
 * Example from  https://docs.oracle.com/javase/tutorial/uiswing/misc/systemtray.html
 */
package demo.javatrayapp;

import java.awt.AWTException;
import java.awt.Image;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import sun.tools.jar.Main;

public class DemoJavatrayApp {  

  public static void main(String[] a) throws Exception {
    String workingDir = System.getProperty("user.dir"); 
    System.out.println("Current working directory : " + workingDir);      
    Image image = Toolkit.getDefaultToolkit().getImage(workingDir+"\\tray2.gif");
    TrayIcon trayIcon = new TrayIcon(image, "Tray APP");        
       
    if (SystemTray.isSupported()) {
      SystemTray tray = SystemTray.getSystemTray();

      trayIcon.setImageAutoSize(true);
      trayIcon.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          System.out.println("In here");
          trayIcon.displayMessage("Tester!", "TEST Message", TrayIcon.MessageType.INFO);
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