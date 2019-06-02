package com.gargie.practice.problem.solving;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CompareTriplets {

	//
	static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

		int aScore = 0;
		int bScore = 0;
		List<Integer> result = new ArrayList<Integer>();
		for (int i = 0; i < a.size(); i++) {
			if (a.get(i) > b.get(i))
				aScore = aScore + 1;
			else if (a.get(i) < b.get(i))
				bScore = bScore + 1;
		}

		result.add(aScore);
		result.add(bScore);

		return result;

	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt)
				.collect(toList());

		List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt)
				.collect(toList());

		List<Integer> result = compareTriplets(a, b);

		bufferedWriter.write(result.stream().map(Object::toString).collect(joining(" ")) + "\n");

		bufferedReader.close();
		bufferedWriter.close();
	}
}
