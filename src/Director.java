
public class Director {

	public static void main(String[] args) {
		Director director = new Director();
		director.playScenario();
		
	}
	
	public void playScenario(){
		System.out.println("�ó������� �����մϴ�.");
		System.out.println("������ �����մϴ�.");
		Boss boss = new Boss();
		
		System.out.println("�л��� ����ϴ�.");
		Student student = new Student();
		
		System.out.println("���� bar�� ����ϴ�.");
		Beerbar beerbar = new Beerbar();
	
		System.out.println("�л����� �޴����� �����մϴ�");
		beerbar.Student(menu); //??
				
		
	}

}
