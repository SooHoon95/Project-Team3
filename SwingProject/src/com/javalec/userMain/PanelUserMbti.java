package com.javalec.userMain;

import java.awt.Rectangle;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;

public class PanelUserMbti extends JPanel {
	private JLabel lbMbtiQuiz;
	private JLabel lbMbtiResult1;
	private JLabel lbMbtiResult2;
	private JButton btnMbtiNext;

	/**
	 * Create the panel.
	 */
	public PanelUserMbti() {
		setBounds(new Rectangle(180, 10, 500, 420));
		setLayout(null);
		add(getLbMbtiQuiz());
		add(getLbMbtiResult1());
		add(getLbMbtiResult2());
		add(getBtnMbtiNext());
	}

	private JLabel getLbMbtiQuiz() {
		if (lbMbtiQuiz == null) {
			lbMbtiQuiz = new JLabel("New label");
			lbMbtiQuiz.setBounds(35, 40, 368, 105);
		}
		return lbMbtiQuiz;
	}
	private JLabel getLbMbtiResult1() {
		if (lbMbtiResult1 == null) {
			lbMbtiResult1 = new JLabel("New label");
			lbMbtiResult1.setBounds(93, 207, 57, 15);
		}
		return lbMbtiResult1;
	}
	private JLabel getLbMbtiResult2() {
		if (lbMbtiResult2 == null) {
			lbMbtiResult2 = new JLabel("New label");
			lbMbtiResult2.setBounds(93, 251, 57, 15);
		}
		return lbMbtiResult2;
	}
	private JButton getBtnMbtiNext() {
		if (btnMbtiNext == null) {
			btnMbtiNext = new JButton("확인");
			btnMbtiNext.setBounds(358, 340, 97, 23);
		}
		return btnMbtiNext;
	}
}
