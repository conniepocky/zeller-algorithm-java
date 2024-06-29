import java.util.Scanner;

public class zeller {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the day you were born, e.g 1, 2, 3..");

		int d = scan.nextInt();
		
		System.out.println("Enter the month you were born, e.g 1, 2, 3..");

		int m = scan.nextInt();

		System.out.println("Enter the year you were born, e.g 1990, 1991, 1992..");

		int y = scan.nextInt();

		if (m < 3) {
			m += 12;
			y -= 1;
		}

		int c = y % 100;

		int x = y / 100;

		int f = (d + (13 * (m + 1) / 5) + c + (c / 4) + (x / 4) + (5 * x)) % 7;

		String[] days = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};

		System.out.println("You were born on a " + days[f]);
	}
}
