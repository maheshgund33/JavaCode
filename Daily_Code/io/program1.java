import java.util.Scanner;
class inputdemo{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Name: ");
		String name=sc.next();
	        System.out.println("Name: "+name);	
		
		System.out.println("Enter Age: ");
		int age=sc.nextInt();
	        System.out.println("Age: "+age);	
		
		System.out.println("Enter sal: ");
		float sal=sc.nextFloat();
	        System.out.println("sal: "+sal);	
		
		System.out.println("Enter Div: ");
		char ch=sc.next().charAt(0);
	        System.out.println("Div: "+ch);
	}
}
