/*	C  B  A
 *	C  B  A
 *	C  B  A
 */
class pt9{

        public static void main(String args[]){
                int count=0;
		char ch=67;
                for(int i=1;i<=3;i++){
                        if(count==3){
                                break;
                        }else{
                                System.out.print(ch--+"\t");
                                if(i==3){
                                        i=0;
					ch=67;
                                        count++;
                                        System.out.println();
                                }
                        }
                }
        }
}

