package com.java1234.listener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
public class SessionAttributeListener implements HttpSessionAttributeListener {

	@Override
	public void attributeAdded(HttpSessionBindingEvent httpSessionBindingEvent) {
		// TODO Auto-generated method stub
		System.out.println("��ӵ����ԣ�"+httpSessionBindingEvent.getName()+", ֵΪ��"+httpSessionBindingEvent.getValue());
	}

	@Override
	public void attributeRemoved(HttpSessionBindingEvent httpSessionBindingEvent) {
		// TODO Auto-generated method stub
		System.out.println("ɾ�������ԣ�"+httpSessionBindingEvent.getName()+", ֵΪ��"+httpSessionBindingEvent.getValue());
	}

	@Override
	public void attributeReplaced(HttpSessionBindingEvent httpSessionBindingEvent) {
		// TODO Auto-generated method stub
		
	}
	
}
