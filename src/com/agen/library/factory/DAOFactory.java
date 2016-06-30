package com.agen.library.factory;

import com.agen.library.dao.IBorrowDAO;
import com.agen.library.dao.IUserDAO;
import com.agen.library.dao.proxy.IBorrowDAOImplProxy;
import com.agen.library.dao.proxy.IUserDAOImplProxy;

/**
 * ����������
 * 
 * @author Administrator
 * 
 */

public class DAOFactory {
	
	public static IBorrowDAO getIBorrowDAOInstance() {
		//������Ϣ��������
		return new IBorrowDAOImplProxy();
	}

	public static IUserDAO getIUserDAOInstance() {
		//�û���Ϣ��������
		return new IUserDAOImplProxy();
	}

}
