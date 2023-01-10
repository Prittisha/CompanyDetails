package org.company;

public class CompanyInfo {
 //method
	private void companyName() {
		System.out.println("Company Name : Greens Technologies");
	}
	private void companyId() {
		System.out.println("Company ID : 24680");
	}
	private void companyAddress() {
		System.out.println("Company Address : OMR, Thoraipakkam");
	}
	
	public static void main (String args[]) {
		CompanyInfo detailsCompany = new CompanyInfo();
		
		detailsCompany.companyName();
		detailsCompany.companyId();
		detailsCompany.companyAddress();
	}
}
