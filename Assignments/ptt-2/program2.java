/*	4  4  4  4
 *	5  5  5  5
 *	6  6  6  6
 *	7  7  7  7
 */
class pt2{

        public static void main(String args[]){
                int count=0;
		int x=4;
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

