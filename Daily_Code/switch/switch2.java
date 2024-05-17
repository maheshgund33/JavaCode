class switchdemo{

	public static void main(String args[]){
		System.out.println("Before switch");
		int x=3;
		switch(x){
			case 1:
				System.out.println("One");
				break;
			case 1+1:
				System.out.println("Two");
				break;
			case 1+2:
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
