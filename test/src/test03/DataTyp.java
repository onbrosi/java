package test03;

public class DataTyp {
	
	public static void main(String[] args) {
		boolean b1 = true;
		System.out.println(b1);
		System.out.println(1==1);
		b1 = 1==1;
		System.out.println(b1);
		
		int a = 3;
		int b = 4;
		
		b1 = a!=b;
		
		if(b1) {
			System.out.println("a와 b의값은 다르네요!");
		}else {
			System.out.println("a와 b의값은 다르네요!");
		}
	}

}
