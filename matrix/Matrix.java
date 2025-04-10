import java.util.Scanner;

public class Matrix {
    private int[][] matrix;

    private int size;
    public Matrix(int size) {
        this.size = size;
        this.matrix = new int[size][size];
        System.out.println("Matrix dimensions: " + size + " x " + size);
    }

    private void swap(int x1, int y1, int x2, int y2) {
        int temp = matrix[x1][y1];
        matrix[x1][y1] = matrix[x2][y2];
        matrix[x2][y2] = temp;
    }

    public void printMatrix() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i + j == size - 1) {
                    System.out.print("\033[0;33m" + matrix[i][j] + "\033[0m ");
                } else {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public void populateMatrix() {
        int value = 1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = value++;
            }
        }
    }

    public void flipMatrix() {
        for (int i = 0; i < size; i++) {
            for (int j = size - 1 - i; j > i; j--) {
                swap(i, j, j, size - 1 - i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the matrix: ");
        int size = scanner.nextInt();

        Matrix matrix = new Matrix(size);

        matrix.populateMatrix();

        System.out.println("Original Matrix:");
        matrix.printMatrix();

        matrix.flipMatrix();

        System.out.println("Flipped Matrix:");
        matrix.printMatrix();

        scanner.close();
    }
  }
