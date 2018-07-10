package Test12;

public class Exam01 {

	public static void main(String[] args) {
		for(int i=0; i<=10;) {
			System.out.println(i);
			if(i%2==0) {
				i++;
				continue; //위(루프문)로 올라가라.
			}
			System.out.println(i++); //i가 찍힌 다음에서야, ++처리가 된다(!)
			//참고로 ++i라고 하면 더하고서 실행됨.
		}
	}
}
//이번 주(7월 9일)부터는 숙제가 나간다. 매일 나가지는 않는다. 숙제는 메일로 나간다.
