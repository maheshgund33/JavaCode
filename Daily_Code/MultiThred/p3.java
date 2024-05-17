//by using Runnable Interface


class ChildThread implements Runnable{

	public void run(){

		System.out.println("Child Thread name "+Thread.currentThread().getName());
	}
}

class ThreadDemo{

	public static void main(String args[]){

		ChildThread obj=new ChildThread();

		Thread t=new Thread(obj);
		t.start();

	//	t.start();     IllegalThreadStateException

		System.out.println("Thread name "+Thread.currentThread().getName());
	}
}
