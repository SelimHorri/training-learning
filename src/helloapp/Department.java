package helloapp;

public class Department implements i_Info {
// Begin Class

	private String name = "InfoDep";
	
	public Department () {} // Constructor

	@Override
	public void getname() {
		System.out.println("Department's name is : " + name);
	}

	// Student s = new Student(); // Aggregation

// End Class
}
