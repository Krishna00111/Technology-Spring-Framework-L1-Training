package co.edureka;

//Bean or Model or POJO(Plain Old Java Object)
public class Employee {
	
	//Attributes
	int eid;
	String ename;
	Address address;
	
	//Methods
	public Employee() {
		System.out.println("--Employee Object Contructed");
		
		
	}
	//Constructor Injection
	public Employee(Address address) {
		this.address = address;
	}

	public Employee(int eid, String ename, String eaddress) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.eaddress = eaddress;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEaddress() {
		return eaddress;
	}

	public void setEaddress(String eaddress) {
		this.eaddress = eaddress;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", address=" + address + "]";
	}
	
	public void myInit() {
		System.out.println("--Object Initialized--");
	}
	
	public void myDestroy() {
		System.out.println("--Object Destro--");
	}
	

}
