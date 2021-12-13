package Quiz;

public class Quiz {
	static int[][] matrix = new int[5][5];

	static int[] multiplicatoinArrays = new int[matrix.length];
	static int[] returnRow = new int[matrix.length];
	static int[] returnColumn = new int[matrix.length];

	public static void main(String[] args) {

		PrintMatrix();
		Initialize();
		PrintMatrix();
		multiplication();
		PrintMatrix();
		Row();
		System.out.println("Print Row array");
		printSingleArray(returnRow);
		Column();
		System.out.println(" ");
		System.out.println("Print Column array");
		printSingleArray(returnColumn);
		MultiplicationArrays();
		System.out.println(" ");
		System.out.println("Print Multiplication of Arrays");
		printSingleArray(multiplicatoinArrays);
	}

	public static void printSingleArray(int[] arr) {
		System.out.println("");

		for (int i = 0; i < arr.length; i++) {

			System.out.print(" " + arr[i]);
		}
	}

	public static void MultiplicationArrays() {
		for (int i = 0; i < multiplicatoinArrays.length; i++) {
			multiplicatoinArrays[i] = returnRow[i] * returnColumn[i];

		}
	}

	public static void Row() {
		for (int i = 0; i < returnRow.length; i++) {
			returnRow[i] = matrix[i][1];

		}
	}

	public static void Column() {
		for (int i = 0; i < returnColumn.length; i++) {
			returnColumn[i] = matrix[2][i];

		}
	}

	public static void multiplication() {
		for (int i = 0; i < matrix.length; i++) {

			for (int j = 0; j < matrix[i].length; j++) {

				matrix[i][j] = matrix[i][j] * 20;

			}
			System.out.println();
		}
	}

	public static void PrintMatrix() {

		for (int i = 0; i < matrix.length; i++) {

			for (int j = 0; j < matrix[i].length; j++) {

				System.out.print(matrix[i][j] + "  ");

			}
			System.out.println();
		}

	}

	public static void Initialize() {
		int plus = 0;
		for (int i = 0; i < matrix.length; i++) {

			int value = 0;
			value = value + plus;

			for (int j = 0; j < matrix[i].length; j++) {
				value++;
				matrix[i][j] = value;

			}
			plus++;
			System.out.println();
		}

	}
}
