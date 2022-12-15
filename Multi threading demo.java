# java
package javaPrograms;
class Test1 extends Thread{
	public void run()  {
		for(int i=0;i<5;i++) {
			System.out.println("Thread 1.....");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class Test2 implements Runnable{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Thread 2.....");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}

public class MultiThreadDemo1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Thread t1=new Thread(new Test2());
		new Test1().start();
		t1.start();
		System.out.println("Main Thread.....");
	

	}

}
