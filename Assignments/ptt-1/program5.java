/*	12  12  12
 *	11  11  11
 *	10  10  10
 */

class pt5{

        public static void main(String args[]){
                int count=0;
		int x=12;
                for(int i=1;i<=3;i++){
                        if(count==3){
                                break;
                        }else{
                                System.out.print(x+"\t");
                                if(i==3){
                                        i=0;
                                        count++;
					x--;
                                        System.out.println();
                                }
                        }
                }
        }
}

