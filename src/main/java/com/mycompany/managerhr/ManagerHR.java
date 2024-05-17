/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.managerhr;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author macaj
 */
public class ManagerHR extends JFrame {
    private final JTable employeeTable;
    private final JTextArea infoArea;
    private final JTextArea jobDescArea;
    private final JTextArea reviewArea;
    private final JTable requestTable;
    private final JButton approveButton;
    private final JButton declineButton;

    /**
     *
     */
    public ManagerHR() {
        setTitle("Employee Records Management");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JTabbedPane tabbedPane = new JTabbedPane();

        // Employees Tab
        JPanel employeesPanel = new JPanel(new BorderLayout());
        employeeTable = new JTable(new DefaultTableModel(new Object[]{"ID", "Name", "Job Description", "Performance Review"}, 0));
        employeesPanel.add(new JScrollPane(employeeTable), BorderLayout.CENTER);

        JPanel infoPanel = new JPanel(new GridLayout(3, 1));
        infoArea = new JTextArea("Employee Info");
        jobDescArea = new JTextArea("Job Description");
        reviewArea = new JTextArea("Performance Review");

        /**infoPanel.add(new JScrollPane(infoArea));
        infoPanel.add(new JScrollPane(jobDescArea));
        infoPanel.add(new JScrollPane(reviewArea));**/

        employeesPanel.add(infoPanel, BorderLayout.EAST);

        tabbedPane.addTab("Employees", employeesPanel);

        // Requests Tab
        JPanel requestsPanel = new JPanel(new BorderLayout());
        requestTable = new JTable(new DefaultTableModel(new Object[]{"Request ID", "Employee", "Type", "Details"}, 0));
        requestsPanel.add(new JScrollPane(requestTable), BorderLayout.CENTER);

        JPanel actionPanel = new JPanel();
        approveButton = new JButton("Approve");
        declineButton = new JButton("Decline");

        approveButton.addActionListener((ActionEvent e) -> {
            handleRequest(true);
        });

        declineButton.addActionListener((ActionEvent e) -> {
            handleRequest(false);
        });

        actionPanel.add(approveButton);
        actionPanel.add(declineButton);

        requestsPanel.add(actionPanel, BorderLayout.SOUTH);

        tabbedPane.addTab("Requests", requestsPanel);

        add(tabbedPane);

        loadDummyData();
    }

    private void loadDummyData() {
        DefaultTableModel employeeModel = (DefaultTableModel) employeeTable.getModel();
        employeeModel.addRow(new Object[]{"", ""});
        employeeModel.addRow(new Object[]{"", ""});
        employeeModel.addRow(new Object[]{"", ""});
        employeeModel.addRow(new Object[]{"", ""});
        employeeModel.addRow(new Object[]{"", ""});
        employeeModel.addRow(new Object[]{"", ""});
        employeeModel.addRow(new Object[]{"", ""});
        employeeModel.addRow(new Object[]{"", ""});
        employeeModel.addRow(new Object[]{"", ""});
        employeeModel.addRow(new Object[]{"", ""});

        DefaultTableModel requestModel = (DefaultTableModel) requestTable.getModel();
        requestModel.addRow(new Object[]{"", "", "", ""});
        requestModel.addRow(new Object[]{"", "", "", ""});
        requestModel.addRow(new Object[]{"", "", "", ""});
        requestModel.addRow(new Object[]{"", "", "", ""});
        requestModel.addRow(new Object[]{"", "", "", ""});
        requestModel.addRow(new Object[]{"", "", "", ""});
        requestModel.addRow(new Object[]{"", "", "", ""});
        requestModel.addRow(new Object[]{"", "", "", ""});
        requestModel.addRow(new Object[]{"", "", "", ""});
        requestModel.addRow(new Object[]{"", "", "", ""});
    }

    private void handleRequest(boolean approve) {
        int selectedRow = requestTable.getSelectedRow();
        if (selectedRow >= 0) {
            String requestId = (String) requestTable.getValueAt(selectedRow, 0);
            String employeeName = (String) requestTable.getValueAt(selectedRow, 1);
            String requestType = (String) requestTable.getValueAt(selectedRow, 2);

            String message = approve ? "approved" : "declined";
            JOptionPane.showMessageDialog(this, "Request " + requestId + " by " + employeeName + " for " + requestType + " has been " + message + ".");
            ((DefaultTableModel) requestTable.getModel()).removeRow(selectedRow);
        } else {
            JOptionPane.showMessageDialog(this, "Please select a request to proceed.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new ManagerHR().setVisible(true);
        });
    }
}
