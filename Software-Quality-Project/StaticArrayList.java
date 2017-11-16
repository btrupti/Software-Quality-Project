import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class StaticArrayList {

	   public static void main(String[] args) throws InterruptedException {
			          
		   new StaticArrayList().withMemoryLeak();
	
		}
	  
	private Random random = new Random();
	public static ArrayList<Double> list = new ArrayList<Double>(1000000);

	public void withMemoryLeak() throws InterruptedException {
		Scanner read = new Scanner(System.in);
	    int num = read.nextInt();
	    for (int i = 0; i < num; i++) {
	        list.add(random.nextDouble());
	    }
	    
	    	System.gc();
	    	Thread.sleep(10000); // to allow GC do its job
	    	read.nextInt();
	    	read.close();
	}
}
