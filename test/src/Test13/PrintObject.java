package Test13;

public class PrintObject {
	
	String str = "poStr";
	
	public String toString() { //상속+오버라이드. toString1()이라고 하면 그냥 새 함수인 거고.
		return "이 클래스의 str이라는 변수는 " + str +
				"이라는 값을 가지고 있죠";
	}

	public static void main(String[] args) {
		String str = "str"; //String은 특별한 클래스. 값을 바로 찍어줌.
		System.out.println(str);
		PrintObject po = new PrintObject(); //()를 빼먹지 않게 주의.
		//System.out.println(po.str);
		System.out.println(po); //만약 po라고만 쓰면 메모리 주소가 찍힘.
	}

}
