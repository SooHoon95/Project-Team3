package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.javalec.login.Login;
import com.javalec.mainAdmin.MainAdminMenu;

public class Main {

	private JFrame frame;
	Login login = new Login();
	MainAdminMenu mainadminMenu = new MainAdminMenu();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
		frame.setLocationRelativeTo(null);
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame.setBounds(100, 100, 720, 480);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getLogin());
		frame.getContentPane().add(getMainUserMenu());
		frame.getContentPane().add(getMainAdminMenu());
		frame.getContentPane().add(getUserQuiz());
		frame.getContentPane().add(getUserMbti());
		frame.getContentPane().add(getMainTop());
		frame.getContentPane().add(getManageQuiz());
		frame.getContentPane().add(getUserProfile());
		frame.getContentPane().add(getManageUser());
		frame.getContentPane().add(getManageMbtiResults());
		frame.getContentPane().add(getManageMbtiQuiz());
		frame.getContentPane().add(getStatistics());

	}
	public JPanel getLogin() {
		return login;
	}
	public JPanel getMainUserMenu() {
		return login;
	}
	public JPanel getMainAdminMenu() {
		return mainadminMenu;
	}
	public JPanel getUserQuiz() {
		return login;
	}
	public JPanel getUserMbti() {
		return login;
	}
	public JPanel getMainTop() {
		return login;
	}
	public JPanel getManageQuiz() {
		return login;
	}
	public JPanel getUserProfile() {
		return login;
	}
	public JPanel getManageUser() {
		return login;
	}
	public JPanel getManageMbtiResults() {
		return login;
	}
	public JPanel getManageMbtiQuiz() {
		return login;
	}
	public JPanel getStatistics() {
		return login;
	}
}/////////////////////////////////
