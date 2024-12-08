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
}
