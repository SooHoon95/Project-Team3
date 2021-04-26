package com.javalec.user;

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

	private JPanel panelUserPrifile;
	private JButton btnUserProfile;
	private JButton btnUserMbti;
	private JButton btnUserQuiz;
	private JButton btnUserStatistic;
	private JPanel panelUserMbti;
	private JPanel panelUserQuiz;
	private JPanel panelUserStatistic;
	private JButton btnMbtiNext;
	private JLabel lbMbtiResult1;
	private JLabel lbMbtiResult2;
	private JLabel lbMbtiQuiz;
	private JButton btnQuiziNext;
	private JLabel lbQuizResult2;
	private JLabel lbQuizResult1;
	private JLabel lbQuiz;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JTextField tfName;
	private JTextField tfId;
	private JTextField tfEmail;
	private JTextField tfMBTI;
	private JTextField tfQuiz;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblNewLabel_5;

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
		getContentPane().add(getPanelUserStatistic());
		getContentPane().add(getPanelUserPrifile());
		getContentPane().add(getPanelUserQuiz());
		getContentPane().add(getPanelUserMbti());
		getContentPane().add(getBtnUserProfile());
		getContentPane().add(getBtnUserMbti());
		getContentPane().add(getBtnUserQuiz());
		getContentPane().add(getBtnUserStatistic());
	}
	private JPanel getPanelUserPrifile() {
		if (panelUserPrifile == null) {
			panelUserPrifile = new JPanel();
			panelUserPrifile.setBounds(180, 10, 500, 420);
			panelUserPrifile.setLayout(null);
			panelUserPrifile.add(getLblNewLabel());
			panelUserPrifile.add(getLblNewLabel_1());
			panelUserPrifile.add(getLblNewLabel_2());
			panelUserPrifile.add(getLblNewLabel_3());
			panelUserPrifile.add(getLblNewLabel_4());
			panelUserPrifile.add(getTfName());
			panelUserPrifile.add(getTfId());
			panelUserPrifile.add(getTfEmail());
			panelUserPrifile.add(getTfMBTI());
			panelUserPrifile.add(getTfQuiz());
			panelUserPrifile.setVisible(false);
		}
		return panelUserPrifile;
	}
	private JPanel getPanelUserMbti() {
		if (panelUserMbti == null) {
			panelUserMbti = new JPanel();
			panelUserMbti.setBounds(180, 10, 500, 420);
			panelUserMbti.setLayout(null);
			panelUserMbti.add(getBtnMbtiNext());
			panelUserMbti.add(getLbMbtiResult1());
			panelUserMbti.add(getLbMbtiResult2());
			panelUserMbti.add(getLbMbtiQuiz());
			panelUserMbti.setVisible(false);
		}
		return panelUserMbti;
	}
	private JPanel getPanelUserQuiz() {
		if (panelUserQuiz == null) {
			panelUserQuiz = new JPanel();
			panelUserQuiz.setBounds(180, 10, 500, 420);
			panelUserQuiz.setLayout(null);
			panelUserQuiz.add(getBtnQuiziNext());
			panelUserQuiz.add(getLbQuizResult2());
			panelUserQuiz.add(getLbQuizResult1());
			panelUserQuiz.add(getLbQuiz());
			panelUserQuiz.setVisible(false);
		}
		return panelUserQuiz;
	}
	private JPanel getPanelUserStatistic() {
		if (panelUserStatistic == null) {
			panelUserStatistic = new JPanel();
			panelUserStatistic.setBounds(180, 10, 500, 420);
			panelUserStatistic.setLayout(null);
			panelUserStatistic.add(getTextField());
			panelUserStatistic.add(getTextField_1());
			panelUserStatistic.add(getLblNewLabel_5());
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
	private JButton getBtnMbtiNext() {
		if (btnMbtiNext == null) {
			btnMbtiNext = new JButton("확인");
			btnMbtiNext.setBounds(391, 387, 97, 23);
		}
		return btnMbtiNext;
	}
	private JLabel getLbMbtiResult1() {
		if (lbMbtiResult1 == null) {
			lbMbtiResult1 = new JLabel("New label");
			lbMbtiResult1.setBounds(126, 254, 57, 15);
		}
		return lbMbtiResult1;
	}
	private JLabel getLbMbtiResult2() {
		if (lbMbtiResult2 == null) {
			lbMbtiResult2 = new JLabel("New label");
			lbMbtiResult2.setBounds(126, 298, 57, 15);
		}
		return lbMbtiResult2;
	}
	private JLabel getLbMbtiQuiz() {
		if (lbMbtiQuiz == null) {
			lbMbtiQuiz = new JLabel("New label");
			lbMbtiQuiz.setBounds(68, 87, 368, 105);
		}
		return lbMbtiQuiz;
	}
	private JButton getBtnQuiziNext() {
		if (btnQuiziNext == null) {
			btnQuiziNext = new JButton("확인");
			btnQuiziNext.setBounds(391, 387, 97, 23);
		}
		return btnQuiziNext;
	}
	private JLabel getLbQuizResult2() {
		if (lbQuizResult2 == null) {
			lbQuizResult2 = new JLabel("New label");
			lbQuizResult2.setBounds(126, 298, 57, 15);
		}
		return lbQuizResult2;
	}
	private JLabel getLbQuizResult1() {
		if (lbQuizResult1 == null) {
			lbQuizResult1 = new JLabel("New label");
			lbQuizResult1.setBounds(126, 254, 57, 15);
		}
		return lbQuizResult1;
	}
	private JLabel getLbQuiz() {
		if (lbQuiz == null) {
			lbQuiz = new JLabel("New label");
			lbQuiz.setBounds(68, 87, 368, 105);
		}
		return lbQuiz;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("이름       :");
			lblNewLabel.setBounds(40, 57, 57, 15);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("ID          :");
			lblNewLabel_1.setBounds(40, 129, 57, 15);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("Email     :");
			lblNewLabel_2.setBounds(40, 201, 57, 15);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("MBTI      :");
			lblNewLabel_3.setBounds(40, 273, 67, 15);
		}
		return lblNewLabel_3;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("적성검사  :");
			lblNewLabel_4.setBounds(40, 345, 79, 15);
		}
		return lblNewLabel_4;
	}
	private JTextField getTfName() {
		if (tfName == null) {
			tfName = new JTextField();
			tfName.setBounds(120, 54, 116, 21);
			tfName.setColumns(10);
		}
		return tfName;
	}
	private JTextField getTfId() {
		if (tfId == null) {
			tfId = new JTextField();
			tfId.setColumns(10);
			tfId.setBounds(120, 126, 116, 21);
		}
		return tfId;
	}
	private JTextField getTfEmail() {
		if (tfEmail == null) {
			tfEmail = new JTextField();
			tfEmail.setColumns(10);
			tfEmail.setBounds(120, 198, 211, 21);
		}
		return tfEmail;
	}
	private JTextField getTfMBTI() {
		if (tfMBTI == null) {
			tfMBTI = new JTextField();
			tfMBTI.setColumns(10);
			tfMBTI.setBounds(119, 270, 116, 21);
		}
		return tfMBTI;
	}
	private JTextField getTfQuiz() {
		if (tfQuiz == null) {
			tfQuiz = new JTextField();
			tfQuiz.setColumns(10);
			tfQuiz.setBounds(120, 342, 116, 21);
		}
		return tfQuiz;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(40, 50, 200, 21);
			textField.setColumns(10);
		}
		return textField;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setBounds(40, 93, 200, 21);
			textField_1.setColumns(10);
		}
		return textField_1;
	}
	private JLabel getLblNewLabel_5() {
		if (lblNewLabel_5 == null) {
			lblNewLabel_5 = new JLabel("나의 MBTI");
			lblNewLabel_5.setBounds(40, 23, 68, 24);
		}
		return lblNewLabel_5;
	}
}
