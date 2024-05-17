
class Mylength{

	static int mylength(String str){

		char arr[]=str.toCharArray();
		int count=0;
		for(int x:arr){
			count++;
		}
		return count;
	}
	public static void main(String args[]){

		String str="Omkar";
		System.out.println(mylength(str));
	}
}
