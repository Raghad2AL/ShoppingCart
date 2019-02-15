
public class CartShopping {
  
	int TotalCount =0;
	int TotalPrice =0;
	boolean flag = false;
	public int getcount() {
		// TODO Auto-generated method stub
		/*if (flag==false) {
			TotalCount=0;
		}*/
		return TotalCount;
	}//product count

	public void add(products products)  {
		// TODO Auto-generated method stub
		int pro = products.price1;
		TotalCount++;
		TotalPrice = TotalPrice + pro;
		
		
	}

	public int getprice() {
		// TODO Auto-generated method stub
		return TotalPrice;
	}

}//end of the cart shopping class
