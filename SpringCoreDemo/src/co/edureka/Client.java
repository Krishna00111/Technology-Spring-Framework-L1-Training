package co.edureka;

public class Client {

	public static void main(String[] args) {
		// Object Construction | Done by Developer
		
//		Employee eRef = new Employee();
//		eRef.setEid(101);
//		eRef.setEname("John Watson");
//		eRef.setEaddress("Redwood Shores");
//		
//		System.out.println("Employee Details: "+eRef);
		
		// Spring Way | IOC (Inversion of Control)
//		Resource resource = new ClassPathResource("employeebean.xml");
//		BeanFactory factory = new XmlBeanFactory(resource); // Spring Container which shall parse XML File and construct the objects
//		
		ApplicationContext context = new ClassPathXmlApplicationContext("employeebean.xml");
		
		
//		Employee e1 = (Employee)factory.getBean("emp1");
//		Employee e2 = factory.getBean("emp2",Employee.class);
//		
		
		Employee e1 = (Employee)context.getBean("emp1");
		//Employee e2 = context.getBean("emp2",Employee.class);
		
		System.out.println("Employee1 Details: "+e1);
		//System.out.println("Employee2 Details: "+e2);*/
		
		ClassPathXmlApplicationContext cxt = (ClassPathXmlApplicationContext)context;
		cxt.close(); //Close the Context

	}

}
