

/* write a java program that checks day number(1-7) and print the corresponding day of week */
class program8{

        public static void main(String args[]){
                int x=-6;

                if(x>7 || x<1){
                        System.out.println("Invalid days");
                }else if(x==1){
                        System.out.println("Monday");
                }else if(x==2){
                        System.out.println("Tuesday");
                }else if(x==3){
                        System.out.println("Wednesday");
                }else if(x==4){
                        System.out.println("Thersday");
                }else if(x==5){
                        System.out.println("Friday");
                }else if(x==6){
                        System.out.println("Saterday");
                }else{
			System.out.println("Sunday");
		}
        }
}


