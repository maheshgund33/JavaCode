/*	9  8  7
 *	9  8  7
 *	9  8  7
 */
class pt6{
	
        public static void main(String args[]){
                int count=0;
		int x=9;
                for(int i=1;i<=3;i++){
                        if(count==3){
                                break;
                        }else{
                                System.out.print(x--+"\t");
                                if(i==3){
                                        i=0;
					x=9;
                                        count++;
                                        System.out.println();
                                }
                        }
                }
        }
}

