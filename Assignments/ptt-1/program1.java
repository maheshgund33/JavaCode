/*	c2w  c2w  c2w
 *      c2w  c2w  c2w
        c2w  c2w  c2w
*/

class pt1{

	public static void main(String args[]){
		int count=0;
		for(int i=1;i<=3;i++){
			if(count==3){
				break;
			}else{
				System.out.print("c2w"+"\t");
				if(i==3){
					i=0;
					count++;
					System.out.println();
				}
			}
		}
	}
}

