

/* write a java program to find a maximum between three numbers */
class program6{

        public static void main(String args[]){
                int x=42;
		int y=32;
		int z=42;

                if(x>=y && x>=z){
                        System.out.println(x+" is grater" );
                }else if(y>=x && y>=z){
                        System.out.println(y + " is grater");
                }else{
                        System.out.println(z+"is grater");
                }

        }
}


