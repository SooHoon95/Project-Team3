package com.javalec.SungAh;

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

public class AdManageQuiz extends JPanel {
	private JScrollPane scrollPane_AdQuiz;
	private JTable inner_table_AdQuiz;
	private final DefaultTableModel Outer_Table_AdMBTIQuiz = new DefaultTableModel(); // ################
	private JLabel lblAdQuizNum;
	private JLabel lblAdQuiz;
	private JLabel lblAdQuizAnswer;
	private JLabel lblAdQuizHint1;
	private JLabel lblAdQuizHint2;
	private JTextField tfAdQuizNum;
	private JTextField tfAdQuiz;
	private JTextField tfAdQuizAnswer;
	private JTextField tfAdQuizHint1;
	private JTextField tfAdQuizHint2;
	private JButton btnAdQuizCreate;
	private JButton btnAdQuizEdit;
	private JButton btnAdQuizRemove;

	/**
	 * Create the panel.
	 */
	public AdManageQuiz() {
		setBackground(Color.CYAN);
		setBounds(165, 45, 539, 396);
		setLayout(null);
		add(getScrollPane_AdQuiz());
		add(getLblAdQuizNum());
		add(getLblAdQuiz());
		add(getLblAdQuizAnswer());
		add(getLblAdQuizHint1());
		add(getLblAdQuizHint2());
		add(getTfAdQuizNum());
		add(getTfAdQuiz());
		add(getTfAdQuizAnswer());
		add(getTfAdQuizHint1());
		add(getTfAdQuizHint2());
		add(getBtnAdQuizCreate());
		add(getBtnAdQuizEdit());
		add(getBtnAdQuizRemove());


	}
	private JScrollPane getScrollPane_AdQuiz() {
		if (scrollPane_AdQuiz == null) {
			scrollPane_AdQuiz = new JScrollPane();
			scrollPane_AdQuiz.setBounds(20, 17, 496, 156);
			scrollPane_AdQuiz.setViewportView(getInner_table_AdQuiz());
		}
		return scrollPane_AdQuiz;
	}
	private JTable getInner_table_AdQuiz() {
		if (inner_table_AdQuiz == null) {
			inner_table_AdQuiz = new JTable();
			inner_table_AdQuiz.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			inner_table_AdQuiz.setModel(Outer_Table_AdMBTIQuiz); // 테이블을 불러오기 위해 ******꼭 써야할 것*****
			
			//관리자 User table 설정
			Outer_Table_AdMBTIQuiz.addColumn("번호");
			Outer_Table_AdMBTIQuiz.addColumn("질문");
			Outer_Table_AdMBTIQuiz.addColumn("답");
			Outer_Table_AdMBTIQuiz.addColumn("힌트1");
			Outer_Table_AdMBTIQuiz.addColumn("힌트2");
			Outer_Table_AdMBTIQuiz.setColumnCount(5); // Column이 4개
			
			int i = Outer_Table_AdMBTIQuiz.getRowCount();
			for(int j=0; j<i; j++) {
				Outer_Table_AdMBTIQuiz.removeRow(0);
			}
			
//			inner_table_AdManageUser.setAutoResizeMode(inner_table_AdManageUser.AUTO_RESIZE_OFF); // 마음대로 리사이징 x
			
			int vColIndex = 0; // 첫번째 행
			TableColumn col = inner_table_AdQuiz.getColumnModel().getColumn(vColIndex);
			int width = 30; // 첫번째 행 가로
			col.setPreferredWidth(width);; // 첫번째 행 가로크기 설정
			
			vColIndex = 1; // 2번째 행
			col = inner_table_AdQuiz.getColumnModel().getColumn(vColIndex);
			width = 100; // 2번째 행 가로
			col.setPreferredWidth(width);; // 2번째 행 가로크기 설정
			
			vColIndex = 2; // 3번째 행
			col = inner_table_AdQuiz.getColumnModel().getColumn(vColIndex);
			width = 150; // 3번째 행 가로
			col.setPreferredWidth(width);; // 3번째 행 가로크기 설정
			
			vColIndex = 3; // 4번째 행
			col = inner_table_AdQuiz.getColumnModel().getColumn(vColIndex);
			width = 100; // 4번째 행 가로
			col.setPreferredWidth(width);; // 4번째 행 가로크기 설정
			
			vColIndex = 4; // 5번째 행
			col = inner_table_AdQuiz.getColumnModel().getColumn(vColIndex);
			width = 100; // 5번째 행 가로
			col.setPreferredWidth(width);; // 5번째 행 가로크기 설정
			
		}
		return inner_table_AdQuiz;
	}
	
	private JLabel getLblAdQuizNum() {
		if (lblAdQuizNum == null) {
			lblAdQuizNum = new JLabel("번호");
			lblAdQuizNum.setBounds(20, 194, 61, 16);
		}
		return lblAdQuizNum;
	}
	private JLabel getLblAdQuiz() {
		if (lblAdQuiz == null) {
			lblAdQuiz = new JLabel("질문");
			lblAdQuiz.setBounds(20, 230, 61, 16);
		}
		return lblAdQuiz;
	}
	private JLabel getLblAdQuizAnswer() {
		if (lblAdQuizAnswer == null) {
			lblAdQuizAnswer = new JLabel("답");
			lblAdQuizAnswer.setBounds(20, 263, 61, 16);
		}
		return lblAdQuizAnswer;
	}
	private JLabel getLblAdQuizHint1() {
		if (lblAdQuizHint1 == null) {
			lblAdQuizHint1 = new JLabel("힌트1");
			lblAdQuizHint1.setBounds(20, 297, 61, 16);
		}
		return lblAdQuizHint1;
	}
	private JLabel getLblAdQuizHint2() {
		if (lblAdQuizHint2 == null) {
			lblAdQuizHint2 = new JLabel("힌트2");
			lblAdQuizHint2.setBounds(20, 333, 61, 16);
		}
		return lblAdQuizHint2;	
	}
	
	private JTextField getTfAdQuizNum() {
		if (tfAdQuizNum == null) {
			tfAdQuizNum = new JTextField();
			tfAdQuizNum.setBounds(93, 189, 423, 26);
			tfAdQuizNum.setColumns(10);
		}
		return tfAdQuizNum;
	}
	private JTextField getTfAdQuiz() {
		if (tfAdQuiz == null) {
			tfAdQuiz = new JTextField();
			tfAdQuiz.setColumns(10);
			tfAdQuiz.setBounds(93, 225, 423, 26);
		}
		return tfAdQuiz;
	}
	private JTextField getTfAdQuizAnswer() {
		if (tfAdQuizAnswer == null) {
			tfAdQuizAnswer = new JTextField();
			tfAdQuizAnswer.setColumns(10);
			tfAdQuizAnswer.setBounds(93, 258, 423, 26);
		}
		return tfAdQuizAnswer;
	}
	private JTextField getTfAdQuizHint1() {
		if (tfAdQuizHint1 == null) {
			tfAdQuizHint1 = new JTextField();
			tfAdQuizHint1.setColumns(10);
			tfAdQuizHint1.setBounds(93, 292, 423, 26);
		}
		return tfAdQuizHint1;
	}
	private JTextField getTfAdQuizHint2() {
		if (tfAdQuizHint2 == null) {
			tfAdQuizHint2 = new JTextField();
			tfAdQuizHint2.setColumns(10);
			tfAdQuizHint2.setBounds(93, 330, 423, 26);
		}
		return tfAdQuizHint2;
	}
	private JButton getBtnAdQuizCreate() {
		if (btnAdQuizCreate == null) {
			btnAdQuizCreate = new JButton("생성");
			btnAdQuizCreate.setBounds(20, 361, 117, 29);
		}
		return btnAdQuizCreate;
	}
	private JButton getBtnAdQuizEdit() {
		if (btnAdQuizEdit == null) {
			btnAdQuizEdit = new JButton("수정");
			btnAdQuizEdit.setBounds(209, 361, 117, 29);
		}
		return btnAdQuizEdit;
	}
	private JButton getBtnAdQuizRemove() {
		if (btnAdQuizRemove == null) {
			btnAdQuizRemove = new JButton("삭제");
			btnAdQuizRemove.setBounds(399, 361, 117, 29);
		}
		return btnAdQuizRemove;
	}
	
	
	
	
}//-------------------------
