

/* write a java program , in which according to month noo print the no of days in that month */
class program5{

        public static void main(String args[]){
                int x=-6;

                if(x>12 || x<1){
                        System.out.println("Invalid month" );
                }else if(x==1){
                        System.out.println(" Jan has 31 days");
                }else if(x==2){
                        System.out.println("Feb has 28/29 days");
                }else if(x==3){
                        System.out.println("March has 31 days");
                }else if(x==4){
                        System.out.println("April has 30 days");
                }else if(x==5){
                        System.out.println("May has 31 days");
                }else if(x==6){
                        System.out.println("June has 30 days");
                }else if(x==7){
                        System.out.println("July has 31 days");
                }else if(x==8){
                        System.out.println("Aug has 31 days");
                }else if(x==9){
                        System.out.println("Sep has 30 days");
                }else if(x==10){
                        System.out.println("Oct has 31 days");
                }else if(x==11){
                        System.out.println("Nov has 30 days");
                }else {
                        System.out.println("Dec has 31 days");
		}
         
        }
}

