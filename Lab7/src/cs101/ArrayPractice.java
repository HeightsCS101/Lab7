package cs101;

import java.util.Arrays;

public class ArrayPractice {

	// 3 points
	public static double[] arrays_a() {

		double[] a = new double[3];

		// TODO: set the first element in a to be 1.1

		// TODO: set the second element in a to be 2.2

		// TODO: set the third element in a to be 3.3

		return a;

	}

	// 5 points
	public static int[] arrays_b() {

		int[] b = new int[100];

		// TODO: use a for loop to set all of the elements in b to be 99

		return b;

	}

	// 3 points
	public static double[] arrays_c() {

		// TODO: declare a double array with 4 elements.
		// Leave the values set to the default elements

		// TODO: return the array you just made (replace null)
		return null;

	}

	// 5 points
	public static String[] arrays_d() {

		// TODO: declare a String array with 6 elements.
		// TODO: Set all of the values to "hello world". You can use any method you want
		// to do this

		// TODO: return the array you just made (replace null)
		return null;
	}

	// 7 points
	public static boolean[] arrays_e() {

		// TODO: declare a boolean array with 50 elements.
		// TODO: Set the values using a for loop like so:
		// if the index of the array is even, set the value to true
		// otherwise, set the value to false
		// Hint: You can use (i % 2 == 0) to test if i is even

		// TODO: return the array you just made (replace null)
		return null;
	}

	// 2 points
	public static int arrays_f(String[] f) {

		// The String array f is passed into this function
		// TODO: use the length field (array_name.length) to return the length of f
		// (replace 0)
		return 0;
	}

	// 2 points
	public static String arrays_g(String[] g) {

		// The String array g is passed into this function
		// TODO: return the first element of g (replace null)
		return null;
	}

	// 2 points
	public static int arrays_h(int[] h) {

		// The int array h is passed into this function
		// TODO: return the 6th element of h (replace 0)
		return 0;
	}

	// 4 points
	public static double arrays_i(int[] i) {

		double double_i;

		// The double array i is passed into this function
		// TODO: set double_i to be the 4th value of the i array, cast as a double

		// TODO: return double_i (replace 0.0)
		return 0.0;
	}

	// 7 points
	public static boolean[] arrays_j(boolean[] j) {

		// The double array j is passed into this function
		// TODO: use a for loop to (re)set every 5th element of j to be false.
		// (this means the 5th element, the 10th element, the 15th element, .... etc)
		// Notice, you do not know how long j is. (Hint: use j.length)

		return j;
	}

	// use for testing
	public static void main(String[] args) {

		System.out.println("Problem A =========================");
		System.out.println(Arrays.toString(arrays_a()));

		System.out.println("\nProblem B =========================");
		System.out.println(Arrays.toString(arrays_b()));

		System.out.println("\nProblem C =========================");
		System.out.println(Arrays.toString(arrays_c()));

		System.out.println("\nProblem D =========================");
		System.out.println(Arrays.toString(arrays_d()));

		System.out.println("\nProblem E =========================");
		System.out.println(Arrays.toString(arrays_e()));

		System.out.println("\nProblem F =========================");
		String[] f = { "qw", "er", "ty" };
		System.out.println(arrays_f(f));

		System.out.println("\nProblem G =========================");
		String[] g = { "pasta", "pizza", "rice" };
		System.out.println(arrays_g(g));

		System.out.println("\nProblem H =========================");
		int[] h = { 13, 15, 7, 98, 99, 100, 43, 34, 55 };
		System.out.println(arrays_h(h));

		System.out.println("\nProblem I =========================");
		int[] i = { 2, 66, 97, 79, 101, 202, 353 };
		System.out.println(arrays_i(i));

		System.out.println("\nProblem J =========================");
		boolean[] j = { true, true, true, true, true, true, true, true, true, true };
		System.out.println(Arrays.toString(arrays_j(j)));

	}

}
