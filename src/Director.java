
public class Director {

	public static void main(String[] args) {
		Director director = new Director();
		director.playScenario();
		
	}
	
	public void playScenario(){
		System.out.println("시나리오를 시작합니다.");
		System.out.println("사장을 생성합니다.");
		Boss boss = new Boss();
		
		System.out.println("학생을 만듭니다.");
		Student student = new Student();
		
		System.out.println("맥주 bar를 만듭니다.");
		Beerbar beerbar = new Beerbar();
	
		System.out.println("학생에게 메뉴판을 제공합니다");
		beerbar.Student(menu); //??
				
		
	}

}
