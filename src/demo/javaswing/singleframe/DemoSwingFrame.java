package demo.javaswing.singleframe;

import javax.swing.JFrame;

public class DemoSwingFrame {    
   public static void main(String[] args)
   {
       new NewFrame2();
   }    
}

class NewFrame2{
NewFrame2(){
    JFrame MyFrame=new JFrame("New Single window");
    MyFrame.setSize(300,200);
    MyFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    MyFrame.setVisible(true);
}}
