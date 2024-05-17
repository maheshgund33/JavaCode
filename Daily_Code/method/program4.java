/* passing argument to function */
import java.io.*;
class Arithmaticdemo{

	void add(int a, int b){

		System.out.println("Add is "+(a+b));
	}
	void sub(int a, int b){

		System.out.println("sub is "+(a-b));
	}
	void mult(int a, int b){

		System.out.println("Mult is "+(a*b));
	}
	void div(int a, int b){

		System.out.println("div is "+(a/b));
	}
	public static void main (String args [])throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a=Integer.parseInt(br.readLine());
		int b=Integer.parseInt(br.readLine());
		
		Arithmaticdemo ar=new Arithmaticdemo();
		ar.add(a,b);
		ar.sub(a,b);
		ar.mult(a,b);
		ar.div(a,b);

	}
}

