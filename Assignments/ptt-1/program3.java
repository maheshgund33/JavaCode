/*	14  14  14  14
 *	15  15  15  15
 *	16  16  16  16
 *	17  17  17  17
 */

class pt3{

        public static void main(String args[]){
                int count=0;
		int x=14;
                for(int i=1;i<=4;i++){
                        if(count==4){
                                break;
                        }else{
                                System.out.print(x+"\t");
                                if(i==4){
                                        i=0;
					x++;
                                        count++;
                                        System.out.println();
                                }
                        }
                }
        }
}

