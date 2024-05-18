/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.managerhr;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.concurrent.atomic.AtomicInteger;
/**
 *
 * @author macaj
 */
public class EmployeeManager {
    private JFrame frame;
    private JTabbedPane tabbedPane;
    private JTextArea requestArea;
    private JTextArea responseArea;
    
    public static void main(String[] args) {
        // TODO code application logic here
        SwingUtilities.invokeLater(() 
                -> new EmployeeManager().createAndShowGUI());
    }
    private void createAndShowGUI() {
        frame = new JFrame("Employee Manager");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);

        tabbedPane = new JTabbedPane();

        // Create the employee information tab
        JPanel infoPanel = new JPanel();
        infoPanel.add(new JLabel("Employee information would go here."));
        tabbedPane.addTab("Employee Info", infoPanel);

        // Create the request management tab
        JPanel requestPanel = new JPanel();
        requestArea = new JTextArea(10, 40);
        requestArea.setText("Employee requests would be listed here.");
        requestPanel.add(requestArea);
        JButton acceptButton = new JButton("Accept Request");
        acceptButton.addActionListener(e -> processRequest(true));
        requestPanel.add(acceptButton);
        JButton declineButton = new JButton("Decline Request");
        declineButton.addActionListener(e -> processRequest(false));
        requestPanel.add(declineButton);
        tabbedPane.addTab("Manage Requests", requestPanel);

        // Create the employee profile tab
        JPanel profilePanel = new JPanel();
        responseArea = new JTextArea(10, 40);
        responseArea.setText("Responses to employee requests would be reflected here.");
        profilePanel.add(responseArea);
        tabbedPane.addTab("Employee Profile", profilePanel);

        frame.getContentPane().add(tabbedPane, BorderLayout.CENTER);
        frame.setVisible(true);
    }

    private void processRequest(boolean accepted) {
        // This is where you would process the request and update the employee's profile
        String response = accepted ? "Request accepted." : "Request declined.";
        responseArea.setText(response);
    }
   
}