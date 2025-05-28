package saad;

public class Thread2 extends Thread{
	public void run() {
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println(Thread.currentThread().getName() + " with priority " + Thread.currentThread().getPriority());
		if(i %3==0) {
        	try {
        	Thread.sleep(2000);}
        	catch(InterruptedException e) {
        		System.out.println(e.getMessage());
        	}
        }
		}

	}

}
