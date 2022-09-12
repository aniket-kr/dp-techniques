package io.github.aniket_kr.dp.knapsack;

public class RecursiveKnapsack implements Knapsack {

  @Override
  public int knapsack(int[] wt, int[] val, int capacity) {
    assert wt.length == val.length;
    return recursive(wt, val, capacity, wt.length);
  }

  private int recursive(int[] wt, int[] val, int w, int n) {
    if (n == 0 || w == 0) { return 0; }

    if (wt[n - 1] <= w) {
      return Math.max(
        val[n - 1] + recursive(wt, val, w - wt[n - 1], n - 1), // include it
        recursive(wt, val, w, n - 1) // don't include it
      );
    }
    else {
      return recursive(wt, val, w, n - 1);
    }
  }
}
