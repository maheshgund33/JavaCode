//ThreadGroup

class Mythread extends Thread{
	Mythread(ThreadGroup tg,String str){
		super(tg,str);
	}
	public void run(){

		System.out.println(Thread.currentThread());
	}
}

class ThreadGroupDemo{

	public static void main(String [] args){

		ThreadGroup pthreadgp=new ThreadGroup("Core2Web");

		Mythread obj1=new Mythread(pthreadgp,"C");
		obj1.start();
		
		Mythread obj2=new Mythread(pthreadgp,"C++");
		obj2.start();
		
		Mythread obj3=new Mythread(pthreadgp,"java");
		obj3.start();

		//child THreadGroup

		ThreadGroup cthreadgp=new ThreadGroup(pthreadgp,"Incubator");

		Mythread obj4=new Mythread(cthreadgp,"Flutter");
		obj4.start();
		
		Mythread obj5=new Mythread(cthreadgp,"React");
		obj5.start();
		
		Mythread obj6=new Mythread(cthreadgp,"SpringBoot");
		obj6.start();
	}
}
