
/**
 * 
 * This program creates 50 threads and set them to sleep state. These are non-daemon threads so even after the
 * main thread terminates these threads do not die.
 *
 */

public class ThreadLeak {

	public static void main(String[] args) {


		for(int i =0;i<50;i++) {
			Thread t = new Thread(new Runnable() {
				
				@Override
				public void run() {
					while(true) {
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					
				}
			});
			//t.setDaemon(true);
			t.start();
		}

		
		System.out.println("Finished processing");
		System.out.println("Main thread exiting");
	}

}
