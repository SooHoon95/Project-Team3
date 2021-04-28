package com.javalec.PanelManageAptitudeQuiz;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Rectangle;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import com.javalec.Datadefine.data_Enviroment_define;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelManageAptitudeQuiz extends JPanel {
	private JScrollPane scrollPane_AdAptitideQA;
	private JTable inner_table_AdMBTIQA;
	private final DefaultTableModel Outer_Table_AdMBTIQA= new DefaultTableModel(); // ################
	private JLabel lblAdAptitideNum;
	private JLabel lblAdAptitideQA;
	private JLabel lblAdAptitideAnswer1;
	private JLabel lblAdAptitideAnswer2;
	private JButton btnAdAptitideQACreate;
	private JButton btnAdAptitideQAEdit;
	private JButton btnAdAptitideQARemove;
	private JTextField tfAdAptitideQANum;
	private JTextField tfAdAptitideQA;
	private JTextField tfAdAptitideAnswer1;
	private JTextField tfAdAptitideAnswer2;
	private JScrollPane scrollPane_AdUser;
	private JLabel lblAdAptitideAnswer1Score;
	private JLabel lblAdAptitideAnswer2Score;
	private JComboBox cbAptitideAnswer1Score;
	private JComboBox cbAptitideAnswer2Score;

	/**
	 * Create the panel.
	 */
	public PanelManageAptitudeQuiz() {
		setBackground(Color.ORANGE);
		setBounds(new Rectangle(65, 57, 370, 350));
		setLayout(null);
		setVisible(false);
		add(getScrollPane_AdAptitideQA());
		add(getLblAdAptitideNum());
		add(getLblAdAptitideQA());
		add(getLblAdAptitideAnswer1());
		add(getLblAdAptitideAnswer2());
		add(getBtnAdAptitideQACreate());
		add(getBtnAdAptitideQAEdit());
		add(getBtnAdAptitideQARemove());
		add(getTfAdAptitideQANum());
		add(getTfAdAptitideQA());
		add(getTfAdAptitideAnswer1());
		add(getTfAdAptitideAnswer2());
		add(getLblAdAptitideAnswer1Score());
		add(getLblAdAptitideAnswer2Score());
		add(getCbAptitideAnswer1Score());
		add(getCbAptitideAnswer2Score());

	}

	private JScrollPane getScrollPane_AdAptitideQA() {
		if (scrollPane_AdAptitideQA == null) {
			scrollPane_AdAptitideQA = new JScrollPane();
			scrollPane_AdAptitideQA.setBounds(20, 17, 338, 156);
			scrollPane_AdAptitideQA.setViewportView(getInner_table_AdMBTIQA());
		}
		return scrollPane_AdAptitideQA;
	}
	private JTable getInner_table_AdMBTIQA() {
		if (inner_table_AdMBTIQA == null) {
			inner_table_AdMBTIQA = new JTable();
			inner_table_AdMBTIQA.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			inner_table_AdMBTIQA.setModel(Outer_Table_AdMBTIQA); // 테이블을 불러오기 위해 ******꼭 써야할 것*****
			
			//관리자 User table 설정
			Outer_Table_AdMBTIQA.addColumn("번호");
			Outer_Table_AdMBTIQA.addColumn("MBTI질문");
			Outer_Table_AdMBTIQA.addColumn("답1");
			Outer_Table_AdMBTIQA.addColumn("답2");
			Outer_Table_AdMBTIQA.setColumnCount(4); // Column이 4개
			
			int i = Outer_Table_AdMBTIQA.getRowCount();
			for(int j=0; j<i; j++) {
				Outer_Table_AdMBTIQA.removeRow(0);
			}
			
//			inner_table_AdManageUser.setAutoResizeMode(inner_table_AdManageUser.AUTO_RESIZE_OFF); // 마음대로 리사이징 x
			
			int vColIndex = 0; // 첫번째 행
			TableColumn col = inner_table_AdMBTIQA.getColumnModel().getColumn(vColIndex);
			int width = 30; // 첫번째 행 가로
			col.setPreferredWidth(width);; // 첫번째 행 가로크기 설정
			
			vColIndex = 1; // 2번째 행
			col = inner_table_AdMBTIQA.getColumnModel().getColumn(vColIndex);
			width = 100; // 2번째 행 가로
			col.setPreferredWidth(width);; // 2번째 행 가로크기 설정
			
			vColIndex = 2; // 3번째 행
			col = inner_table_AdMBTIQA.getColumnModel().getColumn(vColIndex);
			width = 150; // 2번째 행 가로
			col.setPreferredWidth(width);; // 3번째 행 가로크기 설정
			
			vColIndex = 3; // 4번째 행
			col = inner_table_AdMBTIQA.getColumnModel().getColumn(vColIndex);
			width = 100; // 3번째 행 가로
			col.setPreferredWidth(width);; // 4번째 행 가로크기 설정
			
		}
		return inner_table_AdMBTIQA;
	}
	
	private JLabel getLblAdAptitideNum() {
		if (lblAdAptitideNum == null) {
			lblAdAptitideNum = new JLabel("번호");
			lblAdAptitideNum.setBounds(20, 194, 61, 16);
		}
		return lblAdAptitideNum;
	}
	private JLabel getLblAdAptitideQA() {
		if (lblAdAptitideQA == null) {
			lblAdAptitideQA = new JLabel("질문");
			lblAdAptitideQA.setBounds(20, 230, 61, 16);
		}
		return lblAdAptitideQA;
	}
	private JLabel getLblAdAptitideAnswer1() {
		if (lblAdAptitideAnswer1 == null) {
			lblAdAptitideAnswer1 = new JLabel("답1");
			lblAdAptitideAnswer1.setBounds(20, 263, 61, 16);
		}
		return lblAdAptitideAnswer1;
	}
	private JLabel getLblAdAptitideAnswer2() {
		if (lblAdAptitideAnswer2 == null) {
			lblAdAptitideAnswer2 = new JLabel("답2");
			lblAdAptitideAnswer2.setBounds(20, 297, 61, 16);
		}
		return lblAdAptitideAnswer2;
	}
	private JTextField getTfAdAptitideQANum() {
		if (tfAdAptitideQANum == null) {
			tfAdAptitideQANum = new JTextField();
			tfAdAptitideQANum.setEditable(false);
			tfAdAptitideQANum.setBounds(93, 189, 60, 26);
			tfAdAptitideQANum.setColumns(10);
		}
		return tfAdAptitideQANum;
	}
	private JTextField getTfAdAptitideQA() {
		if (tfAdAptitideQA == null) {
			tfAdAptitideQA = new JTextField();
			tfAdAptitideQA.setColumns(10);
			tfAdAptitideQA.setBounds(93, 225, 265, 26);
		}
		return tfAdAptitideQA;
	}
	private JTextField getTfAdAptitideAnswer1() {
		if (tfAdAptitideAnswer1 == null) {
			tfAdAptitideAnswer1 = new JTextField();
			tfAdAptitideAnswer1.setColumns(10);
			tfAdAptitideAnswer1.setBounds(93, 258, 122, 26);
		}
		return tfAdAptitideAnswer1;
	}
	private JTextField getTfAdAptitideAnswer2() {
		if (tfAdAptitideAnswer2 == null) {
			tfAdAptitideAnswer2 = new JTextField();
			tfAdAptitideAnswer2.setColumns(10);
			tfAdAptitideAnswer2.setBounds(93, 292, 122, 26);
		}
		return tfAdAptitideAnswer2;
	}
	private JButton getBtnAdAptitideQACreate() {
		if (btnAdAptitideQACreate == null) {
			btnAdAptitideQACreate = new JButton("생성");
			btnAdAptitideQACreate.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ActionPartition_insertAction();
				}
			});
			btnAdAptitideQACreate.setBounds(20, 320, 60, 29);
		}
		return btnAdAptitideQACreate;
	}
	private JButton getBtnAdAptitideQAEdit() {
		if (btnAdAptitideQAEdit == null) {
			btnAdAptitideQAEdit = new JButton("수정");
			btnAdAptitideQAEdit.setBounds(155, 320, 60, 29);
		}
		return btnAdAptitideQAEdit;
	}
	private JButton getBtnAdAptitideQARemove() {
		if (btnAdAptitideQARemove == null) {
			btnAdAptitideQARemove = new JButton("삭제");
			btnAdAptitideQARemove.setBounds(290, 320, 60, 29);
		}
		return btnAdAptitideQARemove;
	}
	private JLabel getLblAdAptitideAnswer1Score() {
		if (lblAdAptitideAnswer1Score == null) {
			lblAdAptitideAnswer1Score = new JLabel("답1 점수");
			lblAdAptitideAnswer1Score.setBounds(223, 263, 61, 16);
		}
		return lblAdAptitideAnswer1Score;
	}
	private JLabel getLblAdAptitideAnswer2Score() {
		if (lblAdAptitideAnswer2Score == null) {
			lblAdAptitideAnswer2Score = new JLabel("답2 점수");
			lblAdAptitideAnswer2Score.setBounds(223, 297, 61, 16);
		}
		return lblAdAptitideAnswer2Score;
	}
	private JComboBox getCbAptitideAnswer1Score() {
		if (cbAptitideAnswer1Score == null) {
			cbAptitideAnswer1Score = new JComboBox();
			cbAptitideAnswer1Score.setModel(new DefaultComboBoxModel(new String[] {"", "0", "1"}));
			cbAptitideAnswer1Score.setBounds(296, 258, 62, 26);
		}
		return cbAptitideAnswer1Score;
	}
	private JComboBox getCbAptitideAnswer2Score() {
		if (cbAptitideAnswer2Score == null) {
			cbAptitideAnswer2Score = new JComboBox();
			cbAptitideAnswer2Score.setModel(new DefaultComboBoxModel(new String[] {"", "0", "1"}));
			cbAptitideAnswer2Score.setBounds(297, 292, 61, 26);
		}
		return cbAptitideAnswer2Score;
	}
	//-----------------------------------------------------------
	
	//table 정보 입력
	private void tableInsertAction() {
		String query = "select aqNum, aqQuestion, aqAnswer1, aqAnswer2 from aptitudequestion";
		PreparedStatement ps = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn_mysql = DriverManager.getConnection(data_Enviroment_define.url_mysql, data_Enviroment_define.id_mysql, data_Enviroment_define.pw_mysql);
			Statement stmt_mysql = conn_mysql.createStatement();
			
			ResultSet rs = stmt_mysql.executeQuery(query); // 쿼리문장을 실행하여 ResultSet타입으로 변환 ->결과값 저장
			
			while(rs.next()) { //ResultSet에서 
				String[] qTxt = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)};
				Outer_Table_AdMBTIQA.addRow(qTxt);
				}			
			conn_mysql.close(); //DB 연결 끊기
			
			
		}catch(Exception e) {//java.lang
			e.printStackTrace();// 화면에 에러코드 보여주기
		}
	
	}
	
	
	
		
		//공백 체크
		// SungAh 2021.04.28
		private int FieldCheck() {
			int i = 0;
			String message = "";
			if(tfAdAptitideQA.getText().length() == 0) {
				i++;
				message = "질문을 ";
				tfAdAptitideQA.requestFocus(); // 커서 띄우기
			}
			if(tfAdAptitideAnswer1.getText().length() == 0) {
				i++;
				message = "답1을 ";
				tfAdAptitideAnswer1.requestFocus();
			}
			if(tfAdAptitideAnswer2.getText().length() == 0) {
				i++;
				message = "답2을 ";
				tfAdAptitideAnswer2.requestFocus();
			}
			if(cbAptitideAnswer1Score.getSelectedItem() == null) {
				message = "점수1을 ";
				i++;
			}
			if(cbAptitideAnswer1Score.getSelectedItem() == null) {
				message = "점수2를 ";
				i++;
			}
			if(i>0) {
				JOptionPane.showMessageDialog(null, message + "입력하세요");
			}
			
			return i;
		}
		
		//공백체크+생성버튼 동작 실행
		//SungAh 2021.04.28
		private void ActionPartition_insertAction() {
			int i_chk = FieldCheck();
			if(i_chk == 0) {
				MAQ_insertAction();
			}else {
				
			}
		}
		
		//생성 버튼 동작 확인+query
		//SungAh 2021.04.28.
		public boolean insertAction_boolean() { // 반환값 boolean 확인, 맞으면 true/틀리면 false
			PreparedStatement ps = null;
					
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection conn_mysql = DriverManager.getConnection(data_Enviroment_define.url_mysql, data_Enviroment_define.id_mysql, data_Enviroment_define.pw_mysql);
				Statement stmt_mysql = conn_mysql.createStatement();						
				String query = "insert into SwingProject_Database.aptitudequestion (aqQuestion, aqAnswer1, aqAnswer2, aqScore1, aqScore2) values (?,?,?,?,?)";

				ps = conn_mysql.prepareStatement(query);
				ps.setString(1, tfAdAptitideQA.getText().trim());
				ps.setString(2, tfAdAptitideAnswer1.getText().trim());
				ps.setString(3, tfAdAptitideAnswer2.getText().trim());
				ps.setString(4, (String) cbAptitideAnswer1Score.getSelectedItem());
				ps.setString(5, (String) cbAptitideAnswer2Score.getSelectedItem());
				ps.executeUpdate();
					
//				String adAptitideQA = tfAdAptitideQA.getText().trim();
//				String adAptitideAnswer1 = tfAdAptitideAnswer1.getText().trim();
//				String adAptitideAnswer2 = tfAdAptitideAnswer2.getText().trim();
//				String aptitideAnswer1Score = (String) cbAptitideAnswer1Score.getSelectedItem();
//				String aptitideAnswer2Score = (String) cbAptitideAnswer2Score.getSelectedItem();						
				
				conn_mysql.close(); //DB 연결 끊기
				return true;
			}catch(Exception e) {
				e.printStackTrace();// 화면에 에러코드 보여주기
				return false;
			}
		}
	
		// 생성 액션
		// SungAh 2021.04.28
		private void MAQ_insertAction() {
			
			
			boolean msg = insertAction_boolean();
			if(msg == true) {
				JOptionPane.showMessageDialog(this, "적성검사 질문 정보가 입력되었습니다", "입력완료", 
						JOptionPane.INFORMATION_MESSAGE);
			}else {
				JOptionPane.showMessageDialog(this, "DB에 자료 입력 중 에러가 발생했습니다", "Critical Error!", JOptionPane.ERROR_MESSAGE);
			}
		}
		
		
		
	
}//-----------------------------------
