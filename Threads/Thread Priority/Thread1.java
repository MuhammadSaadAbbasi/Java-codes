package saad;

public class Thread1 extends Thread{
	public void run() {
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println(Thread.currentThread().getName() + " with priority " + Thread.currentThread().getPriority());
            if(i %2==0) {
            	try {
            	Thread.sleep(2000);}
            	catch(InterruptedException e) {
            		System.out.println(e.getMessage());
            	}
            }
		}
	}

}
