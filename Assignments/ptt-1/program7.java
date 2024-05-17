/*	D  D  D  D
 *	D  D  D  D
 *	D  D  D  D
 */
class pt7{

        public static void main(String args[]){
                int count=0;
                for(int i=1;i<=4;i++){
                        if(count==4){
                                break;
                        }else{
                                System.out.print("D"+"\t");
                                if(i==4){
                                        i=0;
                                        count++;
                                        System.out.println();
                                }
                        }
                }
        }
}

