/*	14  15  16  17
 *	15  16  17  18
 *	16  17  18  19
 *	17  18  19  20
 */
class pt3{

        public static void main(String args[]){
                int count=0;
		int x=13;
                for(int i=1;i<=4;i++){
                        if(count==4){
                                break;
                        }else{
                                System.out.print(x+i+"\t");
                                if(i==4){
                                        i=0;
                                        count++;
					x=13+count;
                                        System.out.println();
                                }
                        }
                }
        }
}

