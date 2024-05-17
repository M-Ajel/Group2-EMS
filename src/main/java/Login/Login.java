/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Login;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Darius Duke
 */
public class Login implements ActionListener {
    
    private JFrame f = new JFrame("Login");
    private JLabel lblUsername, lblPassword, lblLoginResults;
    private JTextField txtfldUsername = new JTextField();
    private JPasswordField psswrdfldPassword = new JPasswordField();
    private JButton btnLogIn, btnReset;
   

    
    Login(){
    
    f.setSize(450, 300);
    f.setLayout(null);
    f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
    
    lblUsername = new JLabel("Username:");
    lblUsername.setBounds(20, 50, 120, 30);
    lblUsername.setFont(new Font("Arial Black", Font.BOLD, 15));
    
    lblPassword = new JLabel("Password:");
    lblPassword.setBounds(20, 100, 120, 30);
    lblPassword.setFont(new Font("Arial Black", Font.BOLD, 15));
    
    txtfldUsername.setBounds(140, 50, 100,30);
    txtfldUsername.setFont(new Font("Arial", Font.PLAIN, 15));
    
    psswrdfldPassword.setBounds(140, 100, 100,30);
    psswrdfldPassword.setFont(new Font("Arial", Font.PLAIN, 15));
    
    btnLogIn = new JButton("LogIn");
    btnLogIn.setBounds(30, 150, 100, 30);
    btnLogIn.setBackground(Color.BLACK);
    btnLogIn.setForeground(Color.WHITE);
    btnLogIn.setFont(new Font("Arial Black", Font.PLAIN, 15));
    btnLogIn.addActionListener(this);
   
    btnReset = new JButton("Clear");
    btnReset.setBounds(160, 150, 100, 30);
    btnReset.setBackground(Color.BLACK);
    btnReset.setForeground(Color.WHITE);
    btnReset.setFont(new Font("Arial Black", Font.PLAIN, 15));
    btnReset.addActionListener(this);
    
    lblLoginResults = new JLabel("");
    lblLoginResults.setBounds(20, 200, 480, 30);
    lblLoginResults.setFont(new Font("Arial", Font.PLAIN, 15));
    
    f.add(lblUsername);
    f.add(lblPassword);
    f.add(txtfldUsername);
    f.add(psswrdfldPassword);
    f.add(btnLogIn);
    f.add(btnReset);
    f.add(lblLoginResults);
    
   
    f.setVisible(true);
    f.setResizable(false);
        
        
        
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == btnLogIn){
           String username = txtfldUsername.getText();
           String password = psswrdfldPassword.getText();
           lblLoginResults.setText("");
           
        }else if(e.getSource() == btnReset){
           txtfldUsername.setText("");
           psswrdfldPassword.setText("");
           lblLoginResults.setText("");
            
        }
        
    }
    
}