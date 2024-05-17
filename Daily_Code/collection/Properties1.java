import java.util.*;
import java.io.*;

class PropertiseDemo{

	public static void main(String [] args) throws IOException{

		Properties obj=new Properties();

		FileInputStream fobj=new FileInputStream("friends.properties");
		obj.load(fobj);
		String name=obj.getProperty("Omkar");
		System.out.println(name);
		obj.setProperty("Tejas","Infosys");
		FileOutputStream outobj=new FileOutputStream("friends.properties");
		obj.store(outobj,"Updated by omkar");
	}
}
		
