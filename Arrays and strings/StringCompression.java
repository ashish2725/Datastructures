import java.util.*;
import java.lang.*;
import java.io.*;


/*
Implement a method to perform basic string compression using the counts of repeated characters.
For example, the string aabcccccaaa would become a2b1c5a3.
If the "compressed" string would not become smaller than the original string, your method should return the original string.
You can assume the string has only uppercase and lowercase letters (a - z).
*/
class StringCompression {

  public static void main(String args[]) {
    System.out.println("Enter a string to compress");
    Scanner scanner = new Scanner(System.in);
    String inputString  = scanner.nextLine();
    String compressedString = compressString(inputString);
  }

  private static String compressString(String input) {
    System.out.println("Input string before compress " + input);
    int stringLength = input.length();
    char[] inputChars = input.toCharArray();
    int i=0; int j=1;
    int counter = 0;

    // TODO : check string length less than two

    // if string length greater than two
    while(i < stringLength) {

      // if ij are aa.
      if (input.charAt(i) == input.charAt(j)) {
        i++;
        j++;
        counter++;
      }

      if (input.charAt(i) == input.charAt(j)) {

        System.out.println("counter is " + (char)counter);
        inputChars[i] = (char)counter;
        //myName = String.valueOf(myNameChars);

        // input.charAt(i) = (char)counter;
        counter = 0;
        i++;
        j++;
      }
    }

    System.out.println("Input string after compress " + input);
    return input;
  }
}
