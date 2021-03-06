package com.agen.library.window;


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

import com.agen.library.util.DateUtil;

	public class Delet_shou extends JFrame implements ActionListener {
		
		
			private static final long serialVersionUID = 5431014376219067795L;
			Font font1 = new Font("华文彩云", Font.BOLD, 20);
			JLabel lblBookOrAuthor, lblBookDu,label,label1;
			JButton btnSearch, btnExit,delet_all,deletone;
			JTextField txtSearch,txtstarttime,txtendtime;
			JTable tabel;
			JPanel jp1;
			JScrollPane jspTabel;
			DefaultTableModel model;
			StuModel2 sm ;
			public Delet_shou() {
				txtstarttime = new JTextField(DateUtil.getDate(),20);
				txtendtime = new JTextField(DateUtil.getDate(),20);
				label = new JLabel("~");
				label1 = new JLabel("日期范围;");
				label1.setFont(font1);
				label1.setForeground(Color.darkGray);
				lblBookOrAuthor = new JLabel("运 单 号：");
				lblBookDu = new JLabel("操    作:");
				lblBookOrAuthor.setFont(font1);
				lblBookDu.setFont(font1);
				lblBookOrAuthor.setForeground(Color.darkGray);
				lblBookDu.setForeground(Color.darkGray);
				btnSearch = new JButton("搜  索");
				btnSearch.addActionListener(this);
				delet_all = new JButton("批量删除");
				delet_all.addActionListener(this);
				deletone = new JButton("删除");
				deletone.addActionListener(this);
				 btnExit=new JButton("退  出");
				 btnExit.addActionListener(this);
				txtSearch = new JTextField(50);
				jp1 = new JPanel();

				jp1.add(label1);
				jp1.add(txtstarttime);
				jp1.add(label);
				jp1.add(txtendtime);
				jp1.add(lblBookOrAuthor);
				jp1.add(txtSearch);
				jp1.add(btnSearch);
				jp1.add(lblBookDu);
				jp1.add(delet_all);
				jp1.add(deletone);
				jp1.add(btnExit);
				sm= new StuModel2();
				model = new DefaultTableModel(sm.rowdata, sm.columnName);
				tabel = new JTable(model);
				jspTabel = new JScrollPane(tabel);
				this.add(jspTabel);
				this.add(jp1, BorderLayout.SOUTH);
				tabel.setBackground(Color.cyan);
				jp1.setBackground(Color.orange);
				this.setIconImage(new ImageIcon(this.getClass().getClassLoader().getResource("com/images/ct.jpg")).getImage());
				this.setTitle("删除单据");
				int  w = (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth();// 得到屏幕的宽度
				int  h = (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight();// 得到屏幕的高度
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
				// TODO 自动生成的方法存根
				// 查询
				if (e.getSource() == btnSearch) {
					
					String sql = new String();
					String name = this.txtSearch.getText().trim();
					java.sql.Date starttime = DateUtil.getStringToDate(this.txtstarttime.getText().trim());
					java.sql.Date endtime = DateUtil.getStringToDate(this.txtendtime.getText().trim());
					if (name != null && !name.equals("")){
					    sql = "select id,name ,sendtime,sendname,sendphone,sendadress,"
				+ "senddanwei,receivename,receivephone,receivedanwei,receiveadress,"
				+ "price,sheng,shi,quxian,signs,neirong,zhongliang,yunfei,settlement,"
				+ "managerid,scanid,beizhu from send where id like " + name ;
					}
					else if(starttime != null && !starttime.equals("") && 
							endtime!= null && !endtime.equals("")){
						sql = "select id,name ,sendtime,sendname,sendphone,sendadress,"
				+ "senddanwei,receivename,receivephone,receivedanwei,receiveadress,"
				+ "price,sheng,shi,quxian,signs,neirong,zhongliang,yunfei,settlement,"
				+ "managerid,scanid,beizhu from send where riqi BETWEEN " + "'" +starttime +"'" + " AND " + "'" +  endtime+ "'" ;
					}
				
					StuModel sm = new StuModel(sql);
					tabel.setModel(sm);
				}
				if(e.getSource()==btnExit){
					int option = JOptionPane.showConfirmDialog(this, "你确定要退出么？", "提示",
							JOptionPane.YES_NO_OPTION);
					if (option == JOptionPane.YES_OPTION) {
					this.dispose();
					//new Login();
					}
				}
					if(e.getSource() == delet_all){
						String sql = new String();
						java.sql.Date starttime = DateUtil.getStringToDate(this.txtstarttime.getText().trim());
						java.sql.Date endtime = DateUtil.getStringToDate(this.txtendtime.getText().trim());
						if(starttime != null && !starttime.equals("") && 
								endtime!= null && !endtime.equals("")){
							sql = "DELETE FROM send where riqi BETWEEN " + "'" +starttime +"'" + " AND " + "'" +  endtime+ "'" ;
							StuModel sm = new StuModel(sql);
							tabel.setModel(sm);
						}else{
							JOptionPane.showMessageDialog(null, "请认真输入！", "消息", 1);
						}
					}
					if(e.getSource() == deletone){
						String sql = new String();
						String name = this.txtSearch.getText().trim();
						if(name != null && !name.equals("")){
							sql = "DELETE FROM send where id like " + name ;
							StuModel2 sm = new StuModel2(sql);
							tabel.setModel(sm);
						}else{
							JOptionPane.showMessageDialog(null, "请认真输入！", "消息", 1);
						}
					}
			}
}
