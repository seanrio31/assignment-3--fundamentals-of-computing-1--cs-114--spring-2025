public class Matrix {
  private int [][] matrix;

  public Matrix(int size) {
    matrix = new int [size][size];
    System.out.println("Matrix dimensions: " + size + " = size");
  }

  private void swap(int x1, int y1, int x2, int y2){
    int temp = matrix[x1][y1];
    matrix[x1][y2] = matrix[x2][y2];
    matrix[x2][y2] = temp;
  }
  public void printMatrix() {
    for (int i=0; i < matrix.length; i++) {
      for (int j=0; j < matrix[i].length; j++){
        if (i +j == matrix.length - 1){
          System.out.print("\033[33m" + matrix[i][j] + "\033[0m" + " ");
        } else {
          System.out.print(matrix[i][j] + " ");
        }
      }
      System.out.println(matrix[i][j] + " ");
    }
  }
  public void populateMatrix(){
    int value = 1;
    for (int i = 0; i < matrix.length; i++) {
      for int j = 0; j < matrix[i].length; j++ {
        matrix[i][j] = value++;
      }
    }
  }
  public void flipMatrix() {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = matrix[i].length - 1; j >= 0; j--) {
        if (i + j == matrix.length - 1) {
          continue;
        }
        swap(i, j, matrix.length - 1 - j, matrix.length -1 - i);
      }
    }
  }
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
