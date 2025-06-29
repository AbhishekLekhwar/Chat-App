package com.flyingmind.chatapp.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UserScreen extends JFrame {
	private JTextField textField;
	private JPasswordField passwordField;

	
	public static void main(String[] args) {
		
					UserScreen window = new UserScreen();
	}

	/**
	 * Create the application.
	 */
	public UserScreen() {
		setResizable(false);
		setTitle("Login");
		getContentPane().setBackground(new Color(255, 255, 255));
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(219, 33, 79, 27);
		getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(236, 91, 233, 33);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel userid = new JLabel("UserID :");
		userid.setFont(new Font("Tahoma", Font.PLAIN, 18));
		userid.setHorizontalAlignment(SwingConstants.CENTER);
		userid.setBounds(105, 91, 68, 27);
		getContentPane().add(userid);
		
		JLabel pwd = new JLabel("Password :");
		pwd.setHorizontalAlignment(SwingConstants.CENTER);
		pwd.setFont(new Font("Tahoma", Font.PLAIN, 18));
		pwd.setBounds(82, 178, 93, 27);
		getContentPane().add(pwd);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(236, 178, 233, 33);
		getContentPane().add(passwordField);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBackground(new Color(0, 128, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(175, 262, 89, 23);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Register");
		btnNewButton_1.setBackground(new Color(0, 128, 255));
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1.setBounds(303, 262, 89, 23);
		getContentPane().add(btnNewButton_1);
		setBounds(100, 100, 630, 372);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
}
