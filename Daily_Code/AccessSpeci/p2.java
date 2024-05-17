
class Core2Web{
	int numcour=4;
	private String favCourse="C";

	void display(){
		System.out.println(numcour);
		System.out.println(favCourse);
	}

}

class Student{
	
	public static void main(String args []){

		Core2Web obj=new Core2Web();
		obj.display();

		System.out.println(obj.numcour);
		System.out.println(obj.favCourse);  //erroe;(compile time)favcourse has private access  in core2web
	}
}
