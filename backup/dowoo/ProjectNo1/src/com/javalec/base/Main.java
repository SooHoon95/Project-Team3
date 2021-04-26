package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main {

	private JFrame frame;
	private JPanel login;
	private JPanel mainTop;
	private JPanel mainUserMenu;
	private JPanel mainAdMenu;
	private JPanel userProfile;
	private JPanel userMbti;
	private JPanel userQuiz;
	private JPanel manageUser;
	private JPanel manageMbtiResults;
	private JPanel manageMbtiQuiz;
	private JPanel manageQuiz;
	private JPanel statistics;
	private JLabel lblNewLabel;
	private JLabel lbId;
	private JButton btnHome;
	private JRadioButton rdbtMbti1;
	private JRadioButton rdbtMbti2;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField tfMbitQuiz;
	private JLabel lblMbti;
	private JRadioButton rdbtQuiz1;
	private JRadioButton rdbtQuiz2;
	private JTextField tfQuiz;
	private JLabel lblMbti_1;
	private JButton btnManageMbtiResults;
	private JButton btnManageMbtiQuiz;
	private JButton btnManageQuiz;
	private JButton btnStatistics;
	private JButton btnManageUser;

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
		frame = new JFrame();
		frame.setBounds(100, 100, 720, 480);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getMainUserMenu());
		frame.getContentPane().add(getMainAdMenu());
		frame.getContentPane().add(getUserQuiz());
		frame.getContentPane().add(getUserMbti());
		frame.getContentPane().add(getMainTop());
		frame.getContentPane().add(getManageQuiz());
		frame.getContentPane().add(getUserProfile());
		frame.getContentPane().add(getManageUser());
		frame.getContentPane().add(getManageMbtiResults());
		frame.getContentPane().add(getManageMbtiQuiz());
		frame.getContentPane().add(getStatistics());
		frame.getContentPane().add(getLogin());
		
	}
	private JPanel getLogin() {
		if (login == null) {
			login = new JPanel();
			login.setBackground(Color.RED);
			login.setBounds(0, 0, 704, 441);
			login.setLayout(null);
			login.setVisible(false);

		}
		return login;
	}
	private JPanel getMainTop() {
		if (mainTop == null) {
			mainTop = new JPanel();
			mainTop.setBackground(Color.MAGENTA);
			mainTop.setBounds(0, 0, 704, 45);
			mainTop.setLayout(null);
			mainTop.add(getLblNewLabel());
			mainTop.add(getLbId());
			mainTop.add(getBtnHome());
			mainTop.setVisible(true);
		}
		return mainTop;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Name");
			lblNewLabel.setBounds(37, 10, 121, 25);
		}
		return lblNewLabel;
	}
	private JLabel getLbId() {
		if (lbId == null) {
			lbId = new JLabel("name");
			lbId.setBounds(537, 10, 102, 25);
			lbId.setHorizontalAlignment(SwingConstants.RIGHT);
		}
		return lbId;
	}
	private JButton getBtnHome() {
		if (btnHome == null) {
			btnHome = new JButton("H");
			btnHome.setBounds(651, 10, 41, 24);
		}
		return btnHome;
	}
	private JPanel getMainUserMenu() {
		if (mainUserMenu == null) {
			mainUserMenu = new JPanel();
			mainUserMenu.setBackground(Color.LIGHT_GRAY);
			mainUserMenu.setBounds(0, 45, 165, 396);
			mainUserMenu.setVisible(false);
			
		}
		return mainUserMenu;
	}
	private JPanel getMainAdMenu() {

		if (mainAdMenu == null) {
			mainAdMenu = new JPanel();
			mainAdMenu.setBackground(Color.RED);
			mainAdMenu.setBounds(0, 45, 165, 396);
			mainAdMenu.setLayout(null);
			mainAdMenu.add(getBtnManageUser());
			mainAdMenu.add(getBtnManageMbtiResults());
			mainAdMenu.add(getBtnManageMbtiQuiz());
			mainAdMenu.add(getBtnManageQuiz());
			mainAdMenu.add(getBtnStatistics());
			mainAdMenu.setVisible(true);
			
			
		}
		return mainAdMenu;
	}
	private JButton getBtnManageUser() {
		if (btnManageUser == null) {
			btnManageUser = new JButton("회원관리");
			btnManageUser.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					manageUser.setVisible(true);
					manageMbtiResults.setVisible(false);
					manageMbtiQuiz.setVisible(false);
					manageQuiz.setVisible(false);
					statistics.setVisible(false);
				}
			});
			btnManageUser.setBounds(29, 46, 110, 23);
		}
		return btnManageUser;
	}
	private JButton getBtnManageMbtiResults() {
		if (btnManageMbtiResults == null) {
			btnManageMbtiResults = new JButton("MBTI결과관리");
			btnManageMbtiResults.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					manageUser.setVisible(false);
					manageMbtiResults.setVisible(true);
					manageMbtiQuiz.setVisible(false);
					manageQuiz.setVisible(false);
					statistics.setVisible(false);
					
				}
			});
			btnManageMbtiResults.setBounds(29, 115, 110, 23);
		}
		return btnManageMbtiResults;
	}
	private JButton getBtnManageMbtiQuiz() {
		if (btnManageMbtiQuiz == null) {
			btnManageMbtiQuiz = new JButton("MBTI문제관리");
			btnManageMbtiQuiz.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					manageUser.setVisible(false);
					manageMbtiResults.setVisible(false);
					manageMbtiQuiz.setVisible(true);
					manageQuiz.setVisible(false);
					statistics.setVisible(false);
				}
			});
			btnManageMbtiQuiz.setBounds(29, 184, 110, 23);
		}
		return btnManageMbtiQuiz;
	}
	private JButton getBtnManageQuiz() {
		if (btnManageQuiz == null) {
			btnManageQuiz = new JButton("문제관리");
			btnManageQuiz.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					manageUser.setVisible(false);
					manageMbtiResults.setVisible(false);
					manageMbtiQuiz.setVisible(false);
					manageQuiz.setVisible(true);
					statistics.setVisible(false);
				}
			});
			btnManageQuiz.setBounds(29, 253, 110, 23);
		}
		return btnManageQuiz;
	}
	private JButton getBtnStatistics() {
		if (btnStatistics == null) {
			btnStatistics = new JButton("통계");
			btnStatistics.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					manageUser.setVisible(false);
					manageMbtiResults.setVisible(false);
					manageMbtiQuiz.setVisible(false);
					manageQuiz.setVisible(false);
					statistics.setVisible(true);
				}
			});
			btnStatistics.setBounds(29, 322, 110, 23);
		}
		return btnStatistics;
	}

	private JPanel getUserProfile() {
		if (userProfile == null) {
			userProfile = new JPanel();
			userProfile.setBackground(Color.PINK);
			userProfile.setBounds(165, 45, 539, 396);
			userProfile.setVisible(false);
			
		}
		return userProfile;
	}
	private JPanel getUserMbti() {
		if (userMbti == null) {
			userMbti = new JPanel();
			userMbti.setBackground(Color.ORANGE);
			userMbti.setBounds(165, 45, 539, 396);
			userMbti.setLayout(null);
			userMbti.add(getRdbtMbti1());
			userMbti.add(getRdbtMbti2());
			userMbti.add(getTfMbitQuiz());
			userMbti.add(getLblMbti());
			userMbti.setVisible(false);
			
		}
		return userMbti;
	}
	private JRadioButton getRdbtMbti1() {
		if (rdbtMbti1 == null) {
			rdbtMbti1 = new JRadioButton("New radio button");
			buttonGroup.add(rdbtMbti1);
			rdbtMbti1.setBounds(160, 265, 257, 23);
		}
		return rdbtMbti1;
	}
	private JRadioButton getRdbtMbti2() {
		if (rdbtMbti2 == null) {
			rdbtMbti2 = new JRadioButton("New radio button");
			buttonGroup.add(rdbtMbti2);
			rdbtMbti2.setBounds(160, 303, 257, 23);
		}
		return rdbtMbti2;
	}
	private JTextField getTfMbitQuiz() {
		if (tfMbitQuiz == null) {
			tfMbitQuiz = new JTextField();
			tfMbitQuiz.setBounds(40, 89, 459, 129);
			tfMbitQuiz.setColumns(10);
		}
		return tfMbitQuiz;
	}
	private JLabel getLblMbti() {
		if (lblMbti == null) {
			lblMbti = new JLabel("MBTI");
			lblMbti.setBounds(12, 10, 121, 25);
		}
		return lblMbti;
	}
	private JPanel getUserQuiz() {
		if (userQuiz == null) {
			userQuiz = new JPanel();
			userQuiz.setBackground(Color.MAGENTA);
			userQuiz.setBounds(165, 45, 539, 396);
			userQuiz.setLayout(null);
			userQuiz.add(getRdbtQuiz1());
			userQuiz.add(getRdbtQuiz2());
			userQuiz.add(getTfQuiz());
			userQuiz.add(getLblMbti_1());
			userQuiz.setVisible(false);
			
		}
		return userQuiz;
	}
	private JRadioButton getRdbtQuiz1() {
		if (rdbtQuiz1 == null) {
			rdbtQuiz1 = new JRadioButton("New radio button");
			rdbtQuiz1.setBounds(159, 265, 257, 23);
		}
		return rdbtQuiz1;
	}
	private JRadioButton getRdbtQuiz2() {
		if (rdbtQuiz2 == null) {
			rdbtQuiz2 = new JRadioButton("New radio button");
			rdbtQuiz2.setBounds(159, 303, 257, 23);
		}
		return rdbtQuiz2;
	}
	private JTextField getTfQuiz() {
		if (tfQuiz == null) {
			tfQuiz = new JTextField();
			tfQuiz.setColumns(10);
			tfQuiz.setBounds(39, 89, 459, 129);
		}
		return tfQuiz;
	}
	private JLabel getLblMbti_1() {
		if (lblMbti_1 == null) {
			lblMbti_1 = new JLabel("MBTI");
			lblMbti_1.setBounds(12, 10, 121, 25);
		}
		return lblMbti_1;
	}
	private JPanel getManageUser() {
		if (manageUser == null) {
			manageUser = new JPanel();
			manageUser.setBackground(Color.YELLOW);
			manageUser.setBounds(165, 45, 539, 396);
			manageUser.setVisible(false);
			
		}
		return manageUser;
	}
	private JPanel getManageMbtiResults() {
		if (manageMbtiResults == null) {
			manageMbtiResults = new JPanel();
			manageMbtiResults.setBackground(Color.GREEN);
			manageMbtiResults.setBounds(165, 45, 539, 396);
			manageMbtiResults.setVisible(false);
			
		}
		return manageMbtiResults;
	}
	private JPanel getManageMbtiQuiz() {
		if (manageMbtiQuiz == null) {
			manageMbtiQuiz = new JPanel();
			manageMbtiQuiz.setBackground(Color.BLUE);
			manageMbtiQuiz.setBounds(165, 45, 539, 396);
			manageMbtiQuiz.setVisible(false);
			
		}
		return manageMbtiQuiz;
	}
	private JPanel getManageQuiz() {
		if (manageQuiz == null) {
			manageQuiz = new JPanel();
			manageQuiz.setBackground(Color.CYAN);
			manageQuiz.setBounds(165, 45, 539, 396);
			manageQuiz.setLayout(null);
			manageQuiz.setVisible(false);
			
		}
		return manageQuiz;
	}
	private JPanel getStatistics() {
		if (statistics == null) {
			statistics = new JPanel();
			statistics.setBackground(Color.BLACK);
			statistics.setBounds(165, 45, 539, 396);
			statistics.setVisible(false);
		}
		
		return statistics;
	}

}//////////////////////////////////////
