package com.javalec.login;

import javax.swing.JPanel;

import com.javalec.base.Main;
import com.javalec.mainAdmin.MainAdminMenu;

import java.awt.Color;
import java.awt.Frame;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JPanel {
	private JLabel lblNewLabel;
	private JButton btnNewButton;
	Main main = new Main();
	MainAdminMenu mainadminMenu = new MainAdminMenu();

	/**
	 * Create the panel.
	 */
	public Login() {
		setLayout(null);
		setBackground(Color.RED);
		setBounds(0, 0, 704, 441);
		add(getLblNewLabel());
		add(getBtnNewButton());
		setVisible(true);

		
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("New label");
			lblNewLabel.setBounds(61, 64, 57, 15);
		}
		return lblNewLabel;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Login");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				
					
				
				}
			});
			btnNewButton.setBounds(61, 123, 97, 23);
		}
		return btnNewButton;
	}
}
