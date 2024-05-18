/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication5;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class AddEmployee extends JFrame implements ActionListener {
    
    Random ran = new Random();
    int number = ran.nextInt(999999);
    
    public JButton addss, back;
    JTextField tfname, tfdep, tfaddress, tfphone, tfem, tfsalary, tfage;
    JComboBox cbeducation;
    JLabel lblempId;
    
    AddEmployee(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading = new JLabel("Employee Information");
        heading.setBounds(320, 30, 500, 50);
        heading.setFont(new Font("SAN_SERIF", Font.BOLD, 25));
        add(heading);
        
        JLabel labelname = new JLabel("Name");
        labelname.setBounds(100, 150, 150, 30);
        labelname.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelname);
        
        JTextField tfname = new JTextField();
        tfname.setBounds(250, 150, 150, 30);
        add(tfname);
        
        JLabel labeldep = new JLabel("Department");
        labeldep.setBounds(450, 150, 150, 30);
        labeldep.setFont(new Font("serif", Font.PLAIN, 20));
        add(labeldep);
        
        JTextField tfdep = new JTextField();
        tfdep.setBounds(650, 150, 150, 30);
        add(tfdep);
                        
        JLabel labelage = new JLabel("Age");
        labelage.setBounds(100, 200, 150, 30);
        labelage.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelage);
        
        JTextField tfage = new JTextField();
        tfage.setBounds(250, 200, 150, 30);
        add(tfage);
        
        JLabel labeladdr = new JLabel("Address");
        labeladdr.setBounds(100, 250, 150, 30);
        labeladdr.setFont(new Font("serif", Font.PLAIN, 20));
        add(labeladdr);
        
        JTextField tfaddr = new JTextField();
        tfaddr.setBounds(250, 250, 150, 30);
        add(tfaddr);
        
        JLabel labelem = new JLabel("Email");
        labelem.setBounds(100, 300, 150, 30);
        labelem.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelem);
        
        JTextField tfem = new JTextField();
        tfem.setBounds(250, 300, 150, 30);
        add(tfem);
        
        JLabel labelsalary = new JLabel("Salary");
        labelsalary.setBounds(450, 200, 150, 30);
        labelsalary.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelsalary);
        
        tfsalary = new JTextField();
        tfsalary.setBounds(650, 200, 150, 30);
        add(tfsalary);
        
        JLabel labeleducation = new JLabel("Higest Education");
        labeleducation.setBounds(450, 300, 150, 30);
        labeleducation.setFont(new Font("serif", Font.PLAIN, 20));
        add(labeleducation);
        
        String courses[] = {};
        cbeducation = new JComboBox(courses);
        cbeducation.setBackground(Color.WHITE);
        cbeducation.setBounds(650, 300, 150, 30);
        add(cbeducation);

         JLabel labelempId = new JLabel("Employee ID");
        labelempId.setBounds(100, 350, 150, 30);
        labelempId.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelempId);
        
        lblempId = new JLabel("" + number);
        lblempId.setBounds(250, 350, 150, 30);
        lblempId.setFont(new Font("serif", Font.PLAIN, 20));
        add(lblempId);
        
         JLabel labelphone = new JLabel("Phone");
        labelphone.setBounds(450, 250, 150, 30);
        labelphone.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelphone);
        
        tfphone = new JTextField();
        tfphone.setBounds(650, 250, 150, 30);
        add(tfphone);
        
        addss = new JButton("Add Details");
        addss.setBounds(270, 550, 150, 40);
        addss.addActionListener(this);
        addss.setBackground(Color.BLACK);
        addss.setForeground(Color.WHITE);
        add(addss);
        
        back = new JButton("Back");
        back.setBounds(450, 550, 150, 40);
        back.addActionListener(this);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        add(back);
                
        setSize(900, 700);
        setLocation(300, 50);
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == addss){
            
        String name = tfname.getText();
            String fname = tfdep.getText();
            
            String salary = tfsalary.getText();
            String address = tfaddress.getText();
            String phone = tfphone.getText();
            String email = tfem.getText();
            String education = (String) cbeducation.getSelectedItem();
            String age = tfage.getText();
            String empId = lblempId.getText();
            
            try {
                
                setVisible(false);
                new HRStaff();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            setVisible(false);
            new HRStaff();
        }
    }
            
    public static void main(String [] args){
        new AddEmployee();
        
    }
}