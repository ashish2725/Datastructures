import java.util.*;
import java.lang.*;
import java.io.*;

class URLify {

  public static void main(String [] args) {
    System.out.println("Please input a string to URLify with single space between words");
    Scanner scanner = new Scanner(System.in);
    String inputString = scanner.nextLine();
    char myArray[] = inputString.toCharArray();

    System.out.println("Please enter true length of the string");
    String inputLength = scanner.nextLine();
    int inputLen = Integer.parseInt(inputLength);


    changeToUrl(myArray, inputLen);
  }

  private static void changeToUrl(char[] inputArray , int length) {
    int newLength = 0;
    for (int i =0 ; i < length; i++ ) {
      if (inputArray[i] == ' ') {
        newLength = newLength + 2;
      }
      newLength++;
    }
    System.out.println("new length is " + newLength);
    char [] resultArray = new char[newLength];
    // for (int i = length-1; i >= 0; i-- ) {
    //   if (inputArray[i] == ' ') {
    //     resultArray[newLength]= '0';
    //     resultArray[newLength -1]= '2';
    //     resultArray[newLength - 2]= '%';
    //     newLength = newLength -2;
    //
    //   } else {
    //     resultArray[i] = inputArray[i];
    //     newLength = newLength -1;
    //   }
    // }

    //inputArray[newLength] = '\0';

    for (int i = newLength; i >= 0; i--) {
      if (inputArray[i] == ' ') {
        inputArray[newLength -1] = '0';
        inputArray[newLength -2] = '2';
        inputArray[newLength -3] = '%';
        newLength = newLength - 3;
      } else {
        inputArray[newLength - 1] = inputArray[i];
        newLength = newLength -1;
      }
    }
    for (int i = 0; i< newLength; i++ ) {
      System.out.print(resultArray[i]);
    }
  }
}
