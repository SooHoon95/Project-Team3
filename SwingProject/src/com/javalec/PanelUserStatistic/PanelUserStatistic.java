package com.javalec.PanelUserStatistic;

import java.awt.Rectangle;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import com.javalec.Datadefine.data_Enviroment_define;

import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.SystemColor;

public class PanelUserStatistic extends JPanel { 	//Dowoo 2021.04.30 완료
	private JLabel lbMbti;
	private JLabel lbMbtiCount;
	private JLabel lbAptitudeCount;
	private JLabel lbAptitude;
	private JLabel lbFullCount1;
	private JLabel lbFullCount2;
	private JTextArea tfAptitude1Top;
	private JTextArea tfAptitude2Top;

	/**
	 * Create the panel.
	 */
	public PanelUserStatistic() {
		setBounds(new Rectangle(180, 10, 500, 420));
		setLayout(null);
		add(getLbMbti());
		add(getLbMbtiCount());
		add(getLbAptitudeCount());
		add(getLbAptitude());
		add(getLbFullCount1());
		add(getLbFullCount2());
		add(getTfAptitude1Top());
		add(getTfAptitude2Top());
		US_Infor();
		US_MbtiCount();
		US_AptitudeCount();
		US_FullCount();
		US_Aptitude1Top();
		US_Aptitude2Top();
		
	}
	private JLabel getLbMbti() {
		if (lbMbti == null) {
			lbMbti = new JLabel("");
			lbMbti.setFont(new Font("굴림", Font.PLAIN, 13));
			lbMbti.setBounds(46, 50, 416, 30);
		}
		return lbMbti;
	}
	private JLabel getLbMbtiCount() {
		if (lbMbtiCount == null) {
			lbMbtiCount = new JLabel("");
			lbMbtiCount.setFont(new Font("굴림", Font.PLAIN, 13));
			lbMbtiCount.setBounds(46, 90, 416, 30);
		}
		return lbMbtiCount;
	}
	private JLabel getLbAptitudeCount() {
		if (lbAptitudeCount == null) {
			lbAptitudeCount = new JLabel("");
			lbAptitudeCount.setFont(new Font("굴림", Font.PLAIN, 13));
			lbAptitudeCount.setBounds(46, 210, 416, 30);
		}
		return lbAptitudeCount;
	}
	private JLabel getLbAptitude() {
		if (lbAptitude == null) {
			lbAptitude = new JLabel("");
			lbAptitude.setFont(new Font("굴림", Font.PLAIN, 13));
			lbAptitude.setBounds(46, 170, 416, 30);
		}
		return lbAptitude;
	}
	private JLabel getLbFullCount1() {
		if (lbFullCount1 == null) {
			lbFullCount1 = new JLabel("");
			lbFullCount1.setFont(new Font("굴림", Font.PLAIN, 13));
			lbFullCount1.setBounds(248, 90, 174, 30);
		}
		return lbFullCount1;
	}
	private JLabel getLbFullCount2() {
		if (lbFullCount2 == null) {
			lbFullCount2 = new JLabel("");
			lbFullCount2.setFont(new Font("굴림", Font.PLAIN, 13));
			lbFullCount2.setBounds(248, 210, 174, 30);
		}
		return lbFullCount2;
	}
	
	private JTextArea getTfAptitude1Top() {
		if (tfAptitude1Top == null) {
			tfAptitude1Top = new JTextArea();
			tfAptitude1Top.setBackground(SystemColor.control);
			tfAptitude1Top.setBounds(46, 290, 416, 40);
			tfAptitude1Top.setLineWrap(true);
		}
		return tfAptitude1Top;
	}
	private JTextArea getTfAptitude2Top() {
		if (tfAptitude2Top == null) {
			tfAptitude2Top = new JTextArea();
			tfAptitude2Top.setBackground(SystemColor.control);
			tfAptitude2Top.setBounds(46, 330, 416, 40);
			tfAptitude2Top.setLineWrap(true);
		}
		return tfAptitude2Top;
	}

	//----------------
	//메소드 정리
	//----------------
	
	
	//MBTI와 적성 보여주는 기능. 
	private void US_Infor() {
		
		US_DbAction us_DbAction =new US_DbAction(data_Enviroment_define.userNum);
		US_Bean bean = us_DbAction.US_Infor();
		
		lbMbti.setText(bean.getUserName() + "님의 MBTI는 " + bean.getUserResultM() + "입니다." );
		lbAptitude.setText(bean.getUserName() + "님의 적성은 " + bean.getUserResultA() + "입니다.");
	}
	//본인과 같은 MBTI 명수
	private void US_MbtiCount() {
		US_DbAction us_DbAction =new US_DbAction(data_Enviroment_define.userNum);
		US_Bean bean = us_DbAction.US_MbtiCount();
		
		lbMbtiCount.setText("나와 같은 사람은 " + bean.getCount() + "명 입니다.");
	}
	//본인과 같은 적성 명수
	private void US_AptitudeCount() {
		US_DbAction us_DbAction =new US_DbAction(data_Enviroment_define.userNum);
		US_Bean bean = us_DbAction.US_AptitudeCount();
		
		lbAptitudeCount.setText("나와 같은 사람은 " + bean.getCount() + "명 입니다.");
	}
	//총 인원수
	private void US_FullCount() {
		US_DbAction us_DbAction =new US_DbAction(data_Enviroment_define.userNum);
		US_Bean bean = us_DbAction.US_FullCount();
		
		lbFullCount1.setText("(총" + bean.getCount() + "명)");
		lbFullCount2.setText("(총" + bean.getCount() + "명)");
	}
	
	//적성이 천직인 사람의 탑 MBTI
	private void US_Aptitude1Top() {

		US_DbAction us_DbAction =new US_DbAction();
		US_Bean bean = us_DbAction.US_Aptitude1Top();
		
		tfAptitude1Top.setText("적성이 \"천직\"인 사람중 가장 많은 MBTI는 " + bean.getUserResultM() + "이고 총" + bean.getCount() + "명 이다");
		
	}

	
	//적성이 한번더 생각하기인 사람의 탑 MBTI
	private void US_Aptitude2Top() {

		US_DbAction us_DbAction =new US_DbAction();
		US_Bean bean = us_DbAction.US_Aptitude2Top();
		
		tfAptitude2Top.setText("적성이 \"한번더 의심하기\"인 사람중 가장 많은 MBTI는 " + bean.getUserResultM() + "이고 총" + bean.getCount() + "명 이다");
		
	}

}/////////////////
