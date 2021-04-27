package com.javalec.panel;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;

public class Panel1_1 extends JPanel {
	private JButton btnNewButton;

	/**
	 * Create the panel.
	 */
	public Panel1_1() {
		setBackground(Color.BLUE);
		setLayout(null);
		add(getBtnNewButton());

	}

	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("New button");
			btnNewButton.setBounds(12, 125, 97, 23);
		}
		return btnNewButton;
	}
}
