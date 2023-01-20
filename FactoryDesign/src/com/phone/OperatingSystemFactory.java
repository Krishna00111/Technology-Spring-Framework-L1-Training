package com.phone;

public class OperatingSystemFactory {
	
	public OS getIntance(String str) 
	{
		if(str.equals("Open"))
			return new Android();
		else if(str.equals("Closed))"
			return new IOS();
		else
			return new Windows();
				
	}

}
