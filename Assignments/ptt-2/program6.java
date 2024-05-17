/*	1   4   9
 *	16  25  36
 *	49  64  81
 */
class pt6{

        public static void main(String args[]){
                int count=0;
		int x=1;
                for(int i=1;i<=3;i++){
                        if(count==3){
                                break;
                        }else{
                                System.out.print(x*x+"\t");
				x++;
                                if(i==3){
                                        i=0;
                                        count++;
                                        System.out.println();
                                }
                        }
                }
        }
}

