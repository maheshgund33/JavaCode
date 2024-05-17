/*	26  Z  25  Y
 *	24  X  23  W
 *	22  V  21  U
 *	20  T  19  S
 */

class pt5{

        public static void main(String args[]){
                int count=0;
		int x=26;
		char ch='Z';
                for(int i=1;i<=4;i++){
                        if(count==4){
                                break;
                        }else{
				if(i%2==1)
                                	System.out.print(x--+"\t");
				else
					System.out.print(ch--+"\t");

                                if(i==4){
                                        i=0;
                                        count++;
                                        System.out.println();
                                }
                        }
                }
        }
}

