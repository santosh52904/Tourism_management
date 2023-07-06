package travel.management.system;
import javax.swing.*;
import  java.awt.*;
import java.awt.event.*;

public class About extends  JFrame implements ActionListener{
    JButton back;
    About(){
        setBounds(600,200,500,550);
        setLayout(null);
        setBackground(Color.WHITE);
        
        
        JLabel l1=new JLabel("ABOUT");
        l1.setBounds(200,10,100,40);
        l1.setForeground(Color.red);
        l1.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(l1);
        
        TextArea area=new TextArea("Hello",10,40,Scrollbar.VERTICAL);
        area.setEditable(false);
        area.setBounds(20,100,450,300);
        add(area);
        
         
        back=new JButton("Back");
        back.setBounds(200,420,100,25);
        back.addActionListener(this);
        add(back);

        
        
        setVisible(true);
        
    }public void actionPerformed(ActionEvent ae){
        
        setVisible(false);
    }
    
    public static void main(String []args){
        new About();
    }
}
