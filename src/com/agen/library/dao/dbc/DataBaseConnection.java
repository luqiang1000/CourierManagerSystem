package com.agen.library.dao.dbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {
	/**
	 * ���ݿ��������
	 */
	
	//Mysql ���ݿ������� --�鿴��Ŀ¼�µ�Database_script.sql�ļ�
	//�ڷ���jar�ļ�ʱҪ��mysql����һ����
    private static final String DBDRIVER="com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private static final String DBURL="jdbc:sqlserver://localhost:1433;DatabaseName=_library";
    private static final String DBUSER="sa"; //mysql�û���
    private static final String DBPASS="123456"; //mysql����
    private Connection conn=null;
   
    public DataBaseConnection(){
    	try {
			Class.forName(DBDRIVER);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			conn=DriverManager.getConnection(DBURL, DBUSER, DBPASS);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
	
	//Access���ݿ�--λ�÷���D:/
	/*private static final String DBDRIVER="sun.jdbc.odbc.JdbcOdbcDriver";
	private static final String DBURL="jdbc:odbc:driver={Microsoft Access Driver (*.mdb)};DBQ=D:/_library.mdb";
    private Connection conn=null;

   
    public DataBaseConnection(){
    	try {
			Class.forName(DBDRIVER);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			conn=DriverManager.getConnection(DBURL);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }*/
	public Connection getConnection(){
		return this.conn;
	}
	public void close(){
		if(this.conn!=null){
			try {
				this.conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
