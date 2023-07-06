
package travel.management.system;
import java.awt.*;
import javax.swing.*;

public class Loading extends JFrame implements Runnable{
    //using multithreadin g  from 0 to 100
    Thread t;
    JProgressBar bar;
    String username;
    
    public void run(){
       
        
        try{
            
            for(int i=1;i<=101;i++){
                int max=bar.getMaximum();//100
                int value=bar.getValue();
                
                if(value<max){
                    bar.setValue(bar.getValue()+1);
                }else{
                    setVisible(false);
                    //new class object
                    new Dashboard(username);
                }
                Thread.sleep(50);
                
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
     Loading(String username){
          this.username=username;
         t=new Thread(this);//only works with the this keyword
         
         setBounds(500,200,650,400);
         getContentPane().setBackground(Color.WHITE);
         setLayout(null);
         
         JLabel text=new JLabel("Travel and Tourism Management");
         text.setBounds(50,20,550,40);
         text.setForeground(Color.BLUE);
         text.setFont(new Font("Raleway",Font.BOLD,35));
         add(text);
         
          bar=new JProgressBar();
         bar.setBounds(150, 100, 300, 35);
         bar.setStringPainted(true);
         //0% on the progess bar
         add(bar);
         
         JLabel loading=new JLabel("Loading Please Wait....");
         loading.setBounds(200,140,200,16);
         loading.setForeground(Color.GREEN);
         loading.setFont(new Font("Raleway",Font.BOLD,16));
         add(loading);
         
         JLabel lblusername=new JLabel("Welcome " +username);
         lblusername.setBounds(50,310,400,40);
         lblusername.setForeground(Color.RED);
         lblusername.setFont(new Font("Raleway",Font.BOLD,20));
         add(lblusername);
         
         t.start();
         setVisible(true);
     }
    
    public static void main(String []args){
        new Loading("");
    }
}
