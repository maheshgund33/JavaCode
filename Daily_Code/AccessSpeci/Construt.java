

class DEmoConstructor{

	int x=10;

	DEmoConstructor(){    //DEmoConstructor(DEmoConstructor this)

		System.out.println("No-args Constructor");

	}
	DEmoConstructor(int a,float b){   //DEmoConstructor(DEmoConstructor this,int a,float b)

		System.out.println("para Constructor");
		System.out.println(this.x);
		System.out.println(a);
		System.out.println(b);

	}
	DEmoConstructor(DEmoConstructor xyz){

		System.out.println("para Constructor");

	}

	public static void main(String args[]){

		DEmoConstructor obj1=new DEmoConstructor();  //DEmoConstructor(obj1)
	//	DEmoConstructor obj2=new DEmoConstructor(10); //DEmoConstructor (obj2,10)
		DEmoConstructor obj3=new DEmoConstructor(10,20);
		DEmoConstructor obj5=new DEmoConstructor(10,20);
		DEmoConstructor obj4=new DEmoConstructor(obj1);//DEmoConstructor(obj4,obj1)
	
	}
}

