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
public class sample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }
     private static void createAndShowGUI() {
        JFrame frame = new JFrame("Multi-Tab GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);

        JTabbedPane tabbedPane = new JTabbedPane();

        // Create multiple sections
        for (int i = 1; i <= 5; i++) {
            JPanel panel = new JPanel();
            JButton button = new JButton("Open Tab " + i);
            int finalI = i;
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JPanel newPanel = new JPanel();
                    newPanel.add(new JLabel("You are in Tab " + finalI));
                    tabbedPane.addTab("Tab " + finalI, newPanel);
                }
            });
            panel.add(button);
            tabbedPane.addTab("Section " + i, panel);
        }

        frame.getContentPane().add(tabbedPane, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}
