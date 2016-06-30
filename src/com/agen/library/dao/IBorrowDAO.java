package com.agen.library.dao;

import java.util.List;
/**
 * ������Ϣ�����ӿ�
 */
import com.agen.library.vo.Receive;
import com.agen.library.vo.Send;

public interface IBorrowDAO {
	/**
	 * ���ݿ�����Ӳ���
	 * @param book
	 * @return
	 * @throws Exception
	 */
	public boolean doCreate(Receive borrow)throws Exception;
	/**
	 * ���ݿ�ĸ��²���
	 * @param book
	 * @return
	 * @throws Exception
	 */
	
	//public boolean doUpdate(Receive borrow)throws Exception;
	/**
	 * ���ݿ��ɾ������
	 * @param user
	 * @return
	 * @throws Exception
	 */
	//public boolean doDelete(int id)throws Exception;
	/**
	 * ���ݿ�Ĳ��Ҳ���(��id����)
	 * @param id
	 * @return
	 * @throws Exception
	 */
	//public Receive findById(String id)throws Exception;
	//����ʱ�õ�
	//public Receive findById(int id) throws Exception; 
	/**
	 * ���ݿ�Ĳ��Ҳ���(���ؼ��ֲ���)
	 * @param keyword
	 * @return
	 * @throws Exception
	 */
	//public List<Receive> findAll(String keyword)throws Exception;
	
	
	public boolean doSend(Send send) throws Exception;
}
