/*	d  d  d  d
 *	c  c  c  c
 *	b  b  b  b
 *	a  a  a  a
 *
 */

class pt8{

        public static void main(String args[]){
                int count=0;
		char ch=100;
                for(int i=1;i<=4;i++){
                        if(count==4){
                                break;
                        }else{
                                System.out.print(ch+"\t");
                                if(i==4){
                                        i=0;
					ch--;
                                        count++;
                                        System.out.println();
                                }
                        }
                }
        }
}

