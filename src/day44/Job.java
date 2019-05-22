package day44;

public class Job {
	private String title;
	private String company;
	private double annualSalary;

	public Job() {
		System.out.println("No-args constructor");
		title = "undefined";
		company = "undefined";
	}

	public Job(String title) {
		System.out.println("One args constructor");
		this.title = title;
		this.company = "undefined";
	}

	public Job(String title, String company, double annualSalary) {
		System.out.println("Three args constructor");
		setTitle(title);
		setCompany(company);
		this.annualSalary = annualSalary;
	}

	public String toString() {
		return "\nJob [title=" + title + ", company=" + company + ", annualSalary=" + annualSalary + "]";
	}

	public void setTitle(String title) {
		// we can add conditions here
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getCompany() {
		return company;
	}

	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}

	public double getAnnualSalary() {
		return annualSalary;
	}

}
