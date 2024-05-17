/*	F  5  D  4  B
 *	F  5  D  4  B
	F  5  D  4  B
	F  5  D  4  B
	F  5  D  4  B
	F  5  D  4  B
*/

 class pt10{

        public static void main(String args[]){
                int count=0;
		int x=6;
		char ch='F';
                for(int i=1;i<=6;i++){
                        if(count==6){
                                break;
                        }else{
				if(i %2==0){
                                	System.out.print(x+"\t");
				}else{
					System.out.print(ch+"\t");
				}
				x--;
				ch--;
                                if(i==6){
                                        i=0;
					x=6;
					ch='F';
                                        count++;
                                        System.out.println();
                                }
                        }
                }
        }
}

