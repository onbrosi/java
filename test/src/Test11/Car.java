package Test11;

public class Car {

	private int speed;
	private String name;
	private String company;
	
	public void setValue(int speed, String name, String company)
	{
		this.speed = speed;
		this.name = name;
		this.company = company;
	}
	
	public void printValue()
	{
		System.out.println("이 차의 속도는 " + speed + "이고,\n이름은 " + name + "이고,\n제조사는 " + company + "이다.");
	}
}
