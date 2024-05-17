//method :public StringBuffer reverse();

class ReverseSB{

	public static void main(String args[]){
		String str="Omkar";
		char arr[]=str.toCharArray();

		int start=0;
		int end=arr.length-1;
		while(start <= end){
			char temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		System.out.println(arr);
	}
}
