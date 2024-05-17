/*	1A  1A  1A
 *	1A  1A  1A
 *	1A  1A  1A
 */

class pt3{

        public static void main(String args[]){
                int count=0;
                for(int i=1;i<=3;i++){
                        if(count==3){
                                break;
                        }else{
                                System.out.print("1A"+"\t");
                                if(i==3){
                                        i=0;
                                        count++;
                                        System.out.println();
                                }
                        }
                }
        }
}

