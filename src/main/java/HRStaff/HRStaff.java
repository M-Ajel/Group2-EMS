import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Darius Duke
 */
public class HRStaff implements ActionListener {
    
    private JLabel lblEmployeeManagement;
    private JFrame f = new JFrame("HR Staff");
    private JButton btnEmployeeRecords, btnJobDetail, btnPerformanceRecord, btnEmployeeRequest;
   
    HRStaff(){
    
    f.setSize(800, 500);
    f.setLayout(null);
    f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
    
    lblEmployeeManagement= new JLabel("Employee Managemant System");
    lblEmployeeManagement.setBounds(225, 50, 500, 40);
    lblEmployeeManagement.setFont(new Font("Arial Black", Font.PLAIN, 20));
            
    btnEmployeeRecords = new JButton("Employee Records");
    btnEmployeeRecords.setBounds(180, 150, 200, 40);
    btnEmployeeRecords.setFont(new Font("Arial Black", Font.PLAIN, 15));
    btnEmployeeRecords.addActionListener(this);
   
    btnJobDetail = new JButton("Job Detail");
    btnJobDetail.setBounds(180, 200, 200, 40);
    btnJobDetail.setFont(new Font("Arial Black", Font.PLAIN, 15));
    btnJobDetail.addActionListener(this);
    
    btnPerformanceRecord = new JButton("Performance");
    btnPerformanceRecord.setBounds(400, 150, 200, 40);
    btnPerformanceRecord.setFont(new Font("Arial Black", Font.PLAIN, 15));
    btnPerformanceRecord.addActionListener(this);
    
    btnEmployeeRequest = new JButton("Employee Request");
    btnEmployeeRequest.setBounds(400, 200, 200, 40);
    btnEmployeeRequest.setFont(new Font("Arial Black", Font.PLAIN, 15));
    btnEmployeeRequest.addActionListener(this);
    
    
    f.add(btnEmployeeRecords);
    f.add(btnJobDetail);
    f.add(btnPerformanceRecord);
    f.add(btnEmployeeRequest);
    f.add(lblEmployeeManagement);
    
    f.setVisible(true);
    f.setResizable(false);
    
    
  }
    @Override
    public void actionPerformed(ActionEvent e){
   }
}