package com.javalec.userMain;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import com.javalec.Datadefine.data_Enviroment_define;
import com.javalec.PanelUserAptitudeQuiz.PanelUserAptitudeQuiz;
import com.javalec.PanelUserMbti.PanelUserMbti;
import com.javalec.PanelUserProfile.PanelUserProfile;
import com.javalec.PanelUserStatistic.PanelUserStatistic;
import com.javalec.login.Login;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;

public class UserMain extends JDialog {
	
	private JFrame frame;
	private JButton btnUserProfile;
	private JButton btnUserMbti;
	private JButton btnUserAptitudeQuiz;
	private JButton btnUserStatistic;

	PanelUserProfile panelUserPrifile = new PanelUserProfile();
	PanelUserMbti panelUserMbti = new PanelUserMbti();
	PanelUserAptitudeQuiz panelUserAptitudeQuiz = new PanelUserAptitudeQuiz();
	PanelUserStatistic panelUserStatistic = new PanelUserStatistic();
	data_Enviroment_define dataDefine = new data_Enviroment_define();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UserMain dialog = new UserMain();
			dialog.frame.setVisible(true);
//			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public UserMain() {
		initialize();
	}
	
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("유저 메인화면");
		frame.setBounds(100, 100, 720, 480);
		frame.getContentPane().setLayout(null);

		frame.getContentPane().add(getBtnUserProfile());
		frame.getContentPane().add(getBtnUserMbti());
		frame.getContentPane().add(getBtnUserAptitudeQuiz());
		frame.getContentPane().add(getBtnUserStatistic());
		
		frame.getContentPane().add(panelUserPrifile);
		frame.getContentPane().add(panelUserMbti); 
		frame.getContentPane().add(panelUserAptitudeQuiz); 
		frame.getContentPane().add(panelUserStatistic);
		
		JLabel labelNickname = new JLabel("");
		labelNickname.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		labelNickname.setBounds(40, 18, 127, 19);
		labelNickname.setText( dataDefine.userName + " 님 반갑습니다!");
		frame.getContentPane().add(labelNickname);
		
		JLabel labelLogout = new JLabel("logout");
		labelLogout.setForeground(new Color(0, 0, 0));
		labelLogout.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		labelLogout.addMouseListener(new MouseAdapter() {
			int swtitchnum = 0;
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// 닫기 다이얼로그 옵션
				int result = JOptionPane.showConfirmDialog(null, "로그아웃 하시겠습니까?","로그아웃",JOptionPane.YES_NO_OPTION);
				if(result ==JOptionPane.CLOSED_OPTION) { // 사용자가 선택 없이 x를 누른 경우.
					
				} else if(result == JOptionPane.YES_OPTION) { // 예를 선택한 경우 
					RestPanel();
					frame.setVisible(false);
					Login login = new Login();
					
				} else { // 아니오를 선택한 경우
					
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				labelLogout.setFont(new Font("Lucida Grande",Font.BOLD, 15));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				labelLogout.setFont(new Font("Lucida Grande",Font.PLAIN, 15));
			}
		});
		
		labelLogout.setBounds(65, 400, 66, 26);
		frame.getContentPane().add(labelLogout);
		
		
		RestPanel();
		frame.setVisible(true);

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
	private JButton getBtnUserAptitudeQuiz() {
		if (btnUserAptitudeQuiz == null) {
			btnUserAptitudeQuiz = new JButton("적성검사");
			btnUserAptitudeQuiz.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					RestPanel();
					panelUserAptitudeQuiz.setVisible(true);
				}
			});
			btnUserAptitudeQuiz.setBounds(30, 250, 120, 35);
		}
		return btnUserAptitudeQuiz;
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
	
	private void RestPanel() {
		panelUserPrifile.setVisible(false);
		panelUserMbti.setVisible(false);
		panelUserAptitudeQuiz.setVisible(false);
		panelUserStatistic.setVisible(false);
	}
}
