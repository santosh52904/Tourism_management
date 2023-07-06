package travel.management.system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Signup extends JFrame implements ActionListener{
    
    JButton create,back;
    JTextField tfname,tfusername,tfpassword,tfanswer;
    Choice security;
    Signup(){
        setBounds(350,200,900,360);
        //combination of set size and set location
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        
        JPanel p1=new JPanel();
        p1.setBackground(new Color(133,193,233));
        p1.setBounds(0, 0, 500, 400);
        p1.setLayout(null);
        add(p1);
        
         JLabel lblusername=new JLabel("Username");
        lblusername.setBounds(50,20,125,25);
        lblusername.setFont(new Font("Tahoma",Font.BOLD,14));
         p1.add(lblusername);
        
         tfusername=new JTextField();
        tfusername.setBounds(190, 20, 180, 25);
        tfusername.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfusername);
        
        JLabel lblname=new JLabel("Name");
        lblname.setFont(new Font("Tahoma",Font.BOLD,14));
        lblname.setBounds(50,60,125,25);
        p1.add(lblname);
        
         tfname=new JTextField();
        tfname.setBounds(190, 60, 180, 25);
        tfname.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfname);
        
         JLabel lblpassword=new JLabel("Password");
        lblpassword.setBounds(50,100,125,25);
        lblpassword.setFont(new Font("Tahoma",Font.BOLD,14));
         p1.add(lblpassword);
        
         tfpassword=new JTextField();
        tfpassword.setBounds(190, 100, 180, 25);
        tfpassword.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfpassword);
        
           JLabel lblsecurity=new JLabel("Security Question");
        lblsecurity.setBounds(50,140,125,25);
        lblsecurity.setFont(new Font("Tahoma",Font.BOLD,14));
         p1.add(lblsecurity);
        
         security=new Choice();
        security.add("Fav character from the  Boys");
        security.add("Fav marvel Hero");
        security.add("Your lucky number");
        security.add("Your childhood superhero");
        security.setBounds(190, 140, 186, 25);
        p1.add(security);
        
           JLabel lblanswer=new JLabel("Password");
        lblanswer.setBounds(50,180,125,25);
        lblanswer.setFont(new Font("Tahoma",Font.BOLD,14));
         p1.add(lblanswer);
         
           tfanswer=new JTextField();
        tfanswer.setBounds(190, 180, 180, 25);
        tfanswer.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfanswer);
         
         create=new JButton("Create");
        create.setBackground(Color.WHITE);
        create.setForeground(new Color(133,193,233));
        create.setFont(new Font("Tohoma",Font.BOLD,14));
        create.setBounds(80, 250, 100, 30);
        create.addActionListener(this);
        p1.add(create);
        
          back=new JButton("Back");
        back.setBackground(Color.WHITE);
        back.setForeground(new Color(133,193,233));
        back.setFont(new Font("Tohoma",Font.BOLD,14));
        back.setBounds(250, 250, 100, 30);
        back.addActionListener(this);
        p1.add(back);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/signup.png"));
        //class loader is function 
        //get search the file of image in teh assigned loaction
        Image i2=i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        //get sacle instance adjusts the  the size
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        //we can write text on the frame
        image.setBounds(580,50,250,250);
        add(image);
        
        //this the last statement
        setVisible(true);
        
    }
    //abstact method is overriden
     public void actionPerformed(ActionEvent ae){
         if(ae.getSource()==create){
             String username=tfusername.getText();
             //return filled details inthe text field
             String name=tfname.getText();
             String password=tfpassword.getText();
             String question=security.getSelectedItem();
             String answer=tfanswer.getText();
             
             String query="insert into account values('"+username+"','"+name+"','"+password+"','"+question+"','"+answer+"')";
             try{
                 Conn c=new Conn();
                 //to make the connnection from here
                 c.s.executeUpdate(query);
                 //to show the popup message
                 
                 JOptionPane.showMessageDialog(null, "Account Created Successfully");
                 setVisible(false);
                 new Login();
                 //5.closing the connection but there is the garbage collection class that does the work
                 
             }catch(Exception e){
                 e.printStackTrace();
             }
             
         }else if(ae.getSource()==back){
             setVisible(false);
             new Login();
            
         }
         
     }
    
    public static void main(String []args){
        new Signup();
    }
}
