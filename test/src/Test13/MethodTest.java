package Test13;

public class MethodTest {

	public void print() {
		System.out.println("프린트 함수");
	}

	public void print(int a) { //위의 print()와는 다른 메소드로 취급. 아규먼트까지 합쳐서 함수선언이다.
		//위 함수에 들어가는 인자는 아규먼트. 근데 파라미터라고들 부름.
		System.out.println("인트 프린트 함수");
	}

	public static void main(String[] args) {
		MethodTest mtd = new MethodTest(); //print를 호출하려면 일단 초기화를 해 줘야 함!
		mtd.print(2); //여기 ()에 들어가는 인자는 파라미터.
	}

}
