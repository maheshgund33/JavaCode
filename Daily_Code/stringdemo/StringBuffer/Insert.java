//method: public StringBuffer insert(int offset,String str);

class InsertSB{

	public static void main(String args[]){

		StringBuffer sb=new StringBuffer("ShashiCore2web");
		
		System.out.println(sb); //ShahiCore2web
		sb.insert(6,"Bagal");
		System.out.println(sb); //ShahiBagalCore2web
	}
}


