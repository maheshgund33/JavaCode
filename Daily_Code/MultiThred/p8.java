//interupt() method;

class Mythread extends Thread{

	Mythread(ThreadGroup tg,String str){
		super(tg,str);
	}
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

		Mythread obj=new Mythread(pthreadgp,"maha");
		Mythread obj1=new Mythread(pthreadgp,"Goa");
		obj.start();
		obj1.start();
		
		ThreadGroup cthreadgp=new ThreadGroup(pthreadgp,"pakistan");

		Mythread obj2=new Mythread(cthreadgp,"Karachi");
		Mythread obj3=new Mythread(cthreadgp,"Lahore");
		obj2.start();
		obj3.start();
		
		ThreadGroup cthreadgp2=new ThreadGroup("Bangladesh");

		Mythread obj4=new Mythread(cthreadgp2,"Dhaka");
		Mythread obj5=new Mythread(cthreadgp2,"Mirpur");
		obj4.start();
		obj5.start();

		cthreadgp.interrupt();
		System.out.println(pthreadgp.activeCount());
		System.out.println(pthreadgp.activeGroupCount());
	}
}




		
