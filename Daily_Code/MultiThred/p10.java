//Thread pool by using Runnable
//
import java.util.concurrent.*;

class Mythread implements Runnable{
	int num=0;
	Mythread(int num){
		this.num=num;
	}
	public void run(){
		System.out.println(Thread.currentThread()+"Start thread-"+num);
		dailyTask();
		System.out.println(Thread.currentThread()+"End Thread"+num);
	}
	void dailyTask(){
		try{
			Thread.sleep(5000);
		}catch(InterruptedException obj){
		//	System.out.println(obj.toString());
		}
	}

	
}
class ThreadPoolDemo{

	public static void main(String [] args){
		ExecutorService ser=Executors.newFixedThreadPool(3);

		for(int i=1;i<=6;i++){
			Mythread obj=new Mythread(i);
			ser.execute(obj);
		}
		ser.shutdown();
		
		ExecutorService ser1=Executors.newFixedThreadPool(3);

		for(int i=1;i<=6;i++){
			Mythread obj=new Mythread(i);
			ser1.execute(obj);
		}
		ser1.shutdown();
	}
}
