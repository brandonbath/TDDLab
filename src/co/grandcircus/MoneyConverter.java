package co.grandcircus;

import java.util.Scanner;

public class MoneyConverter {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String cont = "yes";

		while (cont.equals("yes")) {
			System.out.println("Hellerrrrr there, how much $$ you got? (Whole numbers only, don't include commas or the $)");
			try {
				int money = scan.nextInt();

				if (money < 1000) {
					System.out.println("Alrighty write your check like dis: " + numToWord2(money));
				} else {
					System.out.println("Who you kiddin you ain't got that kind of cash foo!");
				}
			} catch (Exception e) {
				System.out.println("Not what I asked for. Follow the directions next time...");
				scan.next();
			}
			System.out.println("Do you want to continue? (yes/no)");
			cont = scan.next();
		}

		
		System.out.println("Goodbye!");
		scan.close();
		scan.close();
	}

	public static String numToWord2(int number) {
		// next four lines is getting last number of any hundreds numbers
		double doubleNum = number;
		String lastNum = String.valueOf((doubleNum / 10));
		String afterDot = lastNum.split("\\.")[1];
		int finalNum = Integer.parseInt(afterDot);

		if (number < 20) {
			return ones[number] + " dollars";
		} else if (number < 100 && (number % 10 == 0)) {
			return tens[number / 10] + " " + ones[number % 10] + "dollars";
		} else if (number < 100) {
			return tens[number / 10] + " " + ones[number % 10] + " dollars";
		} else if (number == 100) {
			return "One hundred dollars";
		} else if (number > 100 && number < 110) {
			return hundreds[number / 100] + " hundred and " + ones[finalNum] + " dollars";
		} else if (number > 109 && number < 120) {
			return hundreds[number / 100] + " hundred and " + ones[(finalNum + 10)] + " dollars";
		} else if (number < 1000 && (finalNum == 0)) {
			return hundreds[number / 100] + " hundred and " + hundredtens[(number / 10) % 10] + " " + ones[finalNum]
					+ "dollars";
		} else if (number < 1000) {
			return hundreds[number / 100] + " hundred and " + hundredtens[(number / 10) % 10] + " " + ones[finalNum]
					+ " dollars";
		}

		return "Who you kiddin you ain't got that kind of cash foo!";
	}

	// test to get 1 $ to print out one dollars
	public static String[] ones = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
			"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };

	public static String[] hundreds = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine" };

	public static String[] tens = { "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty",
			"Ninety" };

	public static String[] hundredtens = { "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty",
			"ninety" };

}

