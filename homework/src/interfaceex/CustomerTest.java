package interfaceex;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer customer = new Customer();
		
		Buy buyer = customer;
		buyer.buy();
		
		Sell seller = customer;
		seller.sell();
		
		customer.order();	//고객판매주문
		buyer.order();		//고객판매주문
		seller.order();		//고객판매주문
		//모두 Overriding 된 메소드가 불린다.
	}
}
