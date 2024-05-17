class switchdemo{

	public static void main(String args[]){
		System.out.println("Before switch");
		int x=3;
		int a=1;
		int b=2;
		switch(x){
			case a:
				System.out.println("One");
				break;
			case b:
				System.out.println("Two");
				break;
			case a+b:
				System.out.println("Three");
				break;
			case 4:
				System.out.println("Four");
				break;
			case 5:
				System.out.println("Five");
				break;
			default:
				System.out.println("Not match");
				break;
		}
		System.out.println("After Switch");
	}
}
