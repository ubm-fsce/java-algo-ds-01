package com.uday.algorithms.binarysearch;

public class BinarySearch {

  public static void main(String[] args) {
    System.out.println(binarySearch(new int[] {1,2,3,5,7}, 1));
    System.out.println(binarySearch(new int[] {1,2,3,5,7}, 1));
   

  }

  public static int binarySearch(int[] sortedArray, int x) {
    int p = 0;
    int r = sortedArray.length-1;
    int q = 0;
    while (p <= r) {
      q = (p + r) / 2;
      if (sortedArray[q] == x) {
        return q;
      } else if (sortedArray[q] > x) {
        r = q - 1;
      } else {
        p = q + 1;
      }

    }
    return -1;
  }
}
