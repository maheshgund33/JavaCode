
class ChildThread extends Thread{

	public void run(){
		Thread t= new Thread();
		System.out.println("Child Thread name "+Thread.currentThread().getName());
		System.out.println(t.getPriority());
	}
}

class ThreadDemo{

	public static void main(String args[]){

//		ChildThread obj=new ChildThread();

		Thread t=new Thread();
		System.out.println(t);
/*		System.out.println(t.getPriority());

		System.out.println("Thread name "+Thread.currentThread().getName());

		obj.start();

		t.setPriority(7);
//		t.setPriority(11);  //IllegalArgumentException

		ChildThread obj1=new ChildThread();
		obj1.start();*/
	}
}
