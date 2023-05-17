import java.io.PrintWriter;
import java.util.Scanner;

public class TwoDimRaggedArrayUtility {

	public TwoDimRaggedArrayUtility() {

	}

	public static double[][] readFile(java.io.File file) throws java.io.FileNotFoundException {

		String[][] strArray = new String[10][10];
		int rows = 0;

		Scanner fs = new Scanner(file);
		while (fs.hasNext()) {
			strArray[rows] = fs.nextLine().split("\\s");
			rows++;
		}
		fs.close();

		double[][] doubleArray = new double[rows][];

		for (int row = 0; row < rows; row++) {
			int cols = strArray[row].length;
			doubleArray[row] = new double[cols];
			for (int col = 0; col < cols; col++) {
				doubleArray[row][col] = Double.parseDouble(strArray[row][col]);
			}
		}
		return doubleArray;
	}

	public static void writeToFile(double[][] data, java.io.File outputFile) throws java.io.FileNotFoundException {
		PrintWriter wf = new PrintWriter(outputFile);

		for (int row = 0; row < data.length; row++) {
			String nextLine = "";
			for (int col = 0; col < data[row].length; col++) {
				nextLine += data[row][col] + " ";
			}
			wf.println(nextLine);
		}
		wf.close();

	}

	public static double getTotal(double[][] data) {
		double total = 0.0;

		for (int row = 0; row < data.length; row++) {
			for (int col = 0; col < data[row].length; col++) {
				total += data[row][col];
			}
		}
		return total;
	}

	public static double getAverage(double[][] data) {
		double total = 0.0;
		int num = 0;

		for (int row = 0; row < data.length; row++) {
			for (int col = 0; col < data[row].length; col++) {
				total += data[row][col];
				num++;
			}
		}
		return total / num;
	}

	public static double getRowTotal(double[][] data, int row) {
		double total = 0.0;

		for (int col = 0; col < data[row].length; col++) {
			total += data[row][col];
		}

		return total;
	}

	public static double getColumnTotal(double[][] data, int col) {
		double total = 0.0;

		for (int row = 0; row < data.length; row++) {
			if (col < data[row].length) {
				total += data[row][col];
			}
		}

		return total;
	}

	
	public static double getHighestInRow(double[][] data, int row) {
		double highestRowVal = 0.0;

		for (int col = 0; col < data[row].length; col++) {
			if (data[row][col] > highestRowVal) {
				highestRowVal = data[row][col];
			}
		}

		return highestRowVal;
	}

	public static int getHighestInRowIndex(double[][] data, int row) {
		double highestRowVal = 0.0;
		int highestRowIdx = 0;

		for (int col = 0; col < data[row].length; col++) {
			if (data[row][col] > highestRowVal) {
				highestRowVal = data[row][col];
				highestRowIdx = col;
			}
		}

		return highestRowIdx;
	}

	public static double getLowestInRow(double[][] data, int row) {
		double lowestRowVal = Double.MAX_VALUE;

		for (int col = 0; col < data[row].length; col++) {
			if (data[row][col] < lowestRowVal) {
				lowestRowVal = data[row][col];
			}
		}
		return lowestRowVal;
	}

	public static int getLowestInRowIndex(double[][] data, int row) {
		double lowestRowVal = Double.MAX_VALUE;
		int lowestRowIdx = 0;

		for (int col = 0; col < data[row].length; col++) {
			if (data[row][col] < lowestRowVal) {
				lowestRowVal = data[row][col];
				lowestRowIdx = col;
			}
		}
		return lowestRowIdx;
	}

	public static double getHighestInColumn(double[][] data, int col) {
		double highestColVal = 0.0;

		for (int row = 0; row < data.length; row++) {
			if (col < data[row].length) {
				if (data[row][col] > highestColVal) {
					highestColVal = data[row][col];
				}
			}
		}
		return highestColVal;
	}

	public static int getHighestInColumnIndex(double[][] data, int col) {
		double highestColVal = 0.0;
		int highestColIdx = 0;

		for (int row = 0; row < data.length; row++) {
			if (col < data[row].length) {
				if (data[row][col] > highestColVal) {
					highestColVal = data[row][col];
					highestColIdx = row;
				}
			}
		}
		return highestColIdx;
	}

	public static double getLowestInColumn(double[][] data, int col) {
		double lowestColVal = Double.MAX_VALUE;

		for (int row = 0; row < data.length; row++) {
			if (col < data[row].length) {
				if (data[row][col] < lowestColVal) {
					lowestColVal = data[row][col];
				}
			}
		}
		return lowestColVal;
	}

	public static int getLowestInColumnIndex(double[][] data, int col) {
		double lowestColVal = Double.MAX_VALUE;
		int lowestColIdx = 0;

		for (int row = 0; row < data.length; row++) {
			if (col < data[row].length) {
				if (data[row][col] < lowestColVal) {
					lowestColVal = data[row][col];
					lowestColIdx = row;
				}
			}
		}
		return lowestColIdx;
	}

	public static double getHighestInArray(double[][] data) {
		double highestVal = 0.0;

		for (int row = 0; row < data.length; row++) {
			for (int col = 0; col < data[row].length; col++) {
				if (data[row][col] > highestVal) {
					highestVal = data[row][col];
				}
			}
		}
		return highestVal;
	}

	public static double getLowestInArray(double[][] data) {
		double lowestVal = Double.MAX_VALUE;

		for (int row = 0; row < data.length; row++) {
			for (int col = 0; col < data[row].length; col++) {
				if (data[row][col] < lowestVal) {
					lowestVal = data[row][col];
				}
			}
		}
		return lowestVal;
	}
}