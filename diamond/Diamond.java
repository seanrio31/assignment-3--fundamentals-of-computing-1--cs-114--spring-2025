import java.util.Scanner;

public class Diamond {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the size of the diamond: ");
    int size = scanner.nextInt();

    if (size < 1) {
      System.out.println("Please enter a number greater than 0");
      return;
    }

    if (size % 2 == 0) {
      size += 1;
    }

    int mid = size / 2;

    for (int i = 0; i <= mid; i++) {
      for (int j = 0; j < mid - i; j++) {
        System.out.print(" ");
      }

      for (int j = 0; j < 2 * i + 1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

    for (int i = mid - 1; i >= 0; i--) {
      for (int j = 0; j < mid - i; j++) {
        System.out.print(" ");
      }
      for (int j = 0; j < 2 * i + 1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

    scanner.close();
  }
}
