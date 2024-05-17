//INterpted.java:8: error: unreported exception InterruptedException; must be caught or declared to be thrown
//			Thread.sleep(1000);

class Demo{

	public static void main(String [] args){

		for(int i=0;i<=10;i++){

			System.out.println(i);
			Thread.sleep(1000);
		}
	}

}
