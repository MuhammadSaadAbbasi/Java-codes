package saad;

public class Thread3 extends Thread{
	public void run() {
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println(Thread.currentThread().getName() + " with priority " + Thread.currentThread().getPriority());
			if(i %7==0) {
            	try {
            	Thread.sleep(2000);}
            	catch(InterruptedException e) {
            		System.out.println(e.getMessage());
            	}
            }
		}

	}

}
