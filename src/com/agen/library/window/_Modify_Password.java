/*
 * _Modify_Password.java
 *
 * Created on __DATE__, __TIME__
 */

package com.agen.library.window;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import com.agen.library.factory.DAOFactory;
import com.agen.library.util.GlobalUser;

/**
 *
 * @author  __USER__
 */
public class _Modify_Password extends javax.swing.JFrame {

	private static final long serialVersionUID = -315845408404355027L;

	/** Creates new form _Modify_Password */
	public _Modify_Password() {
		super("�޸�����");
		Image ime = new ImageIcon(this.getClass().getClassLoader().getResource("com/images/ico.png")).getImage();
		setIconImage(ime);
		initComponents();
		setLocationRelativeTo(null);
		this.setResizable(false);
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jTextField1 = new javax.swing.JTextField();
		jTextField2 = new javax.swing.JTextField();
		jTextField3 = new javax.swing.JTextField();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jPasswordField1 = new javax.swing.JPasswordField();
		jPasswordField2 = new javax.swing.JPasswordField();
		jPasswordField3 = new javax.swing.JPasswordField();
		jSeparator1 = new javax.swing.JSeparator();

		jTextField1.setFont(new java.awt.Font("΢���ź�", 0, 14));

		jTextField2.setFont(new java.awt.Font("΢���ź�", 0, 14));

		jTextField3.setFont(new java.awt.Font("΢���ź�", 0, 14));

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

		jLabel1.setFont(new java.awt.Font("΢���ź�", 0, 18));
		jLabel1.setText("\u5bc6\u7801\u7ba1\u7406");

		jLabel2.setFont(new java.awt.Font("΢���ź�", 0, 14));
		jLabel2.setText("\u539f  \u5bc6 \u7801\uff1a");

		jLabel3.setFont(new java.awt.Font("΢���ź�", 0, 14));
		jLabel3.setText("\u65b0  \u5bc6 \u7801\uff1a");

		jLabel4.setFont(new java.awt.Font("΢���ź�", 0, 14));
		jLabel4.setText("\u786e\u8ba4\u5bc6\u7801\uff1a");

		jButton1.setFont(new java.awt.Font("΢���ź�", 0, 14));
		jButton1.setText("\u786e\u8ba4");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jButton2.setFont(new java.awt.Font("΢���ź�", 0, 14));
		jButton2.setText("\u5173\u95ed");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jPasswordField1.setFont(new java.awt.Font("΢���ź�", 0, 14));

		jPasswordField2.setFont(new java.awt.Font("΢���ź�", 0, 14));

		jPasswordField3.setFont(new java.awt.Font("΢���ź�", 0, 14));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.TRAILING)
												.addComponent(jLabel3)
												.addComponent(jLabel2)
												.addComponent(jLabel4))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.TRAILING,
												false)
												.addComponent(
														jPasswordField2,
														javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(
														jPasswordField3,
														javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														javax.swing.GroupLayout.Alignment.LEADING,
														layout.createSequentialGroup()
																.addComponent(
																		jButton1)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		Short.MAX_VALUE)
																.addComponent(
																		jButton2))
												.addComponent(
														jPasswordField1,
														javax.swing.GroupLayout.Alignment.LEADING,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														143, Short.MAX_VALUE))
								.addContainerGap(
										javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE))
				.addComponent(jSeparator1,
						javax.swing.GroupLayout.DEFAULT_SIZE, 242,
						Short.MAX_VALUE)
				.addGroup(
						layout.createSequentialGroup().addGap(85, 85, 85)
								.addComponent(jLabel1)
								.addContainerGap(85, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGap(12, 12, 12)
								.addComponent(jLabel1)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jSeparator1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										10,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(18, 18, 18)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel2)
												.addComponent(
														jPasswordField1,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(14, 14, 14)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel3)
												.addComponent(
														jPasswordField2,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel4)
												.addComponent(
														jPasswordField3,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jButton1)
												.addComponent(jButton2))
								.addContainerGap(41, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		this.dispose();
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		//�޸�����
		String pass = String.valueOf(jPasswordField1.getPassword());
		String new_pass = String.valueOf(jPasswordField2.getPassword());
		String config_pass = String.valueOf(jPasswordField3.getPassword());

		if (pass != null && !pass.equals("") && new_pass != null
				&& !new_pass.equals("") && config_pass != null
				&& !config_pass.equals("")) {
			String old_pass = GlobalUser.LOGIN_USER.getPass();
			if (pass.equals(old_pass)) {
				//�ж������Ƿ���ȷ
				if (new_pass.equals(config_pass)) {
					//�ж��������Ƿ���ȷ
					GlobalUser.LOGIN_USER.setPass(new_pass);
					boolean flag = false;
					try {
						flag = DAOFactory.getIUserDAOInstance().doUpdate(
								GlobalUser.LOGIN_USER);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					if (flag) {
						JOptionPane.showMessageDialog(null, "�޸ĳɹ���", "��Ϣ", 1);
						this.dispose();
					} else {
						return;
					}
				} else {
					JOptionPane.showMessageDialog(null, "�������벻һ�£����������룡", "��Ϣ",
							2);
				}

			} else {
				JOptionPane.showMessageDialog(null, "�������", "��Ϣ", 2);
				return;
			}
		} else {
			JOptionPane.showMessageDialog(null, "���������룡", "��Ϣ", 2);
		}

	}

	/**
	 * @param args the command line arguments
	 */
	public static void start() {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new _Modify_Password().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JPasswordField jPasswordField1;
	private javax.swing.JPasswordField jPasswordField2;
	private javax.swing.JPasswordField jPasswordField3;
	private javax.swing.JSeparator jSeparator1;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JTextField jTextField3;
	// End of variables declaration//GEN-END:variables

}