package helloapp;

public class Student extends University implements i_Info  {
// Begin Class

	private String f_name = null, l_name = null, asset = null;
	private e_Gender type;
	
	public Student () { // Constructor
		System.out.print("\n Constr.default (1) : \n\n");
	}
	
	

	public Student (String fname, String lname, e_Gender type) {
		this(); // calling default Constructor
		this.f_name = fname;
		this.l_name = lname;
		this.type = type;
		System.out.print("\n Constr 2 \n\n");
	}
	
	public void dis () {
		System.out.print(f_name + " " + l_name + " : " + type +"\n\n\n");
	}

	public Student (String fname, String lname, e_Gender type, String asset) {
		this(fname,lname,type);
		this.asset = asset;
		System.out.print("\n Constr 3 \n");
	}
	
	public void disp () {
		System.out.print(f_name + " " + l_name + " : " + type +"\t"+ asset);
	}
	
	public void getname () {
		System.out.println("University");
	}

// End Class
}
