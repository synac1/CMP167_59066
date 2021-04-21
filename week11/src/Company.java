
public class Company {
	protected String companyName;
	private double companyBudget;
	private int amountOfEmployees;
	public Company(String companyName, double companyBudget, int amountOfEmployees) {
		this.companyName = companyName;
		this.companyBudget = companyBudget;
		this.amountOfEmployees = amountOfEmployees;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public double getCompanyBudget() {
		return companyBudget;
	}
	public void setCompanyBudget(double companyBudget) {
		this.companyBudget = companyBudget;
	}
	public int getAmountOfEmployees() {
		return amountOfEmployees;
	}
	public void setAmountOfEmployees(int amountOfEmployees) {
		this.amountOfEmployees = amountOfEmployees;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj instanceof Company) {
			Company otherCompany = (Company) obj;
			return (this.companyName.equals(otherCompany.companyName)
					&& Math.abs(this.companyBudget-otherCompany.companyBudget)< .00001
					&& this.amountOfEmployees == otherCompany.amountOfEmployees);
		}
		return false;
	}
	@Override
	public String toString() {
		return "Company [companyName=" + companyName + ", companyBudget=" + companyBudget + ", amountOfEmployees="
				+ amountOfEmployees + "]";
	}
	
}
