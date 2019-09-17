package dropwizard;



public class Employee {
	
	
	
	private int id;
	private String name;
	private long num;
	
	Employee()
	{
		
	}
	
	public Employee(int i, String name, int phn) {
		this.id = i;
		this.name = name;
		this.num = phn;
	}
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}

	public long getNum() {
		return num;
	}

	

}

