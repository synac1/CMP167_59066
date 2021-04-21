
public class Department extends Company {
	private String departmentName;
	
	public Department(String companyName, double companyBudget, int amountOfEmployees, String departmentName) {
		super(companyName, companyBudget, amountOfEmployees);
		this.departmentName = departmentName;
	}
	
	@Override
	public String toString() {
		return "Deparment: "+departmentName+" "+super.toString();
	}
	
}
