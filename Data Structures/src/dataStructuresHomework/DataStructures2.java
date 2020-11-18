package dataStructuresHomework;

import java.util.Arrays;

public class DataStructures2 {
	// this answers question 1 to sum the values of an array
	public static double arraySum(double[] array) {
		double sum = 0;
		for (double a : array) {
			sum += a;
		}
		return sum;
	}

	// question 3: creating a method to make an array of size n filled with indeces
	// of index to the power power
	public static int[] toPower(int size, int power) {
		int[] powerArray = new int[size];
		for (int b = 0; b <= size - 1; b++) {
			powerArray[b] = (int) (Math.pow(b, power));
		}
		return (powerArray);
	}

	public static void main(String[] args) {
		// testing answer to question 1. It works!
		 double[] newArray = { 5, 4, 7, 6 };
		System.out.println(arraySum(newArray));

		// question two. This returns 2, which is the index of the maximum value in the array
		 double[] exampleArray = { 1, 5, 6, 5, 4, 1 };
		 double maximum = exampleArray[0];

		 int index = 0;

		 for (int i = 1; i < exampleArray.length; i++) {

		 if (exampleArray[i] > maximum) {

		 maximum = exampleArray[i];

		 index = i;

		}

		System.out.println(index);

		// question 3 testing. It works!

		System.out.println(Arrays.toString(toPower(3, 7)));
	}
}
