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

    int mid = size / 2;

    for (int i = 0; i < size; i++) {
      int spaces = Math.abs(mid - i);
      int stars = size - 2 * spaces;

      for (int j = 0; j < spaces; j++) {
        System.out.print(" ");
      }
      for (int j = 0; j < stars; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

    scanner.close();
  }
}
