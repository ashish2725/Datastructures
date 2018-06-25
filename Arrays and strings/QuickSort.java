import java.util.*;
import java.lang.*;
import java.io.*;

class QuickSort {

  private static void exchange(char A[],int a, int b) {
        char temp;
        temp = A[a];
        A[a]   = A[b];
        A[b]   = temp;
    }

    private static int partition(char A[], int si, int ei) {
        char x = A[ei];
        int i = (si - 1);
        int j;

        for (j = si; j <= ei - 1; j++)
        {
            if(A[j] <= x)
            {
                i++;
                exchange(A, i, j);
            }
        }
        exchange (A, i+1 , ei);
        return (i + 1);
    }

    /* Implementation of Quick Sort
    A[] --> Array to be sorted
    si  --> Starting index
    ei  --> Ending index
    */
    public static void quickSort(char A[], int si, int ei) {
        int pi;    /* Partitioning index */
        if(si < ei)
        {
            pi = partition(A, si, ei);
            quickSort(A, si, pi - 1);
            quickSort(A, pi + 1, ei);
        }
    }
}
