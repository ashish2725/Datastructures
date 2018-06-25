import java.util.*;
import java.lang.*;
import java.io.*;

// class to determine if two strings are same or not after rotatiaon.
public class StringRotation {

  public static void main(String args[]) {

    String one = "AshishBagade";
    String two = "BagadeAshish";

    if (verifyStringRotation(one, two)) {
      System.out.println("Two strings are rotation of each other");
    } else {
      System.out.println("Two strings are not rotation of each other");
    }
  }

/***
  Verify if two strings can be rotated.
  @param :
  @return :
*/
  private static boolean verifyStringRotation(String one, String two) {
    StringBuilder str = new StringBuilder(one);
    String temp = str.append(one).toString();
    System.out.println("appended string is " + temp);
    return isSubstring(temp, two);
    }

    // Returns true if s2 is substring of s1
  private static boolean isSubstring(String s1, String s2) {
      return s1.toLowerCase().contains(s2.toLowerCase());
  }

}
