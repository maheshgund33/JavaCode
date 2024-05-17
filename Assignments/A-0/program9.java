

/* write a java program to accept three numbers and chexk they are pythagorean triplets or not  */
class program9{

        public static void main(String args[]){
                int x=3;
		int y=4;
		int z=5;

                if((x*x+y*y==z*z) || (y*y+z*z==x*x) || (x*x + z*z == y*y)){
                        System.out.println("Its pythagorean triplet" );
                }else{
                        System.out.println("Its not a pythagorean triplet");
                }

        }
}


