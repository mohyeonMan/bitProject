package interfaceex;

public class Customer implements Buy, Sell { // 동일한 이름의 디폴트메서드가 있으면 에러가 나온다.

	@Override
	public void sell() {
		System.out.println("판매");
	}

	@Override
	public void buy() {
		System.out.println("구매");
	}

	@Override
	public void order() {
		System.out.println("고객 판매 주문");
	}

}
