package Test13;

public class Son extends Father {

	void work() { //함수명 뿐 아니라 데이터 타입까지도(파라미터도!) 같아야 오버라이드 된다. 오버라이드는 상속이 필요하다.
		//오버라이드 할 거면 접근 제어자도 똑같이 써 두는 것이 좋다.
		System.out.println("난 개발일을 하지~"); //오버라이드.
		//만약 work()안에 int a 라고 썼다면? 그 경우, 오버라이드가 안 된다(아버지가 호출된다). 오버로딩임.
	}
	public static void main(String[] args) {
		Son s = new Son();
		s.work();
	}
}
