/*
 * BookDelete.java
 *
 * Created on __DATE__, __TIME__
 */

package com.agen.library.window;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import com.agen.library.factory.DAOFactory;
import com.agen.library.vo.User;

/**
 *
 * @author  __USER__
 */
public class UserDelete extends javax.swing.JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 673535389283420022L;

	/** Creates new form BookDelete */
	public UserDelete() {
		super("ɾ���û�");
		Image ime = new ImageIcon(this.getClass().getClassLoader().getResource("com/images/ico.png")).getImage();
		setIconImage(ime);
		initComponents();
		this.setResizable(false);
		setLocationRelativeTo(null);
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		jButton1 = new javax.swing.JButton();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTextArea1 = new javax.swing.JTextArea();
		jButton2 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		jSeparator1 = new javax.swing.JSeparator();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

		jLabel1.setFont(new java.awt.Font("΢���ź�", 0, 18));
		jLabel1.setText("\u5220\u9664\u7528\u6237\u4fe1\u606f");

		jLabel2.setFont(new java.awt.Font("΢���ź�", 0, 14));
		jLabel2.setText("\u7f16    \u53f7\uff1a");

		jTextField1.setFont(new java.awt.Font("΢���ź�", 0, 14));

		jButton1.setBackground(new java.awt.Color(223, 216, 216));
		jButton1.setFont(new java.awt.Font("΢���ź�", 0, 14));
		jButton1.setText("\u67e5\u8be2");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jTextArea1.setColumns(20);
		jTextArea1.setFont(new java.awt.Font("΢���ź�", 0, 14));
		jTextArea1.setLineWrap(true);
		jTextArea1.setRows(5);
		jScrollPane1.setViewportView(jTextArea1);

		jButton2.setBackground(new java.awt.Color(223, 216, 216));
		jButton2.setFont(new java.awt.Font("΢���ź�", 0, 14));
		jButton2.setText("delete");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jButton3.setBackground(new java.awt.Color(223, 216, 216));
		jButton3.setFont(new java.awt.Font("΢���ź�", 0, 14));
		jButton3.setText("close");
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														layout.createSequentialGroup()
																.addGap(187,
																		187,
																		187)
																.addComponent(
																		jButton2)
																.addGap(80, 80,
																		80)
																.addComponent(
																		jButton3))
												.addGroup(
														layout.createSequentialGroup()
																.addGap(87, 87,
																		87)
																.addComponent(
																		jScrollPane1,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		415,
																		javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGroup(
														layout.createSequentialGroup()
																.addGap(134,
																		134,
																		134)
																.addComponent(
																		jLabel2)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		jTextField1,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		183,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		jButton1))
												.addGroup(
														layout.createSequentialGroup()
																.addGap(237,
																		237,
																		237)
																.addComponent(
																		jLabel1))
												.addGroup(
														layout.createSequentialGroup()
																.addGap(50, 50,
																		50)
																.addComponent(
																		jSeparator1,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		485,
																		javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addContainerGap(50, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addComponent(jLabel1)
								.addGap(23, 23, 23)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jButton1)
												.addComponent(jLabel2)
												.addComponent(
														jTextField1,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														33,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(18, 18, 18)
								.addComponent(jSeparator1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										10,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jScrollPane1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										301,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jButton3)
												.addComponent(jButton2))
								.addContainerGap(14, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		this.dispose();
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		//��ѯ�û�
		String id = jTextField1.getText();
		if (id != null && !id.equals("")) {
			try {
				User user = DAOFactory.getIUserDAOInstance().findByIds(id);

				if (user != null) {
					jTextArea1.setText(user.toString());
				} else {
					JOptionPane.showMessageDialog(null, "���û������ڣ�", "��Ϣ", 1);
				}
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			JOptionPane.showMessageDialog(null, "�������ţ�", "��Ϣ", 1);
		}
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		// ɾ����Ϣ
		String id = jTextField1.getText();
		boolean flag = false;
		if (id != null && !id.equals("")) {
			try {
				flag = DAOFactory.getIUserDAOInstance().doDelete(id);

			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (flag) {
				JOptionPane.showMessageDialog(null, "ɾ���ɹ���", "��Ϣ", 1);
				this.dispose();
			}
			if (!flag) {
				JOptionPane.showMessageDialog(null, "���û������ڣ�", "��Ϣ", 1);
			}
		} else {
			JOptionPane.showMessageDialog(null, "����дҪɾ�����û���ţ�", "��Ϣ", 1);
		}
	}

	/**
	 * @param args the command line arguments
	 */
	public static void start() {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new UserDelete().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JSeparator jSeparator1;
	private javax.swing.JTextArea jTextArea1;
	private javax.swing.JTextField jTextField1;
	// End of variables declaration//GEN-END:variables

}