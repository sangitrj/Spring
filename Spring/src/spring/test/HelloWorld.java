package spring.test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import spring.bean.Employee;  

public class HelloWorld {  
	public static void main(String[] args) {  
		Resource resource=new ClassPathResource("spring/config/applicationContext.xml");  
		BeanFactory factory=new XmlBeanFactory(resource);  

		Employee employee=(Employee)factory.getBean("employeebean");  
		System.out.println(employee.getEname());
	}  
}  