/*Q2.


Write a program in which ask the user to enter a number from 0 to 5 and print it's spelling, if the entered number is greater than 5 print entered number is greater than 5


e.g


Input -Enter a number - 4 Output-four
*/

import java.io.*;

class switch_demo{

	public static void main (String args[])throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		do{
		System.out.println("Enter Number: ");
		
		int num=Integer.parseInt(br.readLine());

		
		if(num >=0){

			switch(num){
				case 5:
					System.out.println("Five");
					break;
				case 4:
					System.out.println("Four");
					break;
				case 3:
					System.out.println("three");
					break;
				case 2:
					System.out.println("two");
					break;
				case 1:
					System.out.println("one");
					break;

				case 0:
					System.out.println("Zero");
					break;
				default:
					System.out.println("Number is greaterthan 5");
					break;
			}
			break;
		}else{
			System.out.println("Please Enter Greater than equal 0 val");
			
		}
		}while(true);
	}
}
