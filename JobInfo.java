/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jobinformation;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author Yuki
 */
public class JobInfo implements ActionListener{

    
    private Jlabel lblJobInformation;
    private Jframe f = new Jframe("Job Info");
    private Jbutton btnJobTitle, btnDepartment, btnSalaryRange, btnPerformanceReview
    
    JobInfo(){
        
         f.setSize(800, 500);
    f.setLayout(null);
    f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
    
    lblJobTitle= new JLabel("Job Title");
    lblJobTitle.setBounds(225, 50, 500, 40);
    lblJobTitle.setFont(new Font("Arial Black", Font.PLAIN, 20));
            
        JButton JButton = new JButton("Job Title"); /*jButton*/
    btnJobTitle.setBounds(180, 150, 200, 40);
    btnJobTitle.setFont(new Font("Arial Black", Font.PLAIN, 15));
    btnJobTitle.addActionListener(this);
   
    btnDepartment = new JButton("Department");
    btnDepartment.setBounds(180, 200, 200, 40);
    btnDepartment.setFont(new Font("Arial Black", Font.PLAIN, 15));
    btnDepartment.addActionListener(this);
    
    btnSalaryRange = new JButton("SalaryRange");
    btnSalaryRange.setBounds(400, 150, 200, 40);
    btnSalaryRange.setFont(new Font("Arial Black", Font.PLAIN, 15));
    btnSalaryRange.addActionListener(this);
    
    btnPerformanceReview = new JButton("Performance Review");
    btnPerformanceReview.setBounds(400, 150, 200, 40);
    btnPerformanceReview.setFont(new Font("Arial Black", Font.PLAIN, 15));
    btnPerformanceReview.addActionListener(this);
    
   
    
    f.add(btnJobTitle);
    f.add(btnDepartment);
    f.add(btnSalaryRange);
    f.add(btnPerformanceReview);
   
    
    f.setVisible(true);
    f.setResizable(false);
    
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
