
class Mythread extends Thread {
       	Mythread(String str){
		super(str);
        }
	Mythread(){
	
	}		
        public void run(){
		System.out.println(Thread.currentThread().getName());
        }
}

class ThreadDemo2{
	public static void main(String [] args){
		Mythread obj= new Mythread("Omkar");
                obj.start();

                Mythread obj1= new Mythread("Omkar");
                obj1.start();

		Mythread obj2=new Mythread();
		obj2.start();
	}	
}

