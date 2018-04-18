package demo.javaswing.singleframe;

import javax.swing.*;

public class NewFrameDemo{
    public static void main(String[] args){
    new NewFrame();}
}

class NewFrame{
NewFrame(){
    JFrame MyFrame=new JFrame("New Single window");
    MyFrame.setSize(300,200);
    MyFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    MyFrame.setVisible(true);
}}
