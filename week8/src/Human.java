
public class Human {
	private int age; 
	private String name;
	
	//default constructor
	public Human() {
		this.age = 5;
		this.name = "wanda";
	}
	//constructor
	public Human(int age) {
		this.age = age;
		this.name = "wanda";
	}
	public Human(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	//getter
	public int getAge() {
		return age;
	}
	public void setName(String name) {
		if (name.length()<5) {
			this.name = name;
		}else {
			System.out.println("The name cannot have more than 4 characters");
		}
		
	}
	//setter
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Human: name: "+this.name+ ", age:"+getAge();
	}
	
	//Create a setter and getter for the name instance variable
	//Create a constructor that takes in age and name

}
