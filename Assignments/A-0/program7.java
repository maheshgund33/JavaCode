

/* Calculate profit or loss
 * Write a program that takes the cost price and selling price (take it hardcoded) and calculates its profit or loss */
class program7{

        public static void main(String args[]){
                int sellingPrice=1200;
		int costPrice=1000;

                if(sellingPrice > costPrice){
                        System.out.println("profit of "+(sellingPrice-costPrice));
                }else if(costPrice > sellingPrice){
                        System.out.println("loss of "+(costPrice -sellingPrice));
                }else{
			System.out.println("Not loss Not Profit");
		}
        }
}


