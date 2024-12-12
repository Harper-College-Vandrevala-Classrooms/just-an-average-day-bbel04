package com.csc;

import java.util.Arrays;
import java.util.OptionalDouble;

public class Calculator {

  //method to find max using loop
  public static int maximumUsingForLoop(int[] nums) {
    int max = nums[0];
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] > max) {
        max = nums[i];
      }
    }
    return max;
  }

  //method to find min using loop
  public static int minimumUsingForLoop(int[] nums) {
    int min = nums[0];
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] < min) {
        min = nums[i];
      }
    }
    return min;
  }
  
  //method to calculate sum using loop
  public static int sumUsingForLoop(int[] nums) {
    int sum = 0;
    for (int n : nums) {
      sum += n;
    }
    return sum;
  }

  //method to calculate average using loop
  public static int averageUsingForLoop(int[] nums) {
    int sum = 0;
    int avg = 0;
    for (int n : nums) {
      sum += n;
    }
    avg = sum / nums.length;
    return avg;
  }
  
  //method to find max using stream
  public static int maximumUsingStream(int[] nums) {
    return Arrays.stream(nums)
      .max()
      .orElseThrow(() -> new IllegalArgumentException("Array Is Empty"));
  }

  //method to find min using stream
  public static int minimumUsingStream(int[] nums) {
    return Arrays.stream(nums)
      .min()
      .orElseThrow(() -> new IllegalArgumentException("Array Is Empty"));
  }

  //method to calculate sum using stream
  public static int sumUsingStream(int[] nums) {
    return Arrays.stream(nums)
      .sum();
  }

  //method to calculate average using stream
  public static OptionalDouble averageUsingStream(int[] nums) {
    return Arrays.stream(nums)
      .average();
  }

  public static String evensOnly(int[] nums) {
    int[] evens = Arrays.stream(nums)
      .filter(n -> n % 2 == 0)
      .toArray();
    return Arrays.toString(evens);
  }

  public static String oddsOnly(int[] nums) {
    int[] odds = Arrays.stream(nums)
      .filter(n -> n % 2 != 0)
      .toArray();
    return Arrays.toString(odds);
  }

  public static String addFive(int[] nums) {
    int[] plusFive = Arrays.stream(nums)
      .map(n -> n + 5)
      .toArray();
    return Arrays.toString(plusFive);
  }

  public static String square(int[] nums) {
    int[] squares = Arrays.stream(nums)
      .map(n -> n * n)
      .toArray();
    return Arrays.toString(squares);
  }
      
  public static void main(String[] args) {
    int[] numbers = {1, 2, 3, 4, 5};

    //test loop methods
    System.out.println(maximumUsingForLoop(numbers));
    System.out.println(minimumUsingForLoop(numbers));
    System.out.println(sumUsingForLoop(numbers));
    System.out.println(averageUsingForLoop(numbers));

    //test stream methods
    System.out.println(maximumUsingStream(numbers));
    System.out.println(minimumUsingStream(numbers));
    System.out.println(sumUsingStream(numbers));
    System.out.println(averageUsingStream(numbers));
    System.out.println();
    System.out.println(evensOnly(numbers));
    System.out.println(oddsOnly(numbers));
    System.out.println(addFive(numbers));
    System.out.println(square(numbers));
  }
}
