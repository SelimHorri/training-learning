package helloapp;

import java.sql.Connection;
import java.sql.DriverManager;
// import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ConnDB {
// Begin Class

	protected Connection connect = null;
	protected Statement statement = null;
	// protected PreparedStatement prep = null;
	protected ResultSet res = null;
	
	Scanner jin = new Scanner(System.in);
	
	protected int choice;
	protected boolean verif = false;

	public ConnDB () { // Constructor
	
		System.out.print("----------------------WELCOME TO 'PERSON_DB' DATABASE----------------------\n\n\n");
		
		do {
		
			System.out.print("\nChoose kind of your Query :\n");
			System.out.print("\n 1> Print Database 2> Add Information(s) 3> Update Information(s) 4> Delete Information(s) \n");
			System.out.print("\n\n \t\t\t\t >|");
			choice = jin.nextInt();
		
		} while ( (choice!=1) && (choice!=2) && (choice!=3) && (choice!=4) );
			
	}
	
// ************************************************config() method*****************************************************************************
	
	protected void config () {
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			connect = DriverManager.getConnection("jdbc:mysql://localhost/person_DB?user=Reese&password=Dashwood");
			statement = connect.createStatement();
			
		}
		catch (Exception e) {
			
			e.printStackTrace();
			System.out.print("\n Wrong connection in method config() \n");
			
		}
		
	}
	
// *********************************************selectQuery() method***************************************************************************
	
	protected final void selectQuery () {
		
		try {
			
			int id = 0;
			String fname = null;
			String lname = null;
			String email = null;
			
			res = statement.executeQuery("select * from person");
			System.out.print("\n\nReading From person_DB:\n\n");
			while (res.next()) {
				
				id = Integer.parseInt(res.getString("ID"));
				fname = res.getString("f_NAME");
				lname = res.getString("l_NAME");
				email = res.getString("EMAIL");
				System.out.print("  "+ id +" : "+ fname +" "+ lname +" : "+ email +" \n");
				
			}
			
			System.out.println("\n");
			
		}
		catch (SQLException e) {
			
			System.out.print("\n Wrong in method: printQuery() !!!!! \n");
			e.printStackTrace();
		}
		
	}
	
// ***********************************************addQuery() method****************************************************************************
	
	protected void insertQuery () {
		
		try {
			connect.prepareStatement("insert into person (f_NAME,l_NAME,EMAIL) values ('Omar','Derouiche','omarderouiche@gmail.com')").executeUpdate();
		}
		catch (SQLException e) {
			
			System.out.print("\n Wrong in method: addQuery() !!!!! \n");
			e.printStackTrace();
		}
		
	}
	
// *********************************************updateQuery() method***************************************************************************

	protected void updateQuery () {
		
		try {
			connect.prepareStatement("update person set EMAIL='omarderouiche@yahoo.com' where f_NAME='Omar'").executeUpdate();
		}
		catch (SQLException e) {
			
			System.out.print("\n Wrong in method: updateQuery() !!!!! \n");
			e.printStackTrace();
		}
		
	}
	
// ***********************************************delQuery() method****************************************************************************
	
	protected void deleteQuery () {
		
		try {
			connect.prepareStatement("delete from person where f_name='Omar'").executeUpdate();
		}
		catch (SQLException e) {
			
			System.out.print("\n Wrong in method: delQuery() !!!!! \n");
			e.printStackTrace();
		}
		
	}
	
// ***********************************************myQuery() method******************************************************************************
	
	public final void myQuery () {
		
		switch (choice) {
		
		case 1:
			this.config();
			this.selectQuery();
			break;
		case 2:
			this.config();
			this.insertQuery();
			this.selectQuery();
			break;
		case 3:
			this.config();
			this.updateQuery();
			this.selectQuery();
			break;
		case 4:
			this.config();
			this.deleteQuery();
			this.selectQuery();
			break;
		default:
			System.out.print("\n\n\n Error \n");
		
		}
		
	}
	

// End Class
}
