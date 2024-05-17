//Anagram String

import java.io.*;

class AnagramString{

	boolean anagramstr(String str1,String str2){

		char arr1[]=str1.toCharArray();
		char arr2[]=str2.toCharArray();

		if(arr1.length != arr2.length){
			return false;
		}else{

			for(int i=0;i<arr1.length;i++){
				char ch=arr1[i];
				int count1=0;
				int count2=0;
				for(int j=0;j<arr1.length;j++){
					if(ch==arr1[j]){
						count1++;
					}
					if(ch==arr2[j]){
						count2++;
					}
				}
				if(count1 != count2){
					return false;
				}
			}
			return true;
		}
	}
	
	public static void main(String args[])throws IOException{

		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter String 1:");
		String str1=br.readLine();
		
		System.out.println("Enter String 2:");
		String str2=br.readLine();
		
		AnagramString obj=new AnagramString();
		boolean val=obj.anagramstr(str1,str2);

		if(val==true){
			System.out.println("Anagram String");
		}else{
			System.out.println("Is not Anagram String");
		}
	}
}

