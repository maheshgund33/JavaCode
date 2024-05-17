//palindrome String

import java.io.*;

class Palindrome{

	static boolean palindrome(String str){

		char arr[]=str.toCharArray();
		int end=arr.length-1;
		int start=0;

		while(start <= end){
			if(arr[start]!=arr[end]){
				return false;
			}
			start++;
			end--;
		}
		return true;
	}


	public static void main(String args[])throws IOException{

		BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter String:");
		String str1=obj.readLine();

		boolean val=palindrome(str1);

		if(val==true){

			System.out.println("Is Palindrome String");
		}else{
			System.out.println("Is not palindrome String");
		}
	}
}
