package day46_static_keyword;

public class CompanyTest {
public static void main(String[] args) {
	// print cname variable value
	
	System.out.println(Company.cname);
	System.out.println(Company.cname.toUpperCase());
	System.out.println(Company.cname);
	Company c = new Company();
	System.out.println(c.cname);
	c.companyInfo();
	Company.companyInfo();
	
	
}
}
