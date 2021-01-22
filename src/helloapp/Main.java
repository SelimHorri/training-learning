package helloapp;

import java.io.File;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
// Begin Class
	 static Scanner jin = new Scanner(System.in);
	 // private static Scanner jin;
	 
	 
	public static void main (String[] args) {
	// Begin main()
		
		/*
		Department d = new Department();
		  
	  	d.name = "Software Ingineer";
	 	d.s.f_name="John "; d.s.l_name="Reese";
		  
		System.out.print(d.s.f_name); System.out.println(d.s.l_name);
		
		Student s = new Student("John","Reese",e_Gender.male);
		s.dis();
		s.disp();
		
		MyThread th = new MyThread(); th.start();
		*/
		
		/*
		
		String fol[] = new String[5];
		StringBuilder folder = new StringBuilder("C:\\Users\\USER\\Downloads\\");
		String p[] = null;
		
		for (int i=0;i<fol.length;i++) {
			
			try {
				
				System.out.println("Enter the "+ i +" folder you wanna create :");
				fol[i] = jin.nextLine();
				
				fol[i] = fol[i].trim().replaceAll("\\s","");
				
				if ( fol[i] == "" ) {
					
					System.out.println("\n\nPlease retype your folder's name :");
					fol[i] = jin.nextLine();
					
				}
			
			}
			catch (InputMismatchException e) {
				
				e.printStackTrace();
			}
			
			fol[i] = fol[i].concat("\\");
			
			folder.append(fol[i]);
			
		}
		
		File f = new File(folder.toString());
		System.out.print("\n\n\n\t" + f.getAbsolutePath() + "\n\n");
		
		
		f.mkdirs();
		

		p = f.list();
		for (String s : p) {
			System.out.println(s);
		}
		
		jin.close();
		
		*/
		
//		StringTokenizer str1 = new StringTokenizer("My name is slim , ! and you are Mr.Reese");
//		
//		while (str1.hasMoreTokens())
//			//System.out.println(str1.nextToken(","));
//			JOptionPane.showMessageDialog(null,str1.nextToken(","));
		
//		JFileChooser f = new JFileChooser();
//		f.showOpenDialog(null);
		
//		String name = " Enter Username or password .hi my name is :";
//		
//		System.out.println(name.contains("Enter Username or password"));
		
		
//		System.out.println("Enter Email");
//		String email = jin.nextLine();
//		jin.close();
//		
//		System.out.println(Pattern.matches(".*@hotmail.com",email));
		
		String fol[] = new String[5];
		StringBuilder folder = new StringBuilder("C:\\Users\\USER\\Desktop\\");
		String p[] = null;
		
		for (int i=0;i<fol.length;i++) {
			
			try {
				
				System.out.println("Enter the "+ i +" folder you wanna create :");
				fol[i] = jin.nextLine();
				
				fol[i] = fol[i].trim().replaceAll("\\s","");
				
				while (fol[i].isEmpty()) {
					System.out.println("\nPlease retype your folder's name :");
					fol[i] = jin.nextLine();
				}
			
			}
			catch (InputMismatchException e) {
				e.printStackTrace();
			}
			
			fol[i] = fol[i].concat("\\");
			
			folder.append(fol[i]);
			
		}
		
		File f = new File(folder.toString());
		System.out.print("\n\n\n\t" + f.getAbsolutePath() + "\n\n");
		
		f.mkdirs();

		p = f.list();
		for (String s : p)
			System.out.println(s);
		
		jin.close();
		
		
	// End main()
	}
	
// End Class
}
