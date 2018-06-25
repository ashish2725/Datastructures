import java.util.*;
import java.lang.*;
import java.io.*;

/***
Program to determine if string1 and string2 are one letter away (addition/subtraction/replace).
*/
//TODO : finish this
class oneAway {

  public static void main(String [] args) {

    System.out.println("Enter first string");
    Scanner scanner = new Scanner(System.in);
    String stringOne  = scanner.nextLine();

    System.out.println("Enter second string");
    String stringTwo  = scanner.nextLine();

    if(verifyIfOneAway(stringOne, stringTwo)) {
      System.out.println("Two strings are not more than one character away.");
    } else {
      System.out.println("Two strings are more than one character away.");
    }

  }

  private static boolean verifyIfOneAway(String one, String two) {
    int strLengthOne = one.length();
    int strLengthTwo = two.length();

    // if one length away, reject
    if (Math.abs(strLengthOne - strLengthOne) > 1) {
      System.out.println("strings are not one away.");
      return false;
    }
    // oterwise, do following.
    int i = 0;
    int j = 0;
    int edits = 0;

    while (i > strLengthOne && j > strLengthTwo) {

      if (one.charAt(i) != two.charAt(j)) {

        if (edits == 1) {
          return false;
        }

        //stringLength one is smaller than two
        if (strLengthOne < strLengthTwo) {
          i++;
        }
        // stringLengthTwo is smaller than one
        else if (strLengthOne > strLengthTwo) {
            j++;
          } else {
              i++; j++;
          }

        }
      }

      // count extra characters in the string
      if (strLengthOne < i || strLengthTwo < j) {
        edits++;
      }

      return edits == 1;
    }
  }
