package io.github.aniket_kr.dp.knapsack01;

import java.util.Arrays;

public class Knapsack {

  // prevent instantiation
  private Knapsack() {}

  private static int recursion(int[] wt, int[] val, int w, int n) {
    if (n == 0 || w == 0) { return 0; }

    if (wt[n - 1] <= w) {
      return Math.max(
        val[n - 1] + recursion(wt, val, w - wt[n - 1], n - 1), // include it
        recursion(wt, val, w, n - 1) // don't include it
      );
    }
    else {
      return recursion(wt, val, w, n - 1);
    }
  }

  public static int recursion(int[] wt, int[] val, int capacity) {
    assert wt.length == val.length;

    return recursion(wt, val, capacity, wt.length);
  }

  // memoization
  private static int topDown(int[][] memo, int[] wt, int[] val, int w, int n) {
    if (n == 0 || w == 0) { return 0; }
    if (memo[n][w] != -1) { return memo[n][w]; }

    int maxYet = topDown(memo, wt, val, w, n - 1);
    if (wt[n - 1] <= w) {
      memo[n][w] = Math.max(val[n - 1] + maxYet, maxYet);
    }
    else {
      memo[n][w] = maxYet;
    }
    return memo[n][w];
  }

  public static int topDown(int[] wt, int[] val, int capacity) {
    assert wt.length == val.length;

    int[][] memo = new int[wt.length + 1][capacity + 1];
    for (var row : memo) {
      Arrays.fill(row, -1);
    }

    return topDown(memo, wt, val, capacity, wt.length);
  }

  // tabulation
  private static int bottomUp(int[] wt, int[] val, int w, int n) {
    int[][] table = new int[n + 1][w + 1];
    for (int i = 0; i < n + 1; i++) { table[i][0] = 0; }
    for (int j = 0; j < w + 1; j++) { table[0][j] = 0; }

    for (int i = 1; i < n + 1; i++) {
      for (int j = 1; j < w + 1; j++) {
        if (wt[i - 1] <= j) {  // weight can fit
          table[i][j] = Math.max(
            val[i - 1] + table[i - 1][j - wt[i - 1]],  // take current weight and subtract chosen item weight
            table[i - 1][j]  // do not consider weight (and subtract 0)
          );
        } else {
          table[i][j] = table[i - 1][j];
        }
      }
    }

    return table[n][w];
  }

  public static int bottomUp(int[] wt, int[] val, int capacity) {
    assert wt.length == val.length;

    return bottomUp(wt, val, capacity, wt.length);
  }
}
