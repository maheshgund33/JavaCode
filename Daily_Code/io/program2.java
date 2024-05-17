import java.io.InputStreamReader;
import java.io.IOException;

class BufferDemo{

	public static void main(String args[])throws IOException{

		InputStreamReader isr= new InputStreamReader(System.in);
		
		System.out.println("Enter Char : ");
		char ch=(char)isr.read();

		System.out.println("Char Is: "+ch);
		isr.close();
		
		System.out.println("Enter Char : ");
		char ch1=(char)isr.read();

		System.out.println("Char Is: "+ch1);
		
		System.out.println("Enter Char : ");
		char ch2=(char)isr.read();

		System.out.println("Char Is: "+ch2);
		
	}
}
