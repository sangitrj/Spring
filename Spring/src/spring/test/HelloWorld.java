package spring.test;
import gvjava.org.json.JSONException;
import gvjava.org.json.JSONObject;
import spring.bean.Employee;  

public class HelloWorld {  
	public static void main(String[] args) throws JSONException {
		Employee employee = new Employee();
		employee.setEId("123");
		employee.setEname("sangit");
		
		Employee employee1 = new Employee();
		employee1.setEId("123");
		employee1.setEname("sangit");
		
		JSONObject jsonObject = new JSONObject(employee);
		JSONObject jsonObject1 = new JSONObject(employee1);
		System.out.println(jsonObject.toString());
		System.out.println(jsonObject.put("emp", jsonObject1));
		
		
		/*Resource resource=new ClassPathResource("spring/config/applicationContext.xml");  
		
		BeanFactory factory=new XmlBeanFactory(resource);  

		Employee employee=(Employee)factory.getBean("employeebean");  
		System.out.println(employee.getEname());*/
	}  
}  