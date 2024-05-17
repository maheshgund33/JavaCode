//Thread Group by using Runnable

class Mythread implements Runnable{
	public void run(){
		System.out.println(Thread.currentThread());
		try{
			Thread.sleep(5000);
		}catch(InterruptedException obj){
			System.out.println(obj.toString());
		}
	}
}
class ThreadGroupDemo{

	public static void main(String [] args) throws InterruptedException{

		ThreadGroup pthreadgp=new ThreadGroup("India");

		Mythread obj=new Mythread();
		Mythread obj1=new Mythread();
		Thread t1=new Thread(pthreadgp,obj,"maha");
		Thread t2=new Thread(pthreadgp,obj1,"Goa");
		t1.start();
		t2.start();
		
		ThreadGroup cthreadgp=new ThreadGroup(pthreadgp,"pakistan");

		Mythread obj2=new Mythread();
		Mythread obj3=new Mythread();
		
		Thread t3=new Thread(cthreadgp,obj2,"Karachi");
		Thread t4=new Thread(cthreadgp,obj3,"Lahore");
		t3.start();
		t4.start();
	}
}
