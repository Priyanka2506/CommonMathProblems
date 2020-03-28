//Program to find diagonal difference in square matrix

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DiagonalDifference {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numberOfRows = sc.nextInt();
		List<List<Integer>> array = new ArrayList<>();

		for (int i = 0; i < numberOfRows; i++) {
			// if you do row.clear after adding row to array, list added to
			// array will also be cleared. hence it is essential to crete a new
			// list for each loop
			List<Integer> row = new ArrayList<>();
			for (int j = 0; j < numberOfRows; j++) {
				row.add(sc.nextInt());
			}
			array.add(row);
		}

		int difference = diagonalDifference(numberOfRows, array);
		System.out.println("Difference is: " + difference);

	}

	private static int diagonalDifference(int numberOfRows, List<List<Integer>> arr) {

		int leftD = 0, rightD = 0;
		for (int i = 0; i < numberOfRows; i++) {
			for (int j = 0; j < numberOfRows; j++) {
				if (i == j) {
					leftD += arr.get(i).get(j);
				}
			}

		}

		for (int i = 0; i < numberOfRows; i++) {
			for (int j = 0; j < numberOfRows; j++) {
				if ((i + j) == (numberOfRows - 1)) {
					rightD += arr.get(i).get(j);
				}
			}

		}

		return Math.abs(leftD - rightD);
	}

}
