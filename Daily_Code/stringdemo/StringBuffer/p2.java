class StringBuffDemo{

	public static void main(String args[]){

		StringBuffer sb=new StringBuffer(100);

		sb.append("Omkar");
		sb.append("Walunj");

		System.out.println(sb.capacity());//100
		System.out.println(sb);//OmkarWalunj
		sb.append("Comp");
		System.out.println(sb);//OmkarWalunjComp
	}
}

