import java.util.Arrays;

public class SortedMatrix {
    public static int[][] randomSillySolution(int[][] arrToSort, int size) {
        int[] bigTabToSort = new int[size * size];
        int startSize =0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                bigTabToSort[startSize++] = arrToSort[i][j];
            }
        }
        Arrays.sort(bigTabToSort);
        int[][] sortedArr = new int[size][size];
        startSize =0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                sortedArr[i][j] = bigTabToSort[startSize++];
            }
        }
        return sortedArr;
    }

    public static void printMatrix(int[][] matrix, int matrixSize) {
        for (int i = 0; i < matrixSize; i++) {
            System.out.print("[");
            for (int j = 0; j < matrixSize; j++) {
                System.out.print(" " + matrix[i][j] + " ");
            }
            System.out.print("] \n");
        }
    }

    public static void main(String[] args) {
        int[][] testArr = {{1, 32, 5, 6}, {4, 2, 7, 8}, {9, 0, 5, 1}, {89, 10, 7, 23}};
        printMatrix(randomSillySolution(testArr, 4), 4);
    }
}
