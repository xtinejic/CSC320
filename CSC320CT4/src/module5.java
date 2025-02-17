import java.util.Scanner;

public class module5 {

	public static void main(String[] args) {
	String[] months = {"January", "February", "March", "April", "May", "June", "July", 
			"August", "September", "October", "November", "December"};
	double[] temperatures = new double[12];
	
	Scanner scanner = new Scanner(System.in);
	
	for (int i = 0; i < months.length; i++) {
		System.out.println("Average temperature for " + months[i] + ": ");
		temperatures[i] = scanner.nextDouble();
	}
	
	System.out.print("Enter month to view tempeture or type 'year' for yearly data: ");
	String input = scanner.next();
	
	boolean found = false;
	if (input.equalsIgnoreCase("year")) {
		double yearlySum = 0, highestTemp = temperatures[0], lowestTemp = temperatures[0];
		String highestMonth = months[0], lowestMonth = months[0];
		
		System.out.println("\nYearly Temperature Report: ");
		for (int i = 0; i < months.length; i++) {
			System.out.println(months[i] + ": " + temperatures[i] + "°C");
			
			yearlySum += temperatures[i];
			
			if (temperatures[i] > highestTemp) {
				highestTemp = temperatures[i];
				highestMonth = months[i];
			}
			if (temperatures[i] < lowestTemp) {
				lowestTemp = temperatures[i];
				lowestMonth = months[i];
			}
		}
		
		System.out.printf("\nYearly Average Temperature: %.2f°C\n", yearlySum / months.length);
		System.out.println("Highest Monthly Average: " + highestMonth + " with " + highestTemp + "°C");
		System.out.println("Lowest Monthly Average: " + lowestMonth + " with " + lowestTemp + "°C");
		found = true;
		}

	if (!found) {
		System.out.println("Invalid month entered. Try Again.");
	}
	
	scanner.close();
	
	}
}
