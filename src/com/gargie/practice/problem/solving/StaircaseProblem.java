package com.gargie.practice.problem.solving;

import java.util.Scanner;

public class StaircaseProblem {

	static void staircase(int n) {
		StringBuilder sb = new StringBuilder(n);
		for (int i = 0; i < n; i++)
			sb.append(" ");

		for (int j = n - 1; j >= 0; j--) {
			sb.replace(j, j + 1, "#");
			System.out.println(sb.toString());
		}
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		staircase(n);

		scanner.close();
	}
}
