import java.util.Scanner;

public class RunMatrix {
  public static void main(String[] args) {
    Matrix matrix = new Matrix(5);
    matrix.populateMatrix();
    System.out.println("Original Matrix:");
    matrix.printMatrix();
    matrix.flipMatrix();
    System.out.println("Flipped Matrix:");
    matrix.printMatrix();
  }
}
