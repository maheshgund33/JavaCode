//sleep with setName

class Mythread extends Thread{

	public void run(){
		System.out.println(Thread.currentThread());
	}
}

class ThreadDemo{

	public static void main(String [] args)throws InterruptedException{
		
		System.out.println(Thread.currentThread());

		Mythread obj=new Mythread();
		obj.start();

		Thread.sleep(100);
		Thread.currentThread().setName("Omkar");

		System.out.println(Thread.currentThread());
	}
}



