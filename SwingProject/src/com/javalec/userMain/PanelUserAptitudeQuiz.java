package com.javalec.userMain;

import javax.swing.JPanel;
import java.awt.Rectangle;
import javax.swing.JLabel;
import javax.swing.JButton;

public class PanelUserAptitudeQuiz extends JPanel {
	private JLabel lbQuiz;
	private JLabel lbQuizResult1;
	private JLabel lbQuizResult2;
	private JButton btnQuiziNext;

	/**
	 * Create the panel.
	 */
	public PanelUserAptitudeQuiz() {
		setBounds(new Rectangle(180, 10, 500, 420));
		setLayout(null);
		add(getLbQuiz());
		add(getLbQuizResult1());
		add(getLbQuizResult2());
		add(getBtnQuiziNext());

	}

	private JLabel getLbQuiz() {
		if (lbQuiz == null) {
			lbQuiz = new JLabel("New label");
			lbQuiz.setBounds(35, 40, 368, 105);
		}
		return lbQuiz;
	}
	private JLabel getLbQuizResult1() {
		if (lbQuizResult1 == null) {
			lbQuizResult1 = new JLabel("New label");
			lbQuizResult1.setBounds(93, 207, 57, 15);
		}
		return lbQuizResult1;
	}
	private JLabel getLbQuizResult2() {
		if (lbQuizResult2 == null) {
			lbQuizResult2 = new JLabel("New label");
			lbQuizResult2.setBounds(93, 251, 57, 15);
		}
		return lbQuizResult2;
	}
	private JButton getBtnQuiziNext() {
		if (btnQuiziNext == null) {
			btnQuiziNext = new JButton("확인");
			btnQuiziNext.setBounds(358, 340, 97, 23);
		}
		return btnQuiziNext;
	}
}
