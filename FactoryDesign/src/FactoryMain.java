import com.phone.OS;
import com.phone.Android;


public class FactoryMain {
	
	public static void main(String a[]) {
		
		OperatingSystemFactory osf = new OperatingSystemFactory();
		OS obj = osf.getInstance("lakdjf");
		obj.spec();
	}

}
