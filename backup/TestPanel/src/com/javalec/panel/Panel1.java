package com.javalec.panel;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Panel1 extends JPanel {
	private JButton btnNewButton;
	Panel1_1 p1_1 = new Panel1_1();
	private JButton btnNewButton_1;
	/**
	 * Create the panel.
	 */
	
	public Panel1() {
		setBackground(Color.ORANGE);
		setLayout(null);
		add(getBtnNewButton());
		add(p1_1);
		add(getBtnNewButton_1());

	}

	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("New button");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					p1_1.setVisible(true);
					p1_1.setBounds(60, 30, 300, 200);
					p1_1.repaint();
					p1_1.revalidate();
					
				}
			});
			btnNewButton.setBounds(0, 119, 97, 23);
		}
		return btnNewButton;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("false");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					p1_1.setVisible(false);
				}
			});
			btnNewButton_1.setBounds(0, 213, 97, 23);
		}
		return btnNewButton_1;
	}
}
