package com.javalec.adminMain;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class AdManagerMBTIResult extends JPanel {
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

	/**
	 * Create the panel.
	 */
	public AdManagerMBTIResult() {
		setBackground(Color.GREEN);
		setBounds(165, 45, 539, 396);
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
		
		

	}
	private JScrollPane getScrollPane_AdMBTIResult() {
		if (scrollPane_AdMBTIResult == null) {
			scrollPane_AdMBTIResult = new JScrollPane();
			scrollPane_AdMBTIResult.setBounds(20, 17, 496, 156);
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
			lblAdMBTIResultName.setBounds(20, 211, 61, 16);
		}
		return lblAdMBTIResultName;
	}
	private JLabel getlblAdMBTIResultExplanation() {
		if (lblAdMBTIResultExplanation == null) {
			lblAdMBTIResultExplanation = new JLabel("MBTI설명");
			lblAdMBTIResultExplanation.setBounds(20, 250, 61, 16);
		}
		return lblAdMBTIResultExplanation;
	}
	
	private JTextField getTfAdMBTIResultName() {
		if (tfAdMBTIResultName == null) {
			tfAdMBTIResultName = new JTextField();
			tfAdMBTIResultName.setBounds(93, 206, 423, 26);
			tfAdMBTIResultName.setColumns(10);
		}
		return tfAdMBTIResultName;
	}
	private JTextField getTfAdMBTIResultExplanation() {
		if (tfAdMBTIResultExplanation == null) {
			tfAdMBTIResultExplanation = new JTextField();
			tfAdMBTIResultExplanation.setColumns(10);
			tfAdMBTIResultExplanation.setBounds(93, 244, 423, 105);
		}
		return tfAdMBTIResultExplanation;
	}
	
	private JButton getBtnAdMBTIResultCreate() {
		if (btnAdMBTIQResultCreate == null) {
			btnAdMBTIQResultCreate = new JButton("생성");
			btnAdMBTIQResultCreate.setBounds(20, 361, 117, 29);
		}
		return btnAdMBTIQResultCreate;
	}
	private JButton getBtnAdMBTIResultEdit() {
		if (btnAdMBTIResultEdit == null) {
			btnAdMBTIResultEdit = new JButton("수정");
			btnAdMBTIResultEdit.setBounds(209, 361, 117, 29);
		}
		return btnAdMBTIResultEdit;
	}
	private JButton getBtnAdMBTIResultRemove() {
		if (btnAdMBTIResultRemove == null) {
			btnAdMBTIResultRemove = new JButton("삭제");
			btnAdMBTIResultRemove.setBounds(399, 361, 117, 29);
		}
		return btnAdMBTIResultRemove;
	}
	private JLabel getLblAdMBTIResultNum() {
		if (lblAdMBTIResultNum == null) {
			lblAdMBTIResultNum = new JLabel("번호");
			lblAdMBTIResultNum.setBounds(20, 185, 61, 16);
		}
		return lblAdMBTIResultNum;
	}
	private JTextField getTfAdMBTIResultNum() {
		if (tfAdMBTIResultNum == null) {
			tfAdMBTIResultNum = new JTextField();
			tfAdMBTIResultNum.setColumns(10);
			tfAdMBTIResultNum.setBounds(93, 180, 423, 26);
		}
		return tfAdMBTIResultNum;
	}
}//---------------------------------
