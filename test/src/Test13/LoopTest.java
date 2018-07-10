package Test13;

public class LoopTest {
	public static void main(String[] args) {
		int[] arr = new int[10]; //배열은 이렇게 선언하는구나. 메소드 안에서.
		for(int i=0; i<arr.length; i++) {
			arr[i] = (i+1)*3;
		}
		for(int i=0; i<arr.length; i++) {
			System.out.println("arr["+i+"] = " + arr[i]);
		}
		
	}

}
