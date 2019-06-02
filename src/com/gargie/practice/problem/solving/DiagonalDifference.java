package com.gargie.practice.problem.solving;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DiagonalDifference {

	static int diagonalDifference(int[][] arr) {

		int sum1 = 0;
		int sum2 = 0;
		int difference = 0;

		for (int i = 0; i < arr.length; i++)
			sum1 = sum1 + arr[i][i];

		for (int m = 0; m < arr.length; m++)
			sum2 = sum2 + arr[m][(arr.length - 1) - m];

		difference = Math.abs(sum1 - sum2);

		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(difference);
		return difference;

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[][] arr = new int[n][n];

		for (int i = 0; i < n; i++) {
			String[] arrRowItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int j = 0; j < n; j++) {
				int arrItem = Integer.parseInt(arrRowItems[j]);
				arr[i][j] = arrItem;
			}
		}

		int result = diagonalDifference(arr);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}
}
