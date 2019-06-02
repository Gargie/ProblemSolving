package com.gargie.practice.problem.solving;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxSum {
	static void miniMaxSum(int[] arr) {
		Arrays.sort(arr);
		long minVal = arr[0];
		long maxVal = arr[arr.length - 1];
		long totalSum = 0;
		for (int i = 0; i < arr.length; i++)
			totalSum = totalSum + arr[i];

		System.out.println((totalSum - maxVal) + " " + (totalSum - minVal));

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int[] arr = new int[5];

		String[] arrItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < 5; i++) {
			int arrItem = Integer.parseInt(arrItems[i]);
			arr[i] = arrItem;
		}

		miniMaxSum(arr);

		scanner.close();
	}
}
