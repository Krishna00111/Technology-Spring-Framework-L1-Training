
public class DrawingApp {
	
//	public static void main(String[] args) {
//		//Triangle triangle = new Triangle();
//		//Beanfactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
//		ApplicationContext context = new ClassPathXmlApplication("spring.xml");
//		Triangle triangle = (Triangle) context.getBean("triangle");
//		triangle.draw();
	
	
	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		context.registerShutdownHook();
		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		context.registerShutdownHook();
		Shape shape = (Shape).getBean("circle");
		shape.draw();
	}

}
