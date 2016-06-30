package com.agen.library.window;
/**
 * ���ܣ�ͼ����ҳ
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Book extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5431014376219067795L;
	Font font1 = new Font("���Ĳ���", Font.BOLD, 20);
	JLabel lblBookOrAuthor, lblBookDu;
	JButton btnSearch, btnAdd, btnExit,other;
	JTextField txtSearch;
	JTable tabel;
	JPanel jp1;
	JScrollPane jspTabel;
	DefaultTableModel model;
	StuModel sm ;
	public Book() {
		lblBookOrAuthor = new JLabel("�� �� �ţ�");
		lblBookDu = new JLabel("��    ��:");
		lblBookOrAuthor.setFont(font1);
		lblBookDu.setFont(font1);
		lblBookOrAuthor.setForeground(Color.darkGray);
		lblBookDu.setForeground(Color.darkGray);
		btnSearch = new JButton("��  ��");
		btnSearch.addActionListener(this);
		btnAdd = new JButton("ǩ  ��");
		btnAdd.addActionListener(this);
		 btnExit=new JButton("��  ��");
		 btnExit.addActionListener(this);
		txtSearch = new JTextField(50);
		jp1 = new JPanel();
		other = new JButton("��  ��");
		other.addActionListener(this);

		jp1.add(lblBookOrAuthor);
		jp1.add(txtSearch);
		jp1.add(btnSearch);
		jp1.add(lblBookDu);
		jp1.add(btnAdd);
		jp1.add(btnExit);
		jp1.add(other);
		sm= new StuModel();
		model = new DefaultTableModel(sm.rowdata, sm.columnName);
		tabel = new JTable(model);
		jspTabel = new JScrollPane(tabel);
		this.add(jspTabel);
		this.add(jp1, BorderLayout.SOUTH);
		tabel.setBackground(Color.cyan);
		jp1.setBackground(Color.orange);
		this.setIconImage(new ImageIcon(this.getClass().getClassLoader().getResource("com/images/ct.jpg")).getImage());
		this.setTitle("�ɼ�����");
		int  w = (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth();// �õ���Ļ�Ŀ��
		int  h = (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight();// �õ���Ļ�ĸ߶�
		this.setSize(w, h);
		//double sw = Toolkit.getDefaultToolkit().getScreenSize().getWidth();
		//double sh = Toolkit.getDefaultToolkit().getScreenSize().getHeight();
		//int fw = this.getWidth();
		//int fh = this.getHeight();
		//this.setLocation((int) (sw - fw) / 2, (int) (sh - fh) / 2);
		this.setVisible(true);
		//this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public void actionPerformed(ActionEvent e) {
		// TODO �Զ����ɵķ������
		// ��ѯ
		if (e.getSource() == btnSearch) {
			
			String sql = new String();
			String name = this.txtSearch.getText().trim();
			String s = this.txtSearch.getText().trim();
			if (name != null && !name.equals("")){
			    sql = "select id,name ,managerid,signs,receivedate,receivephone,"
				+ "receivename,receiveadress,scanid,sends,sendname,dotime,doname,"
				+ "signtime,settlement,cost,daicost,yingcost,shicost,"
				+ "beizhu from receive where id like " + name ;
			}
			else{
				sql = "select id,name ,managerid,signs,receivedate,receivephone,"
						+ "receivename,receiveadress,scanid,sends,sendname,dotime,doname,"
						+ "signtime,settlement,cost,daicost,yingcost,shicost,"
						+ "beizhu from receive ";
			}
		
			StuModel sm = new StuModel(sql);
			tabel.setModel(sm);
		}
		if (e.getSource() == other){
			if(txtSearch.getText() != null && !txtSearch.getText().equals("")){
				new Other(this, "����", true,txtSearch.getText());
				}
				else
				{
					new Other(this, "����", true,null);
				}
				StuModel sm = new StuModel();
				tabel.setModel(sm);
				this.dispose();
		}
		// ���
		if (e.getSource() == btnAdd) {
			if(txtSearch.getText() != null && !txtSearch.getText().equals("")){
			new BookAdds(this, "ǩ��", true,txtSearch.getText());
			}
			else
			{
				new BookAdds(this, "ǩ��", true,null);
			}
			StuModel sm = new StuModel();
			tabel.setModel(sm);
			setVisible(false);
		}
		if(e.getSource()==btnExit){
			int option = JOptionPane.showConfirmDialog(this, "��ȷ��Ҫ�˳�ô��", "��ʾ",
					JOptionPane.YES_NO_OPTION);
			if (option == JOptionPane.YES_OPTION) {
			this.dispose();
			//new Login();
			}
		}
		
	}

}

