/** Analysis: ... */

/** Design: ... */

/** Coding : Please indent and format your code properly */
/** Copy and paste your code to replace the template below */
/** Note that your class must be named Exercise07_22 */
import java.util.*;

public class Exercise07_22 {
	public static void main(String[] args) {
		int[][] intArr = new int[6][6];
		int[] sum = new int[6];
		Random r = new Random();
		for (int i = 0; i < 6; i++)
			for (int j = 0; j < 6; j++) {
				intArr[i][j] = r.nextInt(2);
				sum[i] += intArr[i][j];
			}
		System.out.print("       ");
		for (int i = 0; i < 6; i++)
			System.out.print(i + " ");
		System.out.println();
		for (int i = 0; i < 6; i++) {
			System.out.print("Row " + i + ": ");
			for (int j = 0; j < 6; j++)
				System.out.print(intArr[i][j] + " ");
			System.out.println(sum[i] % 2 == 1 ? "Odd" : "Even");
		}
	}
}
