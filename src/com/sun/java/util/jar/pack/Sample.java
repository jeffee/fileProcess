package com.sun.java.util.jar.pack;
/**
 * Java�����ڶ����а������Ͳ��������ֶ��屻��Ϊ����
 * ��Ϊ���Ͳ��������ͱ���Ϊһ�������ͣ�����Ϊint��double��char�����Ļ�������
 * ���Զ�������Ͳ������࣬���Ͳ����������ඨ��ͷ��������ļ������С�
 * ���ڹ�����ͷ�����������Ͳ���
 * 
 * */


public class Sample<T> {
	private T data;
	public Sample(){	//������ͷ������Ҫ�ټ������а������Ͳ���
		data = null;
	}
	public void setData(T newvalueT){
		data = newvalueT;
	}
	public T getData(){
		return data;
	}
}
