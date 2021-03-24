import java.awt.List;

public class HumanTest {
	public static void main(String[] args) {
		Human person1 = new Human();
		
		System.out.println(person1);
		person1.setAge(10);
		
		System.out.println(person1);
		
		Human person2 = new Human(25);
		System.out.println(person2);
		
		List myList = new List();

	}
}
