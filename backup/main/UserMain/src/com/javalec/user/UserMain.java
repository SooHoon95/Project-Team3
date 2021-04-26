package com.javalec.user;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UserMain extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JPanel panelUserPrifile;
	private JButton btnUserProfile;
	private JButton btnUserMbti;
	private JButton btnUserQuiz;
	private JButton btnUserStatistic;
	private JPanel panelUserMbti;
	private JPanel panelUserQuiz;
	private JPanel panelUserStatistic;

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
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		contentPanel.add(getPanelUserPrifile());
		contentPanel.add(getBtnUserProfile());
		contentPanel.add(getBtnUserMbti());
		contentPanel.add(getBtnUserQuiz());
		contentPanel.add(getBtnUserStatistic());
		contentPanel.add(getPanelUserMbti());
		contentPanel.add(getPanelUserQuiz());
		contentPanel.add(getPanelUserStatistic());
	}
	private JPanel getPanelUserPrifile() {
		if (panelUserPrifile == null) {
			panelUserPrifile = new JPanel();
			panelUserPrifile.setBounds(180, 10, 500, 420);
			panelUserPrifile.setVisible(false);
		}
		return panelUserPrifile;
	}
	private JPanel getPanelUserMbti() {
		if (panelUserMbti == null) {
			panelUserMbti = new JPanel();
			panelUserMbti.setBounds(180, 10, 500, 420);
			panelUserMbti.setVisible(false);
		}
		return panelUserMbti;
	}
	private JPanel getPanelUserQuiz() {
		if (panelUserQuiz == null) {
			panelUserQuiz = new JPanel();
			panelUserQuiz.setBounds(180, 10, 500, 420);
			panelUserQuiz.setVisible(false);
		}
		return panelUserQuiz;
	}
	private JPanel getPanelUserStatistic() {
		if (panelUserStatistic == null) {
			panelUserStatistic = new JPanel();
			panelUserStatistic.setBounds(180, 10, 500, 420);
			panelUserStatistic.setVisible(false);
		}
		return panelUserStatistic;
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
	private JButton getBtnUserQuiz() {
		if (btnUserQuiz == null) {
			btnUserQuiz = new JButton("적성검사");
			btnUserQuiz.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					RestPanel();
					panelUserQuiz.setVisible(true);
				}
			});
			btnUserQuiz.setBounds(30, 250, 120, 35);
		}
		return btnUserQuiz;
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
	
	public void RestPanel() {
		panelUserPrifile.setVisible(false);
		panelUserMbti.setVisible(false);
		panelUserQuiz.setVisible(false);
		panelUserStatistic.setVisible(false);
		
	}
}
