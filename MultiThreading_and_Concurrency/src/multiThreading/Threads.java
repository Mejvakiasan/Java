package multiThreading;

public class Threads extends Thread {
	public void run() {
		System.out.println("Thread");
	}


	public static void main(String[] args) {
		Threads t1 = new Threads();
		Threads t2 = new Threads();
		t1.start();
		t2.start();

	}

}
