package travel.management.system;
import javax.swing.*;
import java.awt.*;
public class Login extends JFrame {
    Login(){
        setSize(900,400);
        setLocation(350,200);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        
        JPanel p1= new JPanel();
        p1.setBackground(new Color(255,20,60));
        p1.setBounds(0,0,400,400);
        p1.setLayout(null);
        add(p1);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/login.png"));
        Image i2 = i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(100,120,200,200);
        p1.add(image);
        
        JPanel p2= new JPanel();
        p2.setLayout(null);
        p2.setBounds(400,30,450,300);
        add(p2);
        JLabel lblusername =  new JLabel("Username");
        lblusername.setBounds(60,20,100,25);
        lblusername.setFont(new Font("MONO SPACED",Font.PLAIN,20));
        p2.add(lblusername);
        
        setVisible(true);
    }
    public static void main(String []args){
        new Login();
    }
}
