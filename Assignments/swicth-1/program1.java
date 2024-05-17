/*
Write a program in which students should enter marks of 5 different subjects. If all subject having above passing marks add them and provide to switch case to print grades (first class second class), if student get fail in any subject program should print "You failed in exam
*/

import java.io.*;

class switch_demo{

	public static void main(String args[])throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int percent=0;
		int sum=0;	
		int flag=0;
		for(int i=0;i<5;i++){
			System.out.println("Enter Marks outof 100: ");
		
			int marks=Integer.parseInt(br.readLine());

			System.out.println("Marks is : "+marks);
			if(marks>=35){
				sum=sum+marks;
			}else{
				flag=1;
				System.out.println("You failed in exam");
				break;
			}

		}
		if(flag==0){
			percent=(sum/5);
			System.out.println("sum"+sum);
			System.out.println("percentage"+percent);

			switch(percent/10){
			
				case 10:
					System.out.println("First class");
					break;
				case 9:
					System.out.println("First class");
					break;
		
				case 8:
					System.out.println("First class");
					break;
				case 7:
					System.out.println("First class");
					break;
				case 6:
					System.out.println("Second class");
					break;
			
				case 5:
					System.out.println("pass");
					break;
				case 4:
					System.out.println("Pass");
					break;
				case 3:
					System.out.println("pass");
					break;
				default:
					System.out.println("Fail");
					break;
			}
		}

	}
}

