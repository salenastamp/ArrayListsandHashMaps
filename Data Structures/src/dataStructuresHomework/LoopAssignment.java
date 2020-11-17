package dataStructuresHomework;

import java.util.ArrayList;
import java.util.Scanner;

public class LoopAssignment {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("give me 5 numbers");
		ArrayList<Integer> numList = new ArrayList();
		int userNum;
		for (int i = 1; i < 6; i++) {
			userNum = Integer.parseInt(userInput.nextLine());
			numList.add(userNum);
		}

		int sum = 0;
		for (int a : numList) {
			sum += a;
		}

		int product = 1;
		for (int a : numList) {
			product *= a;
		}

		int max = Integer.MIN_VALUE;
		for (int i = 0; i < numList.size(); i++) {
			if ((numList.get(i) > max)) {
				max = numList.get(i);
			}
		}

		int min = Integer.MAX_VALUE;
		for (int i = 0; i < numList.size(); i++) {
			if ((numList.get(i) < min)) {
				min = numList.get(i);
			}
		}
	}
}
