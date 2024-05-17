import java.io.*;

class BufferDemo{

	public static void main(String args[])throws IOException{

		InputStreamReader irs= new InputStreamReader(System.in);
		BufferedReader br1= new BufferedReader(irs);

		System.out.println("Enter Name: ");
	        String name=br1.readLine();

		System.out.println("Name : "+name);
		br1.close();

		System.out.println("Enter Div: ");
		char ch=(char)irs.read();
	        System.out.println("Div: "+ch);	
	}
}
