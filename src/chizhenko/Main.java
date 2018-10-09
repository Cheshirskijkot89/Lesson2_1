package chizhenko;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x;
		int counter;
		String xStr;

		System.out.println("Please enter a five-digit number and press enter:");

		while (true) {

			x = sc.nextInt();
			xStr = Integer.toString(x);

			if (xStr.length() != 5) {
				System.out.println("Please enter a five-digit number and press enter:");
				continue;
			}

			sc.close();

			counter = 10000;
			while (counter >= 1) {
				if (counter == 10000) {
					System.out.println(x / counter);
				} else {
					System.out.println((x % (counter * 10)) / counter);
				}
				;

				counter = counter / 10;
			}

			break;

		}

	}

}
