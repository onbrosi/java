package test07;

import java.util.Scanner; //스캐너는 누군가한테 입력을 받는 값
// print는 이어서 println은 띄어서 , . 은 ~의 

public class Condition {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("시작값을 정해주세요 : ");
		String startNum = scan.nextLine();
		System.out.print("종료값을 정해주세요 : ");
		String endNum = scan.nextLine();

		int sNum = Integer.parseInt(startNum);
		int eNum = Integer.parseInt(endNum);

		if (sNum > eNum) {
			int tmp = sNum;
			sNum = eNum;
			eNum = tmp;
		}
		for (int i = sNum; i <= eNum; i++) {
			System.out.println(i);
		}
		scan.close();
	}
}
