
public class Circle implements Shape {
	
	private Point center;
	
	@Override
	public void draw() {
		System.out.println("Drawing Circle");
		System.out.println("Circle: Point is: (" + center.getX() + ", "+ center.getY() + ")");
	}
	
	public Point getCenter() {
		return center;
	}
	
	@Autowired
	@Qualifier("circleRelated")
	
	@Required
	public void setCenter(Point center) {
		this.center = center; 
	}
	
	@PostConstruct
	public void InitializeCircle() {
		System.out.println("Init of Circle");
	}
	
	@PreDestroy
	public void destroyCircle() {
		System.out.println("Destroy of Circle");
	}

}
