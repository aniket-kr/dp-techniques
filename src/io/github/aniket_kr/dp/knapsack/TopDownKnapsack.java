package io.github.aniket_kr.dp.knapsack;

import java.util.Arrays;

public class TopDownKnapsack implements Knapsack {

  @Override
  public int knapsack(int[] wt, int[] val, int capacity) {
    assert wt.length == val.length;
    int[][] memo = new int[wt.length + 1][capacity + 1];
    for (var row : memo) {
      Arrays.fill(row, -1);
    }

    return topDown(memo, wt, val, capacity, wt.length);
  }

  private int topDown(int[][] memo, int[] wt, int[] val, int w, int n) {
    if (n == 0 || w == 0) { return 0; }
    if (memo[n][w] != -1) { return memo[n][w]; }

    int notIncludedVal = topDown(memo, wt, val, w, n - 1);
    if (wt[n - 1] <= w) {
      memo[n][w] = Math.max(
        val[n - 1] + topDown(memo, wt, val, w - wt[n - 1], n - 1),  // include it
        notIncludedVal  // don't include it
      );
    } else {
      memo[n][w] = notIncludedVal;
    }

    return memo[n][w];
  }
}
