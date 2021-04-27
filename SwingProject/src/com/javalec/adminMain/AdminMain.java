package com.javalec.adminMain;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminMain extends JDialog {
	private JButton btnManageUser;
	private JButton btnManageQuiz;
	private JButton btnManageResult;
	private JButton btnManageStatistic;
	PanelManageUser panelManageUser = new PanelManageUser();
	PanelManageQuiz panelManageQuiz = new PanelManageQuiz();
	PanelManageResult panelManageResult = new PanelManageResult();
	PanelManageStatistic panelManageStatistic = new PanelManageStatistic();
 

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
		getContentPane().setLayout(null);
		getContentPane().add(getBtnManageUser());
		getContentPane().add(getBtnManageQuiz());
		getContentPane().add(getBtnManageResult());
		getContentPane().add(getBtnManageStatistic());
	}

	private JButton getBtnManageUser() {
		if (btnManageUser == null) {
			btnManageUser = new JButton("회원관리");
			btnManageUser.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					RestPanel();
					panelManageUser.setVisible(false);
					
				}
			});
			btnManageUser.setBounds(30, 60, 120, 35);
		}
		return btnManageUser;
	}
	private JButton getBtnManageQuiz() {
		if (btnManageQuiz == null) {
			btnManageQuiz = new JButton("문제관리");
			btnManageQuiz.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					RestPanel();
					panelManageQuiz.setVisible(true);
				
				}
			});
			btnManageQuiz.setBounds(30, 155, 120, 35);
		}
		return btnManageQuiz;
	}
	private JButton getBtnManageResult() {
		if (btnManageResult == null) {
			btnManageResult = new JButton("결과관리");
			btnManageResult.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					RestPanel();
					panelManageResult.setVisible(true);
					

				}
			});
			btnManageResult.setBounds(30, 250, 120, 35);
		}
		return btnManageResult;
	}
	private JButton getBtnManageStatistic() {
		if (btnManageStatistic == null) {
			btnManageStatistic = new JButton("통계");
			btnManageStatistic.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					RestPanel();
					panelManageStatistic.setVisible(true);
				}
			});
			btnManageStatistic.setBounds(30, 345, 120, 35);
		}
		return btnManageStatistic;
	}
	private void RestPanel() {
		panelManageUser.setVisible(false);
		panelManageQuiz.setVisible(false);
		panelManageResult.setVisible(false);
		panelManageStatistic.setVisible(false);
		 
	}
}
