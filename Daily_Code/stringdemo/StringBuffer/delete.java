//method:public StringBuffer delete(int start,int end);

class DeleteSb{

	public static void main(String args[]){

		StringBuffer sb=new StringBuffer("Core2web");

		sb.delete(2,7);

		System.out.println(sb); //Cob
	}
}
