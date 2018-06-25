import java.util.*;
import java.lang.*;
import java.io.*;

class UniqueString {

    private static BufferedReader stdin = new BufferedReader( new InputStreamReader( System.in ) );

    public static void main(String args[]) throws IOException {

        // input string
        System.out.println("Enter string to check if it is unique: ");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();

        //verify if a method is unique.
        if (verifyIfUnique(inputString)) {
          System.out.println("This is a Unique string...");
        } else {
          System.out.println("This is not a Unique string...");
        }
    }

    private static boolean verifyIfUnique(String inputString) {
      if (inputString.length() > 128) {
        return false;
      }
      boolean[] charSet = new boolean[128];
      for (int i =0; i < inputString.length(); i++) {
        int value = inputString.charAt(i);
        if (charSet[value]) {
          return false;
        }
        charSet[value] = true;
      }
      return true;
    }
}
