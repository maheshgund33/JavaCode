
class MysubString{

	static String mySubString(int index,String str){
		char arr[]=str.toCharArray();
		int size=arr.length-index+1;
		char arr1[]=new char[size];
		int j=0;
		for(int i=index;i<arr.length;i++){
			arr1[j++]=arr[i];
		}
		String str1=new String(arr1);
		return str1;
	}
	String mySubString(String str,int start,int end){
		char arr[]=str.toCharArray();
                int size=end-start;
                char arr1[]=new char[size];
                int j=0;
                for(int i=start;i<end;i++){
                        arr1[j++]=arr[i];
                }
                String str1=new String(arr1);
                return str1;
	}
	public static void main(String args []){
		String str="Omkar";
		MysubString obj=new MysubString();
		System.out.println(mySubString(3,str));
		System.out.println(obj.mySubString(str,0,3));
	}
}
