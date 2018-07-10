package test09;

public class Obj {
	int num = 3;
	boolean bl = true;

	int getNum() {
		return 1;
	}

	String getStr() {
		return "abc";
	}

//	Obj getObj() {
//		return this;
//	}
	void test() {
		int num = 10;
		System.out.println(this.num);
		System.out.println(num);
		System.out.println("난 Obj의 테스트함수");
	}

	void test2() {
		System.out.println(num);
		System.out.println(bl);
		test();
	}

	public static void main(String[] args) {
		Obj o = new Obj();
		o.test();

	}
}
// () 함수의 선언 , 함수의 호출 - {}가 있으면 호출
// void 아무것도 넘기지 않겠다