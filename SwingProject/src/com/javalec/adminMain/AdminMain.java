package com.javalec.adminMain;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;

public class AdminMain extends JDialog {
	private JButton btnManageUser;
	private JButton btnManageMbtiQuiz;
	private JButton btnManageAptitudeQuiz;
	private JButton btnManageMbtiResults;
	PanelManageUser panelManageUser = new PanelManageUser();
	PanelManageMbtiResult panelManageMbtiResult = new PanelManageMbtiResult();
	PanelManageMbtiQuiz panelManageMbtiQuiz = new PanelManageMbtiQuiz();
	PanelManageAptitudeQuiz panelManageAptitudeQuiz = new PanelManageAptitudeQuiz();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			AdminMain dialog = new AdminMain();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public AdminMain() {
		setBounds(100, 100, 720, 480);
		getContentPane().setLayout(null);
		getContentPane().add(getBtnManageUser());
		getContentPane().add(getBtnManageMbtiQuiz());
		getContentPane().add(getBtnManageAptitudeQuiz());
		getContentPane().add(getBtnManageMbtiResults());
	}

	private JButton getBtnManageUser() {
		if (btnManageUser == null) {
			btnManageUser = new JButton("회원관리");
			btnManageUser.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					RestPanel();
					panelManageUser.setVisible(true);
				}
			});
			btnManageUser.setBounds(30, 60, 120, 35);
		}
		return btnManageUser;
	}
	private JButton getBtnManageMbtiQuiz() {
		if (btnManageMbtiQuiz == null) {
			btnManageMbtiQuiz = new JButton("MBTI문제관리");
			btnManageMbtiQuiz.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					RestPanel();
					panelManageMbtiResult.setVisible(true);
				}
			});
			btnManageMbtiQuiz.setBounds(30, 155, 120, 35);
		}
		return btnManageMbtiQuiz;
	}
	private JButton getBtnManageAptitudeQuiz() {
		if (btnManageAptitudeQuiz == null) {
			btnManageAptitudeQuiz = new JButton("적성문제관리");
			btnManageAptitudeQuiz.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					RestPanel();
					panelManageMbtiQuiz.setVisible(true);
					
				}
			});
			btnManageAptitudeQuiz.setBounds(30, 345, 120, 35);
		}
		return btnManageAptitudeQuiz;
	}
	private JButton getBtnManageMbtiResults() {
		if (btnManageMbtiResults == null) {
			btnManageMbtiResults = new JButton("MBTI결과관리");
			btnManageMbtiResults.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					RestPanel();
					panelManageAptitudeQuiz.setVisible(true);
				}
			});
			btnManageMbtiResults.setBounds(30, 250, 120, 35);
		}
		return btnManageMbtiResults;
	}
	
	private void RestPanel() {
		panelManageUser.setVisible(false);
		panelManageMbtiResult.setVisible(false);
		panelManageMbtiQuiz.setVisible(false);
		panelManageAptitudeQuiz.setVisible(false);
		
	}
}
