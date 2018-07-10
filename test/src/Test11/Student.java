package Test11;

public class Student {

	private String clazz;
	private String name;
	private int grade;
	
	//모든 변수는 반드시 1개의 함수만 사용해서 한번에 1개의 값만 입력받을 수 있습니다.
	//해당 클래스의 class, name, grade를 출력하는 함수는 1개로 하셔도 됩니다.
	
	public void setClazz(String clazz){
		this.clazz = clazz;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setGrade(int grade){
		this.grade = grade;
	}
	
	public void printInfo() {
		System.out.println(clazz + "반의 " + name + " 학생은 " + grade + "학년입니다.");
	}
}
