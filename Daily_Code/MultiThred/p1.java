//by using thread class


class ChildThread extends Thread{

	public void run(){

		System.out.println("Child Thread name "+Thread.currentThread().getName());
		
		for(int i=0;i<10;i++){

			System.out.println("In Thread-0");
			try{
				Thread.sleep(1000);
			}catch(InterruptedException obj1){

			}
		}
	}
}

class ThreadDemo{

	public static void main(String [] args){

		ChildThread obj=new ChildThread();
		obj.start();
		System.out.println("ThreadDemo Thread name "+Thread.currentThread().getName());
		for(int i=0;i<10;i++){

			System.out.println("In main");
			try{
				Thread.sleep(1000);
			}catch(InterruptedException obj1){

			}
		}
	}
}
