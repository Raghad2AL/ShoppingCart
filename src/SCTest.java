
import static org.junit.Assert.*;
import org.junit.Test;

public class SCTest {
	CartShopping cart1;
	products p1 =  new products("Java Book", 127);
	products p2 =  new products("Web Design Book", 100);

	 // @Rule
	 // public ExpectedException thrown = ExpectedException.none();

	@Test
	public void test00(){
	cart1 = new CartShopping();
	assertTrue((cart1.getcount())==0);
	}//first test case
	
	@Test (expected = NullPointerException.class)
	public void test01() {
    //thrown.expect(IllegalArgumentException.class);
	cart1.add(p1);
	assertTrue((cart1.getcount())==1);
	assertTrue((cart1.getprice())==127);
	}//second test case

	@Test  (expected = NullPointerException.class)
	public void test10(){
	cart1.add(p1);
	cart1.add(p2);
	assertTrue((cart1.getcount())==2);
	assertTrue((cart1.getprice())==227);

	}//third test case
	
	
}//end
