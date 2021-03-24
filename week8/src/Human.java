
public class Human {
	private int age; 
	private String name;
	//default constructor
	public Human() {
		this.age= 5;
		this.name ="Wanda";
	}
	//constructor
	public Human(int age) {
		this.age = age;
		this.name = "Trish";
	}
	//getter
	public int getAge() {
		return age;
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
