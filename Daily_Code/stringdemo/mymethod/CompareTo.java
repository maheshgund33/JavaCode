//mycompareTo

class CompareTo{

	static int mycompareTo(String str1,String str2){
		char arr1[]=str1.toCharArray();
		char arr2[]=str2.toCharArray();

		if(arr1.length != arr2.length){
			int len1=arr1.length;
			int len2=arr2.length;
			for(int i=0;(len1 !=0 && len2!=0);i++){
				if(arr1[i] != arr2[i]){
					return arr1[i]-arr2[i];
				}
				len1--;
				len2--;
			}
			if(arr1.length>arr2.length){
				return arr1.length-arr2.length;
			}else{
				return arr2.length-arr1.length;
			}
		}else{
			for(int i=0;i<arr1.length;i++){

				if(arr1[i] != arr2[i]){
					return arr1[i]-arr2[i];
				}
			}
			return 0;
		}
	}

	public static void main(String args[]){

		String str1="Shashi";
		String str2="Shbshiddd";

		System.out.println(mycompareTo(str1,str2)); //-1
	}
}
