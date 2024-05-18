/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.managerhr;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class HRSystems {
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("HR System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        JTabbedPane tabbedPane = new JTabbedPane();

        // Employee Tab
        JPanel employeePanel = new JPanel(new BorderLayout());
        JPanel employeeForm = new JPanel(new GridLayout(0, 2));
        JTextArea employeeRecords = new JTextArea(20, 40);
        employeeRecords.setEditable(false);
        JTextField nameField = new JTextField();
        JTextField jobField = new JTextField();
        JTextArea performanceReviews = new JTextArea(5, 40);

        employeeForm.add(new JLabel("Name:"));
        employeeForm.add(nameField);
        employeeForm.add(new JLabel("Job Title:"));
        employeeForm.add(jobField);
        employeeForm.add(new JLabel("Performance Reviews:"));
        employeeForm.add(new JScrollPane(performanceReviews));

        employeePanel.add(employeeForm, BorderLayout.NORTH);
        employeePanel.add(new JScrollPane(employeeRecords), BorderLayout.CENTER);

        // Request Tab
        JPanel requestPanel = new JPanel(new BorderLayout());
        JTextArea requestStatus = new JTextArea(20, 40);
        requestStatus.setEditable(false);
        JTextField requestField = new JTextField();
        JButton submitRequestButton = new JButton("Submit Request");

        JPanel requestForm = new JPanel(new GridLayout(0, 2));
        requestForm.add(new JLabel("Request Reason:"));
        requestForm.add(requestField);
        requestForm.add(submitRequestButton);

        requestPanel.add(requestForm, BorderLayout.NORTH);
        requestPanel.add(new JScrollPane(requestStatus), BorderLayout.CENTER);

        submitRequestButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String requestReason = requestField.getText();
                if (!requestReason.isEmpty()) {
                    requestStatus.append("Request submitted: " + requestReason + "\nPending Approval\n\n");
                    requestField.setText("");
                }
            }
        });

        // Manager Tab
        JPanel managerPanel = new JPanel(new BorderLayout());
        JTextArea managerRequests = new JTextArea(20, 40);
        managerRequests.setEditable(false);
        JTextField requestIdField = new JTextField();
        JButton approveButton = new JButton("Approve");
        JButton declineButton = new JButton("Decline");

        JPanel managerForm = new JPanel(new GridLayout(0, 2));
        managerForm.add(new JLabel("Request ID:"));
        managerForm.add(requestIdField);
        managerForm.add(approveButton);
        managerForm.add(declineButton);

        managerPanel.add(managerForm, BorderLayout.NORTH);
        managerPanel.add(new JScrollPane(managerRequests), BorderLayout.CENTER);

        approveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String requestId = requestIdField.getText();
                if (!requestId.isEmpty()) {
                    managerRequests.append("Request ID " + requestId + " approved.\n");
                    requestIdField.setText("");
                }
            }
        });

        declineButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String requestId = requestIdField.getText();
                if (!requestId.isEmpty()) {
                    managerRequests.append("Request ID " + requestId + " declined.\n");
                    requestIdField.setText("");
                }
            }
        });

        // Adding Tabs to TabbedPane
        tabbedPane.addTab("Employee", employeePanel);
        tabbedPane.addTab("Request", requestPanel);
        tabbedPane.addTab("Manager", managerPanel);

        // Adding TabbedPane to Frame
        frame.getContentPane().add(tabbedPane);
        frame.setVisible(true);
    }
    
}
