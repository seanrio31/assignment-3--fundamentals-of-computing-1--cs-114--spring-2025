import java.util.Scanner;

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
