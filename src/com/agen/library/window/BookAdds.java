package com.agen.library.window;



	import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.agen.library.util.DateUtil;

	public class BookAdds extends JFrame{

		/**
		 * 
		 */
		private static final long serialVersionUID = -4646426758340479964L;
		// �������
		JButton btnAdd, btnCancel;
		JTextField txtBookName, txtAuthor, txtISBN, txtWordsCount, txtUnitPrice;
		JLabel lblBookName, lblAuthor, lblISBN, lblWordsCount, lblUnitPrice;
		JLabel lblContentDescription, lblAurhorDescription,jp6;
		JScrollPane jspContentDescription, jspAurhorDescription;
		JTextArea jtaContentDescription, jtaAurhorDescription,textjp6;
		JPanel jp1, jp2, jp3, jp4, jp5;
		public BookAdds(JFrame jf, String s, boolean b,String id ) {
			// ���������������
			JLabel label1 = new JLabel();
			jp6 = new JLabel("*�˵���");
			textjp6 = new JTextArea();
			if(id != null){
				textjp6.setText(id);
			}
			lblBookName = new JLabel("*ǩ��ʱ�䣺");
			txtBookName = new JTextField(10);
			txtBookName.setText(DateUtil.getDateTime());
			lblAuthor = new JLabel("*��ݷѣ�");
			txtAuthor = new JTextField(10);

			lblISBN = new JLabel("*���տ");
			txtISBN = new JTextField(10);
			lblWordsCount = new JLabel("*Ӧ�տ");
			txtWordsCount = new JTextField(10);
			lblUnitPrice = new JLabel("*ʵ�տ");
			txtUnitPrice = new JTextField(10);
			btnAdd = new JButton("ǩ��");// ��ť����
			//btnAdd.addActionListener(this);
			btnAdd.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent evt) {
					addactionPerformed(evt);
				}
			});
			btnCancel = new JButton("ȡ��");
			//btnCancel.addActionListener(this);
			btnCancel.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent evt) {
					celactionPerformed(evt);
				}
			});
			initComponents();
		}
			
			private void initComponents(){
			javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
					getContentPane());
			getContentPane().setBackground(Color.GRAY);
			getContentPane().setLayout(layout);
			layout.setHorizontalGroup(layout
					.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
					.addGroup(
							layout.createSequentialGroup()
									.addContainerGap(50, Short.MAX_VALUE)
									.addComponent(jp6,
											javax.swing.GroupLayout.PREFERRED_SIZE,
											80,
											javax.swing.GroupLayout.PREFERRED_SIZE)
									.addContainerGap(1, Short.MAX_VALUE)
									.addComponent(textjp6,
											javax.swing.GroupLayout.PREFERRED_SIZE,
											200, 
											javax.swing.GroupLayout.PREFERRED_SIZE)
									.addContainerGap(50, Short.MAX_VALUE))
					.addGroup(
							layout.createSequentialGroup()
									.addContainerGap(50, Short.MAX_VALUE)
									.addComponent(lblBookName,
											javax.swing.GroupLayout.PREFERRED_SIZE,
											80,
											javax.swing.GroupLayout.PREFERRED_SIZE)
									.addContainerGap(1, Short.MAX_VALUE)
									.addComponent(txtBookName,
											javax.swing.GroupLayout.PREFERRED_SIZE,
											200, 
											javax.swing.GroupLayout.PREFERRED_SIZE)
									.addContainerGap(50, Short.MAX_VALUE))
					.addGroup(
							layout.createSequentialGroup()
							.addContainerGap(50, Short.MAX_VALUE)
							.addComponent(lblAuthor,
									javax.swing.GroupLayout.PREFERRED_SIZE,
									 80,
									 javax.swing.GroupLayout.PREFERRED_SIZE)
							.addContainerGap(1, Short.MAX_VALUE)
							.addComponent(txtAuthor, 
									javax.swing.GroupLayout.PREFERRED_SIZE,
									200, 
									javax.swing.GroupLayout.PREFERRED_SIZE)
							.addContainerGap(50, Short.MAX_VALUE))
					.addGroup(
							layout.createSequentialGroup()
							.addContainerGap(50, Short.MAX_VALUE)
							.addComponent(lblISBN,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										80,
										javax.swing.GroupLayout.PREFERRED_SIZE)
							.addContainerGap(1, Short.MAX_VALUE)
							.addComponent(txtISBN, 
										javax.swing.GroupLayout.PREFERRED_SIZE,
										200, 
										javax.swing.GroupLayout.PREFERRED_SIZE)
							.addContainerGap(50, Short.MAX_VALUE))
					.addGroup(
							layout.createSequentialGroup()
							.addContainerGap(50, Short.MAX_VALUE)
							.addComponent(lblWordsCount,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										 80,
										 javax.swing.GroupLayout.PREFERRED_SIZE)
							.addContainerGap(1, Short.MAX_VALUE)
							.addComponent(txtWordsCount, 
										javax.swing.GroupLayout.PREFERRED_SIZE,
										200, 
										javax.swing.GroupLayout.PREFERRED_SIZE)
							.addContainerGap(50, Short.MAX_VALUE))
					.addGroup(
							layout.createSequentialGroup()
							.addContainerGap(50, Short.MAX_VALUE)
							.addComponent(lblUnitPrice,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										 80,
										 javax.swing.GroupLayout.PREFERRED_SIZE)
							.addContainerGap(1, Short.MAX_VALUE)
							.addComponent(txtUnitPrice, 
										javax.swing.GroupLayout.PREFERRED_SIZE,
										200, 
										javax.swing.GroupLayout.PREFERRED_SIZE)
							.addContainerGap(50, Short.MAX_VALUE))
							.addGroup(
									layout.createSequentialGroup()
									.addContainerGap(50, Short.MAX_VALUE)
									.addComponent(btnAdd,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												 80,
												 javax.swing.GroupLayout.PREFERRED_SIZE)
									.addContainerGap(1, Short.MAX_VALUE)
									.addComponent(btnCancel, 
												javax.swing.GroupLayout.PREFERRED_SIZE,
												80, 
												javax.swing.GroupLayout.PREFERRED_SIZE)
									.addContainerGap(50, Short.MAX_VALUE)));
			
			layout.setVerticalGroup(( layout
					.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
					.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup()
						.addGroup(layout
											.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
											.addComponent(jp6)
											.addComponent(textjp6))
									.addPreferredGap(
													javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
							.addGroup(layout
											.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
											.addComponent(lblBookName)
											.addComponent(txtBookName))
									.addPreferredGap(
													javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
							.addGroup(layout
											.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
											.addComponent(lblAuthor)
											.addComponent(txtAuthor))
								.addPreferredGap(
													javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
							.addGroup(layout
											.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
											.addComponent(lblISBN)
											.addComponent(txtISBN))
									.addPreferredGap(
													javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
							.addGroup(layout
											.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
											.addComponent(lblWordsCount)
											.addComponent(txtWordsCount))
									.addPreferredGap(
													javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
							.addGroup(layout
											.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
											.addComponent(lblUnitPrice)
											.addComponent(txtUnitPrice))
									.addPreferredGap(
													javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
									.addGroup(layout
											.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
											.addComponent(btnAdd)
											.addComponent(btnCancel))
									.addPreferredGap(
													javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
					)));

			pack();



			// ���ô�������
			this.setIconImage(new ImageIcon(this.getClass().getClassLoader().getResource("com/images/ct.jpg")).getImage());
			//this.setSize(800, 500);
			double sw = Toolkit.getDefaultToolkit().getScreenSize().getWidth();
			double sh = Toolkit.getDefaultToolkit().getScreenSize().getHeight();
			int fw = this.getWidth();
			int fh = this.getHeight();
			this.setLocation((int) (sw - fw) / 2, (int) (sh - fh) / 2);
			this.setVisible(true);
		}

		public void addactionPerformed(ActionEvent e) {
			// TODO �Զ����ɵķ������
			if (textjp6.getText() != null && !textjp6.getText().equals("") 
					&& txtBookName.getText() != null && !txtBookName.getText().equals("")
					&& txtAuthor.getText() != null && !txtAuthor.getText().equals("")
					&& txtISBN.getText() != null && !txtISBN.getText().equals("")
					&& txtWordsCount.getText() != null && !txtWordsCount.getText().equals("")
					&& txtUnitPrice.getText() != null && !txtUnitPrice.getText().equals("")) {
				int option = JOptionPane.showConfirmDialog(this, "��ȷ��Ҫǩ��ô��", "��ʾ",
						JOptionPane.YES_NO_OPTION);
				if (option == JOptionPane.YES_OPTION) {
					Connection ct = null;
					PreparedStatement ps = null;
					try {
						Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
						ct = DriverManager
								.getConnection(
										"jdbc:sqlserver://localhost:1433;DatabaseName=_library",
										"sa", "123456");
						// �������
						String sql = "UPDATE receive SET signtime=?,signs=?,cost=?,daicost=?,yingcost=?,shicost=? WHERE id=?";
						ps = ct.prepareStatement(sql);
						// ��������ֵ
						ps.setString(1, txtBookName.getText());
						ps.setString(2, "ǩ��");
						ps.setString(3, txtAuthor.getText());
						ps.setString(4, txtISBN.getText());
						ps.setString(5, txtWordsCount.getText());
						ps.setString(6, txtUnitPrice.getText());
						ps.setString(7, textjp6.getText().trim());
						// ִ�в���
						ps.executeUpdate();
					} catch (Exception e1) {
						e1.printStackTrace();
					}
					this.dispose();
					new Book();
					
				}
		}
			else{
					JOptionPane.showMessageDialog(null, "���������룡", "��Ϣ", 1);
			}
		}
				public void celactionPerformed(ActionEvent e) {
				int option = JOptionPane.showConfirmDialog(this,
						"����д�����ݲ�����ӣ���ȷ��Ҫ�˳���", "��ʾ", JOptionPane.YES_NO_OPTION);
				if (option == JOptionPane.YES_OPTION) {
					this.dispose();
					new Book();
					
				}
			}
}
