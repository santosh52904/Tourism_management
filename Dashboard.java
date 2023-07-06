package travel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Dashboard extends JFrame implements ActionListener{
    String username;
    JButton addPersonalDetails,deletePersonalDetails,payments,about,calculators,notepad,viewPersonalDetails,viewbookhotels,bookhotels,updatePersonalDetails,chaeckpackages,bookpackages,destination,viewpackages,viewhotels;
    Dashboard(String username){
        this.username=username;
//        setBounds(0,0,1600,1000);
        //full screen 
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);
        
        JPanel p1=new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(0,0,102));
        //header panel
        p1.setBounds(0, 0, 1600, 65);
        add(p1);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
        Image i2=i1.getImage().getScaledInstance(70,70,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel icon=new JLabel(i3);
        icon.setBounds(5, 0, 70, 70);
        p1.add(icon);
        
        JLabel heading=new JLabel("Dashboard");
        heading.setBounds(80, 10, 300, 40);
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("Tohoma",Font.BOLD,30));
        p1.add(heading);
        
        JPanel p2=new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(0,0,102));
        p2.setBounds(0, 65, 300, 900);
        add(p2);
        
         addPersonalDetails=new JButton("Add Pesonal Details");
        addPersonalDetails.setBounds(0, 0, 300, 50);
        addPersonalDetails.setBackground(new Color(0,0,102));
        addPersonalDetails.setForeground(Color.WHITE);
        addPersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        addPersonalDetails.setMargin(new Insets(0,0,0,70));
        addPersonalDetails.addActionListener(this);
        p2.add(addPersonalDetails);
        
         updatePersonalDetails=new JButton("Update Pesonal Details");
        updatePersonalDetails.setBounds(0, 50, 300, 50);
        updatePersonalDetails.setBackground(new Color(0,0,102));
        updatePersonalDetails.setForeground(Color.WHITE);
        updatePersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        updatePersonalDetails.setMargin(new Insets(0,0,0,50));
        updatePersonalDetails.addActionListener(this);
        p2.add(updatePersonalDetails);
        
          viewPersonalDetails=new JButton("View Pesonal Details");
        viewPersonalDetails.setBounds(0, 100, 300, 50);
        viewPersonalDetails.setBackground(new Color(0,0,102));
        viewPersonalDetails.setForeground(Color.WHITE);
        viewPersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewPersonalDetails.setMargin(new Insets(0,0,0,70));
        viewPersonalDetails.addActionListener(this);
        p2.add(viewPersonalDetails);
        
           deletePersonalDetails=new JButton("Delete Pesonal Details");
        deletePersonalDetails.setBounds(0, 150, 300, 50);
        deletePersonalDetails.setBackground(new Color(0,0,102));
        deletePersonalDetails.setForeground(Color.WHITE);
        deletePersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        deletePersonalDetails.setMargin(new Insets(0,0,0,50));
        deletePersonalDetails.addActionListener(this);
        p2.add(deletePersonalDetails);
        
          chaeckpackages=new JButton("Check Packages");
        chaeckpackages.setBounds(0, 200, 300, 50);
        chaeckpackages.setBackground(new Color(0,0,102));
        chaeckpackages.setForeground(Color.WHITE);
        chaeckpackages.setFont(new Font("Tahoma",Font.PLAIN,20));
        chaeckpackages.setMargin(new Insets(0,0,0,110));
         chaeckpackages.addActionListener(this);
        p2.add(chaeckpackages);
        
         bookpackages=new JButton("Book Packages");
        bookpackages.setBounds(0, 250, 300, 50);
        bookpackages.setBackground(new Color(0,0,102));
        bookpackages.setForeground(Color.WHITE);
        bookpackages.setFont(new Font("Tahoma",Font.PLAIN,20));
        bookpackages.setMargin(new Insets(0,0,0,120));
        bookpackages.addActionListener(this);
        p2.add(bookpackages);
        
         viewpackages=new JButton("View Packages");
        viewpackages.setBounds(0, 300, 300, 50);
        viewpackages.setBackground(new Color(0,0,102));
        viewpackages.setForeground(Color.WHITE);
        viewpackages.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewpackages.setMargin(new Insets(0,0,0,120));
        viewpackages.addActionListener(this);
        p2.add(viewpackages);
        
          viewhotels=new JButton("View Hotels");
        viewhotels.setBounds(0, 350, 300, 50);
        viewhotels.setBackground(new Color(0,0,102));
        viewhotels.setForeground(Color.WHITE);
        viewhotels.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewhotels.setMargin(new Insets(0,0,0,140));
        viewhotels.addActionListener(this);
        p2.add(viewhotels);
        
           bookhotels=new JButton("Book Hotels");
        bookhotels.setBounds(0, 400, 300, 50);
        bookhotels.setBackground(new Color(0,0,102));
        bookhotels.setForeground(Color.WHITE);
        bookhotels.setFont(new Font("Tahoma",Font.PLAIN,20));
        bookhotels.setMargin(new Insets(0,0,0,140));
        bookhotels.addActionListener(this);
        p2.add(bookhotels);
        
         viewbookhotels=new JButton("View Book Hotels");
        viewbookhotels.setBounds(0, 450, 300, 50);
        viewbookhotels.setBackground(new Color(0,0,102));
        viewbookhotels.setForeground(Color.WHITE);
        viewbookhotels.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewbookhotels.setMargin(new Insets(0,0,0,90));
        viewbookhotels.addActionListener(this);
        p2.add(viewbookhotels);
        
         destination=new JButton("Destination");
        destination.setBounds(0, 500, 300, 50);
        destination.setBackground(new Color(0,0,102));
        destination.setForeground(Color.WHITE);
        destination.setFont(new Font("Tahoma",Font.PLAIN,20));
        destination.setMargin(new Insets(0,0,0,140));
        destination.addActionListener(this);
        p2.add(destination);
        
         payments=new JButton("Payment");
        payments.setBounds(0, 550, 300, 50);
        payments.setBackground(new Color(0,0,102));
        payments.setForeground(Color.WHITE);
        payments.setFont(new Font("Tahoma",Font.PLAIN,20));
        payments.setMargin(new Insets(0,0,0,150));
        payments.addActionListener(this);
        p2.add(payments);
        
         calculators=new JButton("Calculator");
        calculators.setBounds(0, 600, 300, 50);
        calculators.setBackground(new Color(0,0,102));
        calculators.setForeground(Color.WHITE);
        calculators.setFont(new Font("Tahoma",Font.PLAIN,20));
        calculators.setMargin(new Insets(0,0,0,150));
         calculators.addActionListener(this);
        p2.add(calculators);
        
         notepad=new JButton("Notepad");
        notepad.setBounds(0, 650, 300, 50);
        notepad.setBackground(new Color(0,0,102));
        notepad.setForeground(Color.WHITE);
        notepad.setFont(new Font("Tahoma",Font.PLAIN,20));
        notepad.setMargin(new Insets(0,0,0,150));
         notepad.addActionListener(this);
        p2.add(notepad);
        
         about=new JButton("About");
        about.setBounds(0, 700, 300, 50);
        about.setBackground(new Color(0,0,102));
        about.setForeground(Color.WHITE);
        about.setFont(new Font("Tahoma",Font.PLAIN,20));
        about.setMargin(new Insets(0,0,0,175));
         about.addActionListener(this);
        p2.add(about);
        
        
        ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i5=i4.getImage().getScaledInstance(1650, 1000, Image.SCALE_DEFAULT);
        ImageIcon i6=new ImageIcon(i5);
        JLabel image=new JLabel(i6);
        image.setBounds(0, 0, 1650, 1000);
        add(image);
        
        JLabel text=new JLabel("Travel and Tourism Management System");
        text.setBounds(400, 75, 1200, 70);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Raleway",Font.PLAIN,55));
        image.add(text);
        
        
        
        
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==addPersonalDetails){
            new AddCustomer(username);
        }else if(ae.getSource()==viewPersonalDetails){
            new ViewCustomer(username);
        }else if(ae.getSource()==updatePersonalDetails){
            new UpdateCustomer(username);
        }else if(ae.getSource()==chaeckpackages){
            new CheckPackege();
        }else if(ae.getSource()==bookpackages){
            new BookPackage(username);
            
        }else if(ae.getSource()==viewpackages){
            new ViewPackage(username);
        }else if(ae.getSource()==viewhotels){
            new CheckHotels();
        }else if(ae.getSource()==destination){
            new Destinations();
        }else if(ae.getSource()==bookhotels){
            new BookHotel(username);
            
        }else if(ae.getSource()==viewbookhotels){
            new ViewBookedHotel(username);
        }else if(ae.getSource()==payments){
            new Payment();
        }else if(ae.getSource()==calculators){
            try{
                Runtime.getRuntime().exec("calc.exe");
            }catch(Exception e){
                e.printStackTrace();
            }
        }else if(ae.getSource()==notepad){
            try{
                Runtime.getRuntime().exec("notepad.exe");
            }catch(Exception e){
                e.printStackTrace();
            }
        }else if(ae.getSource()==about){
            new About();
        }else if(ae.getSource()==deletePersonalDetails){
            new DeletePersonalDetails();
            
        }
    }
    
    public static void main(String []args){
        new Dashboard("");
    }
}
