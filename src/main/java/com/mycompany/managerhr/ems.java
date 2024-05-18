/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.managerhr;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


/**
 *
 * @author macaj
 */
public class ems {
    private JFrame frame;
    private JTabbedPane tabbedPane;
    
    public static void main(String[] args) {
        // TODO code application logic here
        SwingUtilities.invokeLater(() -> 
                new ems().createAndShowGUI());
    }
    private void createAndShowGUI() {
        frame = new JFrame("Employee Management System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);

        tabbedPane = new JTabbedPane();

        // Create the employee records tab
        JPanel recordsPanel = new JPanel();
        recordsPanel.add(new JLabel("Employee records would go here."));
        tabbedPane.addTab("Employee Records", recordsPanel);

        // Create the performance reviews tab
        JPanel reviewsPanel = new JPanel();
        reviewsPanel.add(new JLabel("Performance reviews would go here."));
        tabbedPane.addTab("Performance Reviews", reviewsPanel);

        // Create the request management tab
        JPanel requestsPanel = new JPanel();
        JButton timeOffButton = new JButton("Time Off Request");
        timeOffButton.addActionListener(e -> processRequest("Time Off"));
        requestsPanel.add(timeOffButton);
        JButton expensesButton = new JButton("Expenses Request");
        expensesButton.addActionListener(e -> processRequest("Expenses"));
        requestsPanel.add(expensesButton);
        tabbedPane.addTab("Manage Requests", requestsPanel);

        frame.getContentPane().add(tabbedPane, BorderLayout.CENTER);
        frame.setVisible(true);
    }

    private void processRequest(String requestType) {
        // This is where you would process the request
        JOptionPane.showMessageDialog(frame, requestType + " request processed.");
    }
}
