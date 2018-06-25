import java.util.*;
import java.lang.*;
import java.io.*;

/***
Program to determine if string1 and string2 are permutation of each other.
*/
class StringPermutation {

  private static QuickSort q1= new QuickSort();

  public static void main(String args []) {
    System.out.println("Enter first string");
    Scanner scanner = new Scanner(System.in);
    String stringOne  = scanner.nextLine();

    System.out.println("Enter second string");
    String stringTwo  = scanner.nextLine();

    if (verifyPermutation(stringOne, stringTwo)) {
      System.out.println("Strings can be permuted");
    } else {
      System.out.println("Strings are not permutation of each other");
    }
  }

  private static boolean verifyPermutation(String one, String two) {
    int oneLength = one.length();
    int twoLength = two.length();
    char setOne[] = new char[oneLength];
    char setTwo[] = new char[twoLength];

    // return false if length unequal
    if (oneLength != twoLength) {
      return false;
    }

    // return false if one of both are empty strings.
    if (oneLength == 0 || twoLength == 0) {
      return false;
    }

    for (int i =0; i < oneLength; i++) {
      setOne[i] = one.charAt(i);
    }

    for (int i =0; i < twoLength; i++) {
      setTwo[i] = two.charAt(i);
    }

    // Sort both strings
    q1.quickSort(setOne, 0, oneLength-1);
    q1.quickSort(setTwo, 0, twoLength-1);

    // Compare sorted strings
      for (int i = 0; i < oneLength;  i++)
          if (setOne[i] != setTwo[i])
              return false;
      return true;
  }
}
