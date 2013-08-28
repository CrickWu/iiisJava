/** Analysis: ... */

/** Design: ... */

/** Coding : Please indent and format your code properly */
/** Copy and paste your code to replace the template below */
/** Note that your class must be named Exercise11_09 */
import java.util.*;
public class Exercise11_09 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the array size n: ");
		int n = input.nextInt();
		Random r = new Random();
		int[][] intArr = new int[n][n];
		int[][] sum = new int[2][n];
		System.out.println("The random array is");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				intArr[i][j] = r.nextInt(2);
				sum[0][i] += intArr[i][j];
				sum[1][j] += intArr[i][j];
				System.out.print(intArr[i][j]);
			}
			System.out.println();
		}
		int rowMax = -1;
		int columnMax = -1;
		for (int i = 0; i < n; i++) {
			if (rowMax < sum[0][i])
				rowMax = sum[0][i];
			if (columnMax < sum[1][i])
				columnMax = sum[1][i];
		}
		ArrayList<Integer> rowIndex = new ArrayList<Integer>();
		ArrayList<Integer> columnIndex = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			if (sum[0][i] == rowMax)
				rowIndex.add(i);
			if (sum[1][i] == columnMax)
				columnIndex.add(i);
		}
		System.out.print("The largest row index: ");
		System.out.print(rowIndex.get(0));
		for (int i = 1; i < rowIndex.size(); i++)
			System.out.print(", " + rowIndex.get(i));
		System.out.print("\nThe largest column index: ");
		System.out.print(columnIndex.get(0));
		for (int i = 1; i < columnIndex.size(); i++)
			System.out.print(", " + columnIndex.get(i));
		System.out.println();
	}
}

