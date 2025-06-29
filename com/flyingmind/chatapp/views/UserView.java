package com.flyingmind.chatapp.views;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class UserView extends JFrame {
	int count ;
	public UserView() {
		count = 0;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,400);
		setResizable(false);
		setTitle("Login");
		
		JLabel welcome = new JLabel("Login");
		welcome.setFont(new Font("Arial",Font.BOLD,40));
		Container con = this.getContentPane();
		con.setLayout(null);
		welcome.setBounds(100,70,150,60);
		con.add(welcome);
		setLocationRelativeTo(null);
		JButton btn = new JButton("Count");
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				count++;
				welcome.setText("count " + count);
			}
		});
		btn.setBounds(100,200 , 150, 50);
		con.add(btn);
		
		setVisible(true);
	}
	
 public static void main(String[] args) {
	 UserView userview = new UserView();
 }
}
