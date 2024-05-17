/*	1C3   4B2   9A1
 *	16C3  25B2  36A1
 *	49C3  64B2  81A1
 */
class pt9{

        public static void main(String args[]){
                int count=0;
		char ch='C';
		int x=1;
                for(int i=1;i<=3;i++){
                        if(count==3){
                                break;
                        }else{
				System.out.print(x*x);
                                System.out.print(ch--);
				System.out.print(4-i+"\t");
				x++;
                                if(i==3){
                                        i=0;
                                        count++;
					ch='C';
                                        System.out.println();
                                }
                        }
                }
        }
}

