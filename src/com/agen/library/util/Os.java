package com.agen.library.util;

/**
 * @author RockAgen
 *
 */
public class Os {
	/**
	 * @param args
	 * @return 
	 */
	public static String getStatus() {
		//��ȡϵͳ��Ϣ
		String status="Java ����ʱ�����汾: "+System.getProperty("java.version")+"\n"+"Java ����ʱ������Ӧ��: "+System.getProperty("java.vendor")+"\n"+
	       "Java ����ʱ������Ӧ��: "+System.getProperty("java.vendor")+"\n"+"Java ��Ӧ�̵� URL: "+System.getProperty("java.vendor.url")+"\n"+
	       "Java ������淶�汾:"+System.getProperty("java.vm.specification.version")+"\n"+"Java ��·��:"+System.getProperty("java.class.path")+
	       "\n"+"����ϵͳ������:  "+System.getProperty("os.name")+"\n"+"����ϵͳ�ļܹ�:  "+System.getProperty("os.arch")+"\n"+
	       "����ϵͳ�İ汾:  "+System.getProperty("os.version")+"\n"+"�û����˻�����:  "+System.getProperty("user.name")+"\n"+
	       "�û���ǰ����Ŀ¼ :"+System.getProperty("user.dir");
	   return status;
		}


}
