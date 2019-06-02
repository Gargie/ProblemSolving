package com.gargie.practice.problem.solving;

import java.util.Scanner;

public class SumOfTwoNumbers {

	static int solveMeFirst(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		int a, b, sum;
		Scanner in = new Scanner(System.in);
		a = in.nextInt();
		b = in.nextInt();
		in.close();
		sum = solveMeFirst(a, b);
		System.out.println("SUM : "+sum);
	}
}