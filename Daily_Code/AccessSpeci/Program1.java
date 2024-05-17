
class Village{
	String name="Kakanewadi";
	int NoOfWards=7;
	static String MLA="Nileshji Lanke";

	void Voting(){

		System.out.println("Name Of Village:"+name);
		System.out.println("No Of Wards:"+NoOfWards);
		System.out.println("Name Of MLA:"+MLA);
	}
}

class Vidhansabha{

	public static void main(String []args){

		Village v1=new Village();
		Village v2=new Village();

		v1.Voting();
		v2.Voting();

		System.out.println("After New voting");
		v2.NoOfWards=12;
		v2.name="Takali Dhokeshwar";
		v2.MLA="Vijubhauji Auti";
		
		v1.Voting();
		v2.Voting();
	}
}








