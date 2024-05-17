/*	1A  2B  3C
 *	1A  2B  3C
 *	1A  2B  3C
 */
class pt4{

        public static void main(String args[]){
                int count=0;
		char ch='A';
                for(int i=1;i<=3;i++){
                        if(count==3){
                                break;
                        }else{
				System.out.print(i);
                                System.out.print(ch++ +"\t");
                                if(i==3){
                                        i=0;
                                        count++;
					ch='A';
                                        System.out.println();
                                }
                        }
                }
        }
}

