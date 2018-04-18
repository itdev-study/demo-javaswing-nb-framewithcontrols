package demo.javaswing.singleframe;

import javax.swing.*;
import java.awt.event.*;

class MyFrame implements ActionListener{
    MyFrame(String text,int x,int y){
        JFrame frm=new JFrame(" Окно с меткой и кнопкой");
        frm.setBounds(x,y,360,200);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon icn=new ImageIcon("d:/Books/Java_guide/pictures/javalogo.gif");
        
        JLabel lbl=new JLabel(text,icn,JLabel.CENTER);
        lbl.setBounds(10,10,330,100);
        
        JButton btn=new JButton("Принято к сведению");
        btn.setBounds(90,120,180,30);
        btn.addActionListener(this);
        frm.setLayout(null);
        frm.add(lbl);
        frm.add(btn);
        frm.setVisible(true);
    }

    public void actionPerformed(ActionEvent AEobj){
        //System.exit(0);
        System.out.println("TEST");   
        }
}

public class FrameAndButton{
    public static void main(String[] args){    
        new MyFrame(" Окно с меткой, пиктограммой и кнопкой!",400,250);
        }
}