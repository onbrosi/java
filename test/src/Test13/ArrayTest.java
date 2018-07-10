package Test13;

import java.util.Scanner;

public class ArrayTest {
	
	 {
		int[] arr = new int[5]; //기본값으로 0이 들어 있으려나.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 1부터 5까지 중 1개를 입력해 주세요.");
		String numStr = scan.nextLine();
		int num = Integer.parseInt(numStr);
		if(num==1) {
			System.out.println("당신은 나서는 걸 좋아하는 타입이군요!");
			arr[1] = 1;
			System.out.println(arr[1]);
			System.out.println("숫자를 1부터 5까지 중 1개를 입력해 주세요.");
			String numStr2 = scan.nextLine();
			int num2 = Integer.parseInt(numStr);
			if(arr[1] == 1) {
	public static void main(String[] args)
				System.out.println("1은 이미 입력하셨잖아요.");
			}
			
		} else if(num==2) {
			System.out.println("당신은 뒤에서 조종하는 걸 좋아하는 타입이군요!");
			arr[2] = 1;
		} else if(num==3) {
			System.out.println("당신은 센터에 욕심이 있군요.");
			arr[3] = 1;
		} else if(num==4) {
			System.out.println("어중간한 타입이군요!");
			arr[4] = 1;
		} else if(num==5) {
			System.out.println("당신은 욕심이 없는 타입이군요!");
			arr[5] = 1;
		} else {
			System.out.println("한글 몰라? 1부터 5까지만 입력하라고.");
		}
		System.out.println("니가 입력한 숫자 : " + numStr);
	}

}
