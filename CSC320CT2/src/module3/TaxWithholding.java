package module3;

import java.util.Scanner;

public class TaxWithholding {
	
	public static void main(String [] args) {
		Scanner scnr = new Scanner(System.in);
	
	// User enter their weekly income
	System.out.print("Enter your weekly income: $");	
	double income = scnr.nextDouble();
	
	// Find the tax withholding 
	double taxWithholding = calculateTaxWithholding(income);
	
	// View results 
	System.out.printf("Average Tax Withholding: $%.2f%n", taxWithholding); 
	
	scnr.close();
}

	public static double calculateTaxWithholding(double income) {
		double taxRate;
		
		if (income < 500) {
			taxRate = 0.10; // 10%
		} else if (income >= 500 && income < 1500) {
			taxRate = 0.15; // 15%
		} else if (income >= 1500 && income < 2500) {
			taxRate = 0.20; // 20% 
		} else {
			taxRate = 0.30; // 30%
		}
		
		// Find the tax withholding 
		return income * taxRate;
	}
}	