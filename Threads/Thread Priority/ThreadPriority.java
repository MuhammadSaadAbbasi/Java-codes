package saad;

public class ThreadPriority {
	public static void main(String [] args) {
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		Thread3 t3 = new Thread3();
		
		t1.setPriority(1);
		t2.setPriority(5);
		t3.setPriority(10);


		t1.setName("Runner 1");
		t2.setName("Runner 2");
		t3.setName("Runner 3");

		
		t1.start();
		t2.start();
		t3.start();
	}

}
