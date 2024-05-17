import java.io.*;

class BufferDemo{

	public static void main(String args[])throws IOException{

		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Name: ");
	        String name=br.readLine();

		System.out.println("Name : "+name);
		
		System.out.println("Enter Age: ");
		int age=Integer.parseInt(br.readLine());
	        System.out.println("Age: "+age);	
		
		System.out.println("Enter sal: ");
		float sal=Float.parseFloat(br.readLine());
	        System.out.println("sal: "+sal);	
		
		System.out.println("Enter Div: ");
		char ch=(char)br.read();
	        System.out.println("Div: "+ch);	
	}
}
