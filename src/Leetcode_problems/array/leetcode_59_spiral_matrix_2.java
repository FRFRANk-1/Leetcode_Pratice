package Leetcode_problems.array;
class leetcode_59_spiral_matrix_2 {
  public int[][] generateMatrix(int n) {
    int[][] res = new int[n][n];
    int count = 1;

    for (int loop = 0, start = 0; loop < n / 2; loop++, start++) {
      int i, j;

      System.out.println("Loop " + loop + " Start " + start);

      // from left to right, top line
      for (j = start; j < n - loop; j++) {
        res[start][j] = count;
        System.out.println("Fill [" + start + "][" + j + "] = " + count);
        count++;
      }
      j--;

      // from top to bottom, right column
      for (i = start + 1; i < n - loop; i++) {
        res[i][j] = count;
        System.out.println("Fill [" + i + "][" + j + "] = " + count);
        count++;
      }
      i--;

      // from right to left, bottom row
      for (j = j - 1; j >= loop; j--) {
        res[i][j] = count;
        System.out.println("Fill [" + i + "][" + j + "] = " + count);
        count++;
      }
      j++;

      // from bottom to top, left column
      for (i = i - 1; i > start; i--) {
        res[i][j] = count;
        System.out.println("Fill [" + i + "][" + j + "] = " + count);
        count++;
      }
    }

    // if n is odd, then it has a center number
    if (n % 2 == 1) {
      res[n / 2][n / 2] = count;
      System.out.println("Fill center [" + n / 2 + "][" + n / 2 + "] = " + count);
    }

    return res;
  }

  public static void main(String[] args) {
    leetcode_59_spiral_matrix_2 solution = new leetcode_59_spiral_matrix_2();
    int n = 3;
    int[][] spiral = solution.generateMatrix(n);
    printMatrix(spiral);

    int n2 = 6;
    int[][] spiral2 = solution.generateMatrix(n2);
    printMatrix(spiral2);
  }

  private static void printMatrix(int[][] matrix) {
    for (int[] row : matrix) {
      for (int val : row) {
        System.out.print(val + " ");
      }
      System.out.println();
    }
    System.out.println();
  }
}
