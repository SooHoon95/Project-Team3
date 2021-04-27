package com.javalec.adminMain;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelManageQuiz extends JPanel {
	private JButton btnManageMbtiQuiz;
	private JButton btnManageAptitudeQuiz;
	PanelManageAptitudeQuiz panelManageAptitudeQuiz = new PanelManageAptitudeQuiz();
	PanelManageMbtiQuiz panelManageMbtiQuiz = new PanelManageMbtiQuiz();

	
	/**
	 * Create the panel.
	 */
	public PanelManageQuiz() { 
		setBounds(new Rectangle(180, 10, 500, 420));
		setLayout(null);
		add(getBtnManageMbtiQuiz());
		add(getBtnManageAptitudeQuiz());
		panelManageAptitudeQuiz.setLocation(65, 57);
		add(panelManageAptitudeQuiz); 
		add(panelManageMbtiQuiz);
		
		
	}

	private JButton getBtnManageMbtiQuiz() {
		if (btnManageMbtiQuiz == null) {
			btnManageMbtiQuiz = new JButton("MBTI 문제");
			btnManageMbtiQuiz.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ResetQuizPanel();
					panelManageAptitudeQuiz.setVisible(false);
					panelManageMbtiQuiz.setVisible(true);
				}
			});
			btnManageMbtiQuiz.setBounds(86, 11, 120, 35);
		}
		return btnManageMbtiQuiz;
	}
	private JButton getBtnManageAptitudeQuiz() {
		if (btnManageAptitudeQuiz == null) {
			btnManageAptitudeQuiz = new JButton("적성 문제");
			btnManageAptitudeQuiz.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ResetQuizPanel();
					panelManageAptitudeQuiz.setVisible(true);
					panelManageMbtiQuiz.setVisible(false);
				}
			});
			
			btnManageAptitudeQuiz.setBounds(300, 11, 120, 35);
		}
		return btnManageAptitudeQuiz;
	}
	
	public void ResetQuizPanel() {
		panelManageAptitudeQuiz.setVisible(false);
		panelManageMbtiQuiz.setVisible(false);
	}
	
	
	
	
	
	
}//=============================
