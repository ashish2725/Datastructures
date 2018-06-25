import java.util.*;
import java.lang.*;
import java.io.*;

public class zeroMatrix {

  public static void main(String args[]) {

    int[][] input = {{1, 2, 3}, {4, 0, 6}, {7, 8, 9}};

    // actual method call to convert matrix.
    convertToZeroMatrix(input);

    // print matrix output.
    for (int i = 0; i< 3 ; i++) {
      for (int j = 0; j< 3 ; j++) {
        System.out.print(" " + input[i][j] + "\t");
      }
      System.out.println("");
    }

    }

/***
      Helper method to convert input matrix to zero matrix.
      @param input[][]: input matrix to be converted.
      @return: nothing but matrix is modified.
*/
  private static void convertToZeroMatrix(int[][] input) {
    boolean[] rowBool = new boolean[input.length];
    boolean[] colBool = new boolean[input[0].length];
    for (int i = 0; i< input.length ; i++) {
      for (int j = 0; j< input[0].length ; j++) {
      if (input[i][j] == 0) {
        rowBool[i] = true;
        colBool[j] = true;
      }
    }
  }

  // turn rowmatrix to zero.
  for (int i = 0; i< input.length ; i++) {
    if (rowBool[i]) {
        nullifyRows(input, i);
      }
    }

  for (int j = 0; j< input[0].length ; j++) {
    if (colBool[j]) {
        nullifyColumns(input, j);
      }
    }
}
  private static void nullifyRows(int[][] input, int row) {
    for (int j = 0; j< input[0].length ; j++) {
      input[row][j] = 0;
    }
  }

  private static void nullifyColumns(int[][] input, int column) {
    for (int i = 0; i< input.length ; i++) {
      input[i][column] = 0;
    }
  }
}
