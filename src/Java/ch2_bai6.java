package Java;

import java.util.Scanner;

public class ch2_bai6 {
	public static void main(String[] args) {
		int number, temp = 1;
		long giaiThua = 1;

		try (Scanner scanner = new Scanner(System.in)) {
			do {
				System.out.println("Nhập vào 1 số bất kỳ: ");
				number = scanner.nextInt();
			} while ((number <= 0) || (number > 10));
		}

		while (temp <= number) {
			giaiThua *= temp;
			temp++;
		}

		System.out.println(number + "! = " + giaiThua);
	}

}

