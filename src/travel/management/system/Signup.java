package travel.management.system;
import java.awt.*; 
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;


public class Signup extends JFrame implements ActionListener{
    JButton create,back;
    JTextField tfusername,tfname,tfpassword,tfanswer;
    Choice securt; 
    Signup(){
        setBounds(350,200,900,360);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JPanel p1= new JPanel();
        p1.setBackground( new Color(255,20,60));
        p1.setBounds(0,0,500,400);
        add(p1);
        p1.setLayout(null);
        
        
        JLabel lblusername = new JLabel("Username");
        lblusername.setFont(new Font ("Tahoma",Font.BOLD,14));
        lblusername.setBounds(50,20,125,25);
        p1.add(lblusername);
        
        tfusername = new JTextField();
        tfusername.setBounds(190,20,180,25);
        tfusername.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfusername);
        
        JLabel lblname = new JLabel("Name");
        lblname.setFont(new Font ("Tahoma",Font.BOLD,14));
        lblname.setBounds(50,60,125,25);
        p1.add(lblname);
        
        tfname = new JTextField();
        tfname.setBounds(190,60,180,25);
        tfname.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfname);
        
        JLabel password = new JLabel("Password");
        password.setFont(new Font ("Tahoma",Font.BOLD,14));
        password.setBounds(50,100,125,25);
        p1.add(password);
        
        tfpassword = new JTextField();
        tfpassword.setBounds(190,100,180,25);
        tfpassword.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfpassword);
        
        JLabel secur = new JLabel("Security Question");
        secur.setFont(new Font ("Tahoma",Font.BOLD,14));
        secur.setBounds(50,140,125,25);
        p1.add(secur);
        
        
        securt = new Choice();
        securt.add("Fav Character from the Boys");
        securt.add("Captain America or Thor");
        securt.add("your Lucky number ");
        securt.setBounds(190,140,180,25);
        p1.add(securt);
        
        
        JLabel answer = new JLabel("Answer");
        answer.setFont(new Font ("Tahoma",Font.BOLD,14));
        answer.setBounds(50,180,125,25);
        p1.add(answer);
        
        tfanswer = new JTextField();
        tfanswer.setBounds(190,180,180,25);
        tfanswer.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfanswer);
        
        
        create = new JButton("Create");
        create.setBackground(Color.WHITE);
        create.setForeground(new Color(255,20,60));
        create.setFont(new Font("Tahoma",Font.BOLD,14));
        create.setBounds(80,250,100,30);
        create.addActionListener(this);
        p1.add(create);
        
        back = new JButton("Back");
        back.setBackground(Color.WHITE);
        back.setForeground(new Color(255,20,60));
        back.setFont(new Font("Tahoma",Font.BOLD,14));
        back.setBounds(250,250,100,30);
        back.addActionListener(this);
        p1.add(back);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/globe.jpg"));
        Image i2 = i1.getImage().getScaledInstance(250,250,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(580,50,250,250);
        
        add(image);
        
        
        setVisible(true);
    }
    
    
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == create){
            String username = tfusername.getText();
            String name = tfname.getText();
            String password = tfpassword.getText();
            String question = securt.getSelectedItem();
            String answer = tfanswer.getText();
            
            String query = "insert into account values('"+username+"','"+name+"','"+password+"','"+question+"','"+answer+"')";
            try{
                Conn c = new Conn();
                c.s.executeUpdate(query);
                
                JOptionPane.showMessageDialog(null,"Account created Successfully");
                
                setVisible(false);
                new Loginn();
            }catch(Exception e){
                e.printStackTrace();
            }
        }else if(ae.getSource() == back){
            
            setVisible(false);
            new Loginn();
}
    }
                public static void main(String[]args){
            new Signup();
        }
}
