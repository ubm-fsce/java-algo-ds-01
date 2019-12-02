package com.uday.algorithms.recursion;

public class Recursion {

  public static void main(String[] args) {
    System.out.println(recursiveBinarySearch(new int[]{1, 2, 3, 5, 7}, 0, 5, 2));

  }

  public static int recursiveLinearSearch(int[] a, int startPosition, int searchValue) {
    if (startPosition > a.length - 1) {
      return -1;
    } else if (a[startPosition] == searchValue) {
      return startPosition;
    } else {
      return recursiveLinearSearch(a, startPosition + 1, searchValue);
    }
  }

  // binary search only for sorted arrays
  public static int recursiveBinarySearch(int[] searchArray, int firstSlot, int lastSlot, int searchValue) {
    if (firstSlot > lastSlot) {
      return -1;
    } else {
      int midPoint = (firstSlot + lastSlot) / 2;
      if (searchArray[midPoint] == searchValue) {
        return midPoint;
      } else if (searchArray[midPoint] > searchValue) {
        return recursiveBinarySearch(searchArray, firstSlot, midPoint, searchValue);
      } else {
        return recursiveBinarySearch(searchArray, midPoint + 1, lastSlot, searchValue);
      }
    }
  }

}