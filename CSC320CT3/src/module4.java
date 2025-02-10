import java.util.Scanner;

public class module4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
		 double sum = 0;
		 double max = Double.MIN_VALUE;
		 double min = Double.MAX_VALUE;
		 
		System.out.println("Enter 10 grades");
		
		for (int i = 0; i < 10; i ++) {
			System.out.print("Grade " + (i + 1) + ": ");
			double grade = scanner.nextDouble();
			sum += grade;
			
			if (grade > max) {
				max = grade; 
			}
			if (grade < min) {
				min = grade;
			}
		}
		
		double average = sum / 10;
		
		System.out.println("\nGrade  Statistics:");
		System.out.println("Average: " + average);
		System.out.println("Maximum: " + max);
		System.out.println("Minimum " + min);
		
		scanner.close();
	}
}	