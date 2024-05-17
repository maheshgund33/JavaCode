class switchdemo{

	public static void main(String args[]){
		System.out.println("Before switch");
		String str="Mon";
		switch(str){
			case "Mon":
				System.out.println("Monday");
				break;
			case "Tue":
				System.out.println("Tuesday");
				break;
			default:
				System.out.println("Not match");
				break;
		}
		System.out.println("After Switch");
	}
}
