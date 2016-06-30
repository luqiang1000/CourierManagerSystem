package com.agen.library.window;


	import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

import javax.swing.table.AbstractTableModel;

	public class StuModel_ji extends AbstractTableModel {
		/**
		 * 
		 */
		private static final long serialVersionUID = -44952199646762484L;
		Connection ct = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Vector rowdata, columnName;

		public void init(String sql) {
			if (sql.equals("")) {
				sql = "select sendphone,sendname,"
			    		+ "senddanwei,sendadress from send";
			}
			columnName = new Vector();
			//columnName.add("ID");
			columnName.add("�ļ��˵绰");
			columnName.add("�ļ�������");
			columnName.add("�ļ��˵�λ");
			columnName.add("�ļ��˵�ַ");
			rowdata = new Vector( );
			try {
				// ��������
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
				ct = DriverManager.getConnection(
						"jdbc:sqlserver://localhost:1433;DatabaseName=_library",
						"sa", "123456");
				ps = ct.prepareStatement(sql);
				rs = ps.executeQuery();

				while (rs.next()) {
					Vector v = new Vector();
					//v.add(rs.getInt(1));

					v.add(rs.getString(1));
					v.add(rs.getString(2));
					v.add(rs.getString(3));
					v.add(rs.getString(4));
					rowdata.add(v);
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				// �ر�
				try {
					if (rs != null)
						rs.close();
					if (ps != null)
						ps.close();
					if (ct != null)
						ct.close();
				} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
			}
		}

		// ��ʼ������ģ��
		public StuModel_ji() {
			this.init("");
		}

		// ͨ�����ݵ�SQL������������ģ��
		public StuModel_ji(String sql) {
			this.init(sql);
		}

		
		// �õ����ж�����
		public int getRowCount() {
			// TODO �Զ����ɵķ������
			return this.rowdata.size();
		}

		// �õ����ж�����
		public int getColumnCount() {
			// TODO �Զ����ɵķ������
			return this.columnName.size();
		}

		// �õ�ĳ��ĳ�е�����
		public Object getValueAt(int rowIndex, int columnIndex) {
			// TODO �Զ����ɵķ������
			return ((Vector) this.rowdata.get(rowIndex)).get(columnIndex);
		}

		/*
		 * ���� Javadoc��
		 * 
		 * @see javax.swing.table.AbstractTableModel#getColumnName(int)
		 */
		@Override
		public String getColumnName(int column) {
			// TODO �Զ����ɵķ������
			return (String) this.columnName.get(column);
		}
}
