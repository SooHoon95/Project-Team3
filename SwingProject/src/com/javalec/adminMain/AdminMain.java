package com.javalec.adminMain;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class AdminMain extends JDialog {
	private JButton btnManageUser;
	private JButton btnManageMbtiQuiz;
	private JButton btnManageAptitudeQuiz;
	private JButton btnManageMbtiResults;
	private JPanel pManageUser;
	private JPanel pManageMbtiQuiz;
	private JPanel pManageMbtiResult;
	private JPanel pManageAptitudeQuiz;

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
		getContentPane().add(getPManageUser());
		getContentPane().add(getPManageMbtiQuiz());
		getContentPane().add(getPManageMbtiResult());
		getContentPane().add(getPManageAptitudeQuiz());
	}

	private JButton getBtnManageUser() {
		if (btnManageUser == null) {
			btnManageUser = new JButton("회원관리");
			btnManageUser.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					pManageUser.setVisible(true);
					pManageMbtiResult.setVisible(false);
					pManageMbtiQuiz.setVisible(false);
					pManageAptitudeQuiz.setVisible(false);
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
					pManageUser.setVisible(false);
					pManageMbtiResult.setVisible(true);
					pManageMbtiQuiz.setVisible(false);
					pManageAptitudeQuiz.setVisible(false);
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
					pManageUser.setVisible(false);
					pManageMbtiResult.setVisible(false);
					pManageMbtiQuiz.setVisible(true);
					pManageAptitudeQuiz.setVisible(false);
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
					pManageUser.setVisible(false);
					pManageMbtiResult.setVisible(false);
					pManageMbtiQuiz.setVisible(false);
					pManageAptitudeQuiz.setVisible(true);
				}
			});
			btnManageMbtiResults.setBounds(30, 250, 120, 35);
		}
		return btnManageMbtiResults;
	}
	private JPanel getPManageUser() {
		if (pManageUser == null) {
			pManageUser = new JPanel();
			pManageUser.setBackground(new Color(0, 204, 51));
			pManageUser.setBounds(180, 10, 500, 420);
			pManageUser.setVisible(false);
		}
		return pManageUser;
	}
	private JPanel getPManageMbtiQuiz() {
		if (pManageMbtiQuiz == null) {
			pManageMbtiQuiz = new JPanel();
			pManageMbtiQuiz.setBackground(new Color(204, 102, 204));
			pManageMbtiQuiz.setBounds(180, 10, 500, 420);
			pManageMbtiQuiz.setVisible(false);
		}
		return pManageMbtiQuiz;
	}
	private JPanel getPManageMbtiResult() {
		if (pManageMbtiResult == null) {
			pManageMbtiResult = new JPanel();
			pManageMbtiResult.setBackground(new Color(255, 255, 153));
			pManageMbtiResult.setBounds(180, 10, 500, 420);
			pManageMbtiResult.setVisible(false);
		}
		return pManageMbtiResult;
	}
	private JPanel getPManageAptitudeQuiz() {
		if (pManageAptitudeQuiz == null) {
			pManageAptitudeQuiz = new JPanel();
			pManageAptitudeQuiz.setBackground(new Color(102, 0, 255));
			pManageAptitudeQuiz.setBounds(180, 10, 500, 420);
			pManageAptitudeQuiz.setVisible(false);
		}
		return pManageAptitudeQuiz;
	}
}
