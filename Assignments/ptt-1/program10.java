/*	1  2  3  4  
 *	2  3  4  5
 *	3  4  5  6
 *	4  5  6  7
 */
class pt10{

        public static void main(String args[]){
                int count=0;
		int x=0;
                for(int i=1;i<=4;i++){
                        if(count==4){
                                break;
                        }else{
                                System.out.print(i+x+"\t");
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

