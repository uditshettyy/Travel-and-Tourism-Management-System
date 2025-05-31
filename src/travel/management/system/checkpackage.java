package travel.management.system;
import java.awt.*;
import javax.swing.*;
public class checkpackage extends JFrame{
    checkpackage(){
                setBounds(450,200,900,600);
                
                JTabbedPane tab = new JTabbedPane();
                
                
                JPanel  p1=new JPanel();
                p1.setLayout(null);
                p1.setBackground(Color.WHITE);
                
                
                JLabel l1= new JLabel("GOLD PACKAGE");
                l1.setBounds(50,5,300,30);
                l1.setForeground(Color.YELLOW);
                l1.setFont(new Font("Tahoma",Font.BOLD,30));
                p1.add(l1);
               
                
                
                JLabel l2= new JLabel("6 Days and 7 Nights");
                l2.setBounds(30,60,300,30);
                l2.setForeground(Color.RED);
                l2.setFont(new Font("Tahoma",Font.BOLD,20));
                p1.add(l2);
                
                JLabel l3= new JLabel("Airport Assistance");
                l3.setBounds(30,110,300,30);
                l3.setForeground(Color.BLUE);
                l3.setFont(new Font("Tahoma",Font.BOLD,20));
                p1.add(l3);
                
                JLabel l4= new JLabel("Half Day City Tour");
                l4.setBounds(30,160,300,30);
                l4.setForeground(Color.RED);
                l4.setFont(new Font("Tahoma",Font.BOLD,20));
                p1.add(l4);
                
                 JLabel l5= new JLabel("Daily Buffet");
                l5.setBounds(30,210,300,30);
                l5.setForeground(Color.BLUE);
                l5.setFont(new Font("Tahoma",Font.BOLD,20));
                p1.add(l5);
               
                 JLabel l6= new JLabel("Welcome Drinkings");
                l6.setBounds(30,270,300,30);
                l6.setForeground(Color.RED);
                l6.setFont(new Font("Tahoma",Font.BOLD,20));
                p1.add(l6);
                
                
                
                JLabel l7= new JLabel("Full Day 3 island  Cruise ");
                l7.setBounds(30,320,300,30);
                l7.setForeground(Color.BLUE);
                l7.setFont(new Font("Tahoma",Font.BOLD,20));
                p1.add(l7);
                
                JLabel l8= new JLabel("English speaking guide ");
                l8.setBounds(30,360,300,30);
                l8.setForeground(Color.RED);
                l8.setFont(new Font("Tahoma",Font.BOLD,20));
                p1.add(l8);
               
                
                JLabel l9= new JLabel("Book Now ");
                l9.setBounds(60,430,300,30);
                l9.setForeground(Color.BLACK);
                l9.setFont(new Font("Tahoma",Font.BOLD,25));
                p1.add(l9);
                
                JLabel l10= new JLabel("Summer Special ");
                l10.setBounds(80,480,300,30);
                l10.setForeground(Color.MAGENTA);
                l10.setFont(new Font("Tahoma",Font.BOLD,25));
                p1.add(l10);
                
                JLabel l11= new JLabel(" Rs- 12000/ ");
                l11.setBounds(500,480,300,30);
                l11.setForeground(Color.RED);
                l11.setFont(new Font("Tahoma",Font.BOLD,25));
                p1.add(l11);
            
                
                ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/package1.jpg"));
                Image i2 = i1.getImage().getScaledInstance(500,300,Image.SCALE_DEFAULT);
                ImageIcon i3 = new ImageIcon(i2);
                JLabel l12=  new JLabel(i3);
                l12.setBounds(350,20,500,300);
                p1.add(l12);
                
                
                
         tab.addTab("Package 1",null,p1);
         tab.addTab("Package 2",null,p1);
         tab.addTab("Package 3 ",null,p1);
         add(tab);
         setVisible(true);
}
    
     public static void main(String[] args){
    new checkpackage();
}
}
  