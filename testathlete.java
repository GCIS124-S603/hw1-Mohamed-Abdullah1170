package homework1;

import java.util.Scanner;

public class TestAthlete {
	public static void main(String[] args) {
		Athlete Athlete1 = new Athlete();
		System.out.printf(
				"Name: " + Athlete1.name() + " Height: " + Athlete1.height() + " Weight: " + Athlete1.weight() + "\n");
		System.out.println("Athlete's BMI: " + Athlete1.bmi());
		Athlete Athlete3 = new Athlete("George Brown", 71, 175);
		System.out.print(
				"Name: " + Athlete3.name() + " Height: " + Athlete3.height() + " Weight: " + Athlete3.weight() + "\n");
		System.out.printf("Athlete's BMI: " + "%.2f", Athlete3.bmi());
		System.out.println();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Athlete's name: ");
		String n = scanner.nextLine();
		System.out.println("Height: ");
		double h = scanner.nextDouble();
		System.out.println("Weight: ");
		double w = scanner.nextDouble();
		Athlete Athlete2 = new Athlete(n, w, h);
		System.out.print(
				"Name: " + Athlete2.name() + " Height: " + Athlete2.height() + " Weight: " + Athlete2.weight() + "\n");
		System.out.printf("Athlete's BMI: " + "%.2f", Athlete2.bmi());

	}
}