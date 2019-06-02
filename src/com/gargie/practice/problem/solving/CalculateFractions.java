package com.gargie.practice.problem.solving;

import java.util.Scanner;

public class CalculateFractions {

	static void plusMinus(int[] arr) {

		int countPositive = 0;

		int countNegetive = 0;

		int countZero = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0)
				countPositive = countPositive + 1;
			else if (arr[i] < 0)
				countNegetive = countNegetive + 1;
			else
				countZero = countZero + 1;
		}
		double p = (double) countPositive / arr.length;
		double n = (double) countNegetive / arr.length;
		double z = (double) countZero / arr.length;

		System.out.printf("%6f", p);
		System.out.println();
		System.out.printf("%6f", n);
		System.out.println();
		System.out.printf("%6f", z);
		System.out.println();

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] arr = new int[n];

		String[] arrItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int arrItem = Integer.parseInt(arrItems[i]);
			arr[i] = arrItem;
		}

		plusMinus(arr);

		scanner.close();
	}
}
