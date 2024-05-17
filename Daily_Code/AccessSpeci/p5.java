//Static block

import java.io.*;

class StaticBlock{

	int x=10;
	static  int y=20;
	static int z;
	static{
		//z=30;
		int a=40;
		System.out.println("In static Block 1");
		System.out.println(a);
	}
	public static void main(String [] args) throws IOException{

		System.out.println("Main method");

		StaticBlock obj=new StaticBlock();

		System.out.println("instance:"+obj.x);
	//	System.out.println(a);   //error : can not find symbol
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		z=Integer.parseInt(br.readLine());
		System.out.println(z);
	}
	static  {
	
		System.out.println("Static Block 2");
		System.out.println(y);

		System.out.println(z);
		StaticBlock obj=new StaticBlock();

		System.out.println(obj.x);
	}
}
