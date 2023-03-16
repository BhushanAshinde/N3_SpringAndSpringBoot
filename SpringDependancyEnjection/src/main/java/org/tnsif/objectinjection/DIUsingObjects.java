package org.tnsif.objectinjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DIUsingObjects {
	
	public static void main(String[] args) {
		/*BeanFactory f=new ClassPathXmlApplicationContext ("beans.xml");
		SwiftEngine e=f.getBean("swift",SwiftEngine.class);
		System.out.println(e);
		System.out.println(e.cost());
		System.out.println(e.display());*/
		
		BeanFactory f=new ClassPathXmlApplicationContext ("web.xml");
		Cellphone e1=f.getBean("c2",Cellphone.class);
		e1.accept();
	}

}
