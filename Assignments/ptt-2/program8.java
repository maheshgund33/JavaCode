/*	A  b  C  d
 *	E  f  G  h  
 *	I  j  K  l
 *	M  n  O  p  
 */
class pt8{

        public static void main(String args[]){
                int count=0;
		char ch=65;
		char ch1='a';
                for(int i=1;i<=4;i++){
                        if(count==4){
                                break;
                        }else{
				if(i%2==0)
                                	System.out.print((ch1)+"\t");
				else
					System.out.print(ch+"\t");
				ch++;
				ch1++;
                                if(i==4){
                                        i=0;
                                        count++;
                                        System.out.println();
                                }
                        }
                }
        }
}

