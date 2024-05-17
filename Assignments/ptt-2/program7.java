/*	1   2   9
 *	4   25  6
 *	49  8   81
 */
class pt7{

        public static void main(String args[]){
                int count=0;
		int x=1;
                for(int i=1;i<=3;i++){
                        if(count==3){
                                break;
                        }else{
				if(x%2==1)
                                	System.out.print(x*x+"\t");
				else
					System.out.print(x+"\t");
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

