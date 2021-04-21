
public class DepartmentTest {
	public static void main(String[] args) {
		Company company1 = new Company("Amazona", 500.00, 50);
		Department dep1 = new Department("Samsungi", 1000.00, 500,"Sales" );
		System.out.println(company1);
		System.out.println(dep1);
		
		dep1.setCompanyName("Verizona");
		System.out.println(dep1);
	}
}
