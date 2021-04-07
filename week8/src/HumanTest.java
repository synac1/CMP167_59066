


public class HumanTest {
	public static void main(String[] args) {
		Human person1 = new Human();
		
		//System.out.println(person1);
		person1.setAge(10);
		
		//System.out.println(person1);
		
		Human person2 = new Human(25);
		//System.out.println(person2);
		
		Human [] humans = new Human[5];
		humans[0] = new Human(41, "Trish");
		humans[1] = new Human(21);
		
		
		//System.out.println(humans[0]);
		//Show all objects in the array, if the ref is not null
	/*
		for(int i = 0 ; i < humans.length ; i++) {
			if(humans[i]== null) { //if it null increment i(go to the next iteration)
				continue;
			}else {
				System.out.println(humans[i]);
			}
		}
		System.out.println("______________________________________");
		for (Human h: humans) {
			if (h == null) {
				continue;
			}
			else {
				System.out.println(h);
			}
		}
		*/
		person1.setName("Thessa");
		System.out.println(person1);
		
		person1.setName("lin");
		System.out.println(person1);

	}
}
