// Demo singleframe
package demo.javaswing.singleframe;

import java.awt.event.*;
import javax.swing.*;

public class DemoJavaswingSingleframeButtonText {
    public static void main(String[] args) {        
        new ControlMainFrame();
    }    
}

class ControlMainFrame implements ActionListener{
    JFrame mainFrame;
    JEditorPane editorPane;
    JButton btn;    
    
    ControlMainFrame(){
        mainFrame=new JFrame("Control");
        mainFrame.setBounds(600, 200, 600, 400);    
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setLayout(null);   
        
        btn=new JButton("Print RRR in textarea");
        btn.setBounds(10,10,180,30);
        btn.addActionListener(this);
        
        editorPane = new JEditorPane();
        editorPane.setBounds(10, 45, 450, 250);
          
        mainFrame.add(btn);   
        mainFrame.add(editorPane);  
        mainFrame.setVisible(true);        
    }
    public void actionPerformed(ActionEvent AEobj){
        //System.exit(0);
        System.out.println("TEST"); 
        editorPane.setText("RRRR");
    }
}
