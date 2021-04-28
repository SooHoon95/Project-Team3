package com.javalec.PanelManageMbtiResult;

import java.awt.Color;
import java.awt.Rectangle;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import com.javalec.Datadefine.data_Enviroment_define;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelManageMbtiResult extends JPanel {
	private JScrollPane scrollPane_AdMBTIResult;
	private final DefaultTableModel Outer_Table_AdMBTIResult = new DefaultTableModel(); // ################
	private JTable inner_table_AdMBTIResult;
	private JLabel lblAdMBTIResultName;
	private JLabel lblAdMBTIResultExplanation;
	private JTextField tfAdMBTIResultName;
	private JTextField tfAdMBTIResultExplanation;
	private JButton btnAdMBTIQResultCreate;
	private JButton btnAdMBTIResultEdit;
	private JButton btnAdMBTIResultRemove;
	private JLabel lblAdMBTIResultNum;
	private JTextField tfAdMBTIResultNum;
	private JPanel panelAdMBTIimage;

	/**
	 * Create the panel.
	 */
	public PanelManageMbtiResult() {
		setBackground(Color.GREEN);
		setBounds(new Rectangle(65, 57, 370, 350));
		setLayout(null);
		add(getScrollPane_AdMBTIResult());
		add(getLblAdMBTIResultName());
		add(getlblAdMBTIResultExplanation());
		add(getTfAdMBTIResultName());
		add(getTfAdMBTIResultExplanation());
		add(getBtnAdMBTIResultCreate());
		add(getBtnAdMBTIResultEdit());
		add(getBtnAdMBTIResultRemove());
		add(getLblAdMBTIResultNum());
		add(getTfAdMBTIResultNum());
		add(getPanelAdMBTIimage());
		
		

	}
	private JScrollPane getScrollPane_AdMBTIResult() {
		if (scrollPane_AdMBTIResult == null) {
			scrollPane_AdMBTIResult = new JScrollPane();
			scrollPane_AdMBTIResult.setBounds(20, 17, 220, 156);
			scrollPane_AdMBTIResult.setViewportView(getInner_table_AdMBTIResult());
		}
		return scrollPane_AdMBTIResult;
	}
	private JTable getInner_table_AdMBTIResult() {
		if (inner_table_AdMBTIResult == null) {
			inner_table_AdMBTIResult = new JTable();
			inner_table_AdMBTIResult.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			inner_table_AdMBTIResult.setModel(Outer_Table_AdMBTIResult); // 테이블을 불러오기 위해 ******꼭 써야할 것*****
			
			//관리자 User table 설정
			Outer_Table_AdMBTIResult.addColumn("번호");
			Outer_Table_AdMBTIResult.addColumn("이름");
			Outer_Table_AdMBTIResult.addColumn("설명");
			Outer_Table_AdMBTIResult.setColumnCount(3); // Column이 4개
			
			int i = Outer_Table_AdMBTIResult.getRowCount();
			for(int j=0; j<i; j++) {
				Outer_Table_AdMBTIResult.removeRow(0);
			}
			
//			inner_table_AdManageUser.setAutoResizeMode(inner_table_AdManageUser.AUTO_RESIZE_OFF); // 마음대로 리사이징 x
			
			int vColIndex = 0; // 첫번째 행
			TableColumn col = inner_table_AdMBTIResult.getColumnModel().getColumn(vColIndex);
			int width = 30; // 첫번째 행 가로
			col.setPreferredWidth(width);; // 첫번째 행 가로크기 설정
			
			vColIndex = 1; // 2번째 행
			col = inner_table_AdMBTIResult.getColumnModel().getColumn(vColIndex);
			width = 100; // 2번째 행 가로
			col.setPreferredWidth(width);; // 2번째 행 가로크기 설정
			
			vColIndex = 2; // 3번째 행
			col = inner_table_AdMBTIResult.getColumnModel().getColumn(vColIndex);
			width = 100; // 3번째 행 가로
			col.setPreferredWidth(width);; // 3번째 행 가로크기 설정

			
		}
		return inner_table_AdMBTIResult;
	}
	
	private JLabel getLblAdMBTIResultName() {
		if (lblAdMBTIResultName == null) {
			lblAdMBTIResultName = new JLabel("MBTI이름");
			lblAdMBTIResultName.setBounds(20, 230, 61, 16);
		}
		return lblAdMBTIResultName;
	}
	private JLabel getlblAdMBTIResultExplanation() {
		if (lblAdMBTIResultExplanation == null) {
			lblAdMBTIResultExplanation = new JLabel("MBTI설명");
			lblAdMBTIResultExplanation.setBounds(20, 263, 61, 16);
		}
		return lblAdMBTIResultExplanation;
	}
	
	private JTextField getTfAdMBTIResultName() {
		if (tfAdMBTIResultName == null) {
			tfAdMBTIResultName = new JTextField();
			tfAdMBTIResultName.setBounds(93, 225, 265, 26);
			tfAdMBTIResultName.setColumns(10);
		}
		return tfAdMBTIResultName;
	}
	private JTextField getTfAdMBTIResultExplanation() {
		if (tfAdMBTIResultExplanation == null) {
			tfAdMBTIResultExplanation = new JTextField();
			tfAdMBTIResultExplanation.setColumns(10);
			tfAdMBTIResultExplanation.setBounds(93, 258, 265, 54);
		}
		return tfAdMBTIResultExplanation;
	}
	
	private JButton getBtnAdMBTIResultCreate() {
		if (btnAdMBTIQResultCreate == null) {
			btnAdMBTIQResultCreate = new JButton("생성");
			btnAdMBTIQResultCreate.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ActionPartition_insertAction();
				}
			});
			btnAdMBTIQResultCreate.setBounds(20, 320, 60, 29);
		}
		return btnAdMBTIQResultCreate;
	}
	private JButton getBtnAdMBTIResultEdit() {
		if (btnAdMBTIResultEdit == null) {
			btnAdMBTIResultEdit = new JButton("수정");
			btnAdMBTIResultEdit.setBounds(155, 320, 60, 29);
		}
		return btnAdMBTIResultEdit;
	}
	private JButton getBtnAdMBTIResultRemove() {
		if (btnAdMBTIResultRemove == null) {
			btnAdMBTIResultRemove = new JButton("삭제");
			btnAdMBTIResultRemove.setBounds(290, 320, 60, 29);
		}
		return btnAdMBTIResultRemove;
	}
	private JLabel getLblAdMBTIResultNum() {
		if (lblAdMBTIResultNum == null) {
			lblAdMBTIResultNum = new JLabel("번호");
			lblAdMBTIResultNum.setBounds(20, 194, 61, 16);
		}
		return lblAdMBTIResultNum;
	}
	private JTextField getTfAdMBTIResultNum() {
		if (tfAdMBTIResultNum == null) {
			tfAdMBTIResultNum = new JTextField();
			tfAdMBTIResultNum.setEditable(false);
			tfAdMBTIResultNum.setColumns(10);
			tfAdMBTIResultNum.setBounds(93, 189, 60, 26);
		}
		return tfAdMBTIResultNum;
	}
	private JPanel getPanelAdMBTIimage() {
		if (panelAdMBTIimage == null) {
			panelAdMBTIimage = new JPanel();
			panelAdMBTIimage.setBounds(252, 17, 106, 156);
		}
		return panelAdMBTIimage;
	}
	
	
	//--------------------------------------------------------
	
	
	//공백 체크
	// SungAh 2021.04.28
	private int FieldCheck() {
		int i = 0;
		String message = "";
		if(tfAdMBTIResultName.getText().length() == 0) {
			i++;
			message = "MBTI 이름을";
			tfAdMBTIResultName.requestFocus(); // 커서 띄우기
		}
		if(tfAdMBTIResultExplanation.getText().length() == 0) {
			i++;
			message = "MBTI 설명을";
			tfAdMBTIResultExplanation.requestFocus();
		}
		
		if(i>0) {
			JOptionPane.showMessageDialog(null, message + "입력하세요");
		}
		
		return i;
	}
	
	//공백체크 + 생성버튼동작 실행
	//SungAh 2021.04.28
	private void ActionPartition_insertAction() {
		int i_chk = FieldCheck();
		if(i_chk == 0) {
			MMR_insertAction();
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
			String query = "insert into SwingProject_Database.mbtiresult (mrName, mrExplain) values (?,?)";

			ps = conn_mysql.prepareStatement(query);
			ps.setString(1, tfAdMBTIResultName.getText().trim());
			ps.setString(2, tfAdMBTIResultExplanation.getText().trim());
			ps.executeUpdate();
				
//			String adAptitideQA = tfAdAptitideQA.getText().trim();
//			String adAptitideAnswer1 = tfAdAptitideAnswer1.getText().trim();
//			String adAptitideAnswer2 = tfAdAptitideAnswer2.getText().trim();
//			String aptitideAnswer1Score = (String) cbAptitideAnswer1Score.getSelectedItem();
//			String aptitideAnswer2Score = (String) cbAptitideAnswer2Score.getSelectedItem();						
			
			conn_mysql.close(); //DB 연결 끊기
			return true;
		}catch(Exception e) {
			e.printStackTrace();// 화면에 에러코드 보여주기
			return false;
		}
	}

	// 생성 액션
	// SungAh 2021.04.28
	private void MMR_insertAction() {
		
		
		boolean msg = insertAction_boolean();
		if(msg == true) {
			JOptionPane.showMessageDialog(this, "MBTI 결과 정보가 입력되었습니다", "입력완료", 
					JOptionPane.INFORMATION_MESSAGE);
		}else {
			JOptionPane.showMessageDialog(this, "DB에 자료 입력 중 에러가 발생했습니다", "Critical Error!", JOptionPane.ERROR_MESSAGE);
		}
	}

	
	
}//---------------------------------
