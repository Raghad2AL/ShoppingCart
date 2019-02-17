
public class CartShopping {
  
	int TotalCount =0;
	double TotalPrice =0;
public int getcount() {
		// TODO Auto-generated method stub
		/*if (flag==false) {
			TotalCount=0;
		}*/
		return TotalCount;
	}//product count

	public void add(products products)  {
		// TODO Auto-generated method stub
		double pro = products.getPrice1();
		int count = products.getNo();
		TotalCount = TotalCount + count;
		TotalPrice = TotalPrice + pro;
		
		
	}

	public double getprice() {
		// TODO Auto-generated method stub
		return TotalPrice;
	}

}//end of the cart shopping class
