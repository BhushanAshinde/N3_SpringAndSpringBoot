package org.tnsif.autowireannotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Executor {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext c=new ClassPathXmlApplicationContext("web.xml");
		Remote r=c.getBean("remote",Remote.class);
		r.remote();
	}

}
