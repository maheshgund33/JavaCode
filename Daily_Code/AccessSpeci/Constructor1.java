
class Core2web{

	Core2web(){
		System.out.println("In Constructor");
	}

	int x=10;
	public static void main(String [] args){
		System.out.println("In main");

		Core2web obj=new Core2web();

		System.out.println(obj.x);
		System.out.println(obj.y);
	}
	int y=20;
}

/*o/p:
 * In main
 * In constructor
 * 10
 * 20
 
 */
