package com.agen.library.dao;

import java.util.List;
/**
 * �û���Ϣ�����ӿ�
 */
import com.agen.library.vo.User;

public interface IUserDAO {
	/**
	 * ���ݿ�����Ӳ���
	 * @param book
	 * @return
	 * @throws Exception
	 */
	public boolean doCreate(User user)throws Exception;
	/**
	 * ���ݿ�ĸ��²���
	 * @param book
	 * @return
	 * @throws Exception
	 */
	public boolean doUpdate(User user)throws Exception;
	/**
	 * ���ݿ��ɾ������
	 * @param user
	 * @return
	 * @throws Exception
	 */
	public boolean doDelete(String id)throws Exception;
	/**
	 * ���ݿ�Ĳ��Ҳ���(��id����)
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public User findById(String id)throws Exception;
	/**
	 * ���ݿ�Ĳ��Ҳ���(���ؼ��ֲ���)
	 * @param keyword
	 * @return
	 * @throws Exception
	 */
	public User findByIds(String id)throws Exception;
	public List<User> findAll(String keyword)throws Exception;

}
