package helloapp;

public class MyThread extends Thread {
// Begin Class

  public MyThread () {} // Constructor
	
	public void run () {
	// Begin run()
		
		int x = 1;

		while (x <= 5) {

			System.out.print("\t " + x);
			x++;
			
			try {
				Thread.sleep(1000);
			}
			catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
	// End run()
	}
	
// End Class
}
