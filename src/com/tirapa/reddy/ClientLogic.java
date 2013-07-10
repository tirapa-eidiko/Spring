
package com.tirapa.reddy;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class ClientLogic {
	
	public static void main(String[] args)throws Exception
	{
		Resource res = new ClassPathResource("spconfig.xml");
		BeanFactory factory = new XmlBeanFactory(res);
		
		Object o = factory.getBean("id2");
		MailLogic ml = (MailLogic)o;
		
		ml.sendM("tondaputirapareddy@gmail.com","tirapareddy.tondapu@eidiko.com","MySubject","This is body");
				
	}

}
