//method :public StringBuffer reverse();

class ReverseSB{

	public static void main(String args[]){
		String str="Omkar";
		StringBuffer sb=new StringBuffer(str);
		str=sb.reverse().toString();
		System.out.println(str); //rakmO
	}
}
