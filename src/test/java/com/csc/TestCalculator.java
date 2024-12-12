package com.csc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestCalculator {

  Calculator calculator;

  @BeforeEach
  void setUp() {
    calculator = new Calculator();
  }

  @Test
  void testMaximumUsingForLoop() {
    int[] nums = {3, 1, 4, 1, 5, 9};
    assertEquals(9, Calculator.maximumUsingForLoop(nums));
  }

  @Test
  void testMinimumUsingForLoop() {
    int[] nums = {3, 1, 4, 1, 5, 9};
    assertEquals(1, Calculator.minimumUsingForLoop(nums));
  }

  @Test
  void testSumUsingForLoop() {
    int[] nums = {1, 2, 3, 4, 5};
    assertEquals(15, Calculator.sumUsingForLoop(nums));
  }

  @Test
  void testAverageUsingForLoop() {
    int[] nums = {1, 2, 3, 4, 5};
    assertEquals(3, Calculator.averageUsingForLoop(nums)); // Integer division
  }

  @Test
  void testMaximumUsingStream() {
    int[] nums = {3, 1, 4, 1, 5, 9};
    assertEquals(9, Calculator.maximumUsingStream(nums));
  }

  @Test
  void testMinimumUsingStream() {
    int[] nums = {3, 1, 4, 1, 5, 9};
    assertEquals(1, Calculator.minimumUsingStream(nums));
  }

  @Test
  void testSumUsingStream() {
    int[] nums = {1, 2, 3, 4, 5};
    assertEquals(15, Calculator.sumUsingStream(nums));
  }

  @Test
  void testAverageUsingStream() {
    int[] nums = {1, 2, 3, 4, 5};
    assertEquals(3.0, Calculator.averageUsingStream(nums).orElse(0.0));
  }

  @Test
  void testSingleElementArrayForLoops() {
    int[] singleElementArray = {42};
    assertEquals(42, Calculator.maximumUsingForLoop(singleElementArray));
    assertEquals(42, Calculator.minimumUsingForLoop(singleElementArray));
    assertEquals(42, Calculator.sumUsingForLoop(singleElementArray));
    assertEquals(42, Calculator.averageUsingForLoop(singleElementArray));
  }

  @Test
  void testSingleElementArrayForStreams() {
    int[] singleElementArray = {42};
    assertEquals(42, Calculator.maximumUsingStream(singleElementArray));
    assertEquals(42, Calculator.minimumUsingStream(singleElementArray));
    assertEquals(42, Calculator.sumUsingStream(singleElementArray));
    assertEquals(42.0, Calculator.averageUsingStream(singleElementArray).orElse(0.0));
  }

  @Test
  void testEvensOnly() {
    int[] nums = {1, 2, 3, 4, 5, 6};
    String expected = "[2, 4, 6]";
    String actual = Calculator.evensOnly(nums);
    assertEquals(expected, actual, "EvensOnly should return only even numbers as a string.");
  }

  @Test
  void testOddsOnly() {
    int[] nums = {1, 2, 3, 4, 5, 6};
    String expected = "[1, 3, 5]";
    String actual = Calculator.oddsOnly(nums);
    assertEquals(expected, actual, "OddsOnly should return only odd numbers as a string.");
  }

  @Test
  void testAddFive() {
    int[] nums = {1, 2, 3};
    String expected = "[6, 7, 8]";
    String actual = Calculator.addFive(nums);
    assertEquals(expected, actual, "AddFive should add 5 to each element and return the result as a string.");
  }

  @Test
  void testSquare() {
    int[] nums = {2, 3, 4};
    String expected = "[4, 9, 16]";
    String actual = Calculator.square(nums);
    assertEquals(expected, actual, "Square should return the square of each element as a string.");
  }

  @Test
  void testEvensOnlyEmptyArray() {
    int[] nums = {};
    String expected = "[]";
    String actual = Calculator.evensOnly(nums);
    assertEquals(expected, actual, "EvensOnly should handle an empty array.");
  }

  @Test
  void testOddsOnlyEmptyArray() {
    int[] nums = {};
    String expected = "[]";
    String actual = Calculator.oddsOnly(nums);
    assertEquals(expected, actual, "OddsOnly should handle an empty array.");
  }

  @Test
  void testAddFiveEmptyArray() {
    int[] nums = {};
    String expected = "[]";
    String actual = Calculator.addFive(nums);
    assertEquals(expected, actual, "AddFive should handle an empty array.");
  }

  @Test
  void testSquareEmptyArray() {
    int[] nums = {};
    String expected = "[]";
    String actual = Calculator.square(nums);
    assertEquals(expected, actual, "Square should handle an empty array.");
  }
}
