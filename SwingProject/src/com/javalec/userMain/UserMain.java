package com.javalec.userMain;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class UserMain extends JDialog {
	private JButton btnUserProfile;
	private JButton btnUserMbti;
	private JButton btnUserAptitudeQuiz;
	private JButton btnUserStatistic;
	PanelUserProfile panelUserPrifile = new PanelUserProfile();
	PanelUserMbti panelUserMbti = new PanelUserMbti();
	PanelUserAptitudeQuiz panelUserAptitudeQuiz = new PanelUserAptitudeQuiz();
	PanelUserStatistic panelUserStatistic = new PanelUserStatistic();
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UserMain dialog = new UserMain();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public UserMain() {
		setBounds(100, 100, 720, 480);
		getContentPane().setLayout(null);
		getContentPane().add(getBtnUserProfile());
		getContentPane().add(getBtnUserMbti());
		getContentPane().add(getBtnUserAptitudeQuiz());
		getContentPane().add(getBtnUserStatistic());
	}
	private JButton getBtnUserProfile() {
		if (btnUserProfile == null) {
			btnUserProfile = new JButton("프로필");
			btnUserProfile.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					RestPanel();
					panelUserPrifile.setVisible(true);
				}
			});
			btnUserProfile.setBounds(30, 60, 120, 35);
		}
		return btnUserProfile;
	}
	private JButton getBtnUserMbti() {
		if (btnUserMbti == null) {
			btnUserMbti = new JButton("MBTI");
			btnUserMbti.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					RestPanel();
					panelUserMbti.setVisible(true);
				}
			});
			btnUserMbti.setBounds(30, 155, 120, 35);
		}
		return btnUserMbti;
	}
	private JButton getBtnUserAptitudeQuiz() {
		if (btnUserAptitudeQuiz == null) {
			btnUserAptitudeQuiz = new JButton("적성검사");
			btnUserAptitudeQuiz.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					RestPanel();
					panelUserAptitudeQuiz.setVisible(true);
				}
			});
			btnUserAptitudeQuiz.setBounds(30, 250, 120, 35);
		}
		return btnUserAptitudeQuiz;
	}
	private JButton getBtnUserStatistic() {
		if (btnUserStatistic == null) {
			btnUserStatistic = new JButton("통계");
			btnUserStatistic.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					RestPanel();
					panelUserStatistic.setVisible(true);
				}
			});
			btnUserStatistic.setBounds(30, 345, 120, 35);
		}
		return btnUserStatistic;
	}
	
	private void RestPanel() {
		panelUserPrifile.setVisible(false);
		panelUserMbti.setVisible(false);
		panelUserAptitudeQuiz.setVisible(false);
		panelUserStatistic.setVisible(false);
		
	}
}
