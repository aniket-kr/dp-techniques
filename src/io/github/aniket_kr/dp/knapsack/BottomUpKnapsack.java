package io.github.aniket_kr.dp.knapsack;

public class BottomUpKnapsack implements Knapsack {

  @Override
  public int knapsack(int[] wt, int[] val, int capacity) {
    assert wt.length == val.length;
    return bottomUp(wt, val, capacity, wt.length);
  }

  private int bottomUp(int[] wt, int[] val, int w, int n) {
    int[][] table = new int[n + 1][w + 1];
    for (int i = 0; i < n + 1; i++) { table[i][0] = 0; }
    for (int j = 0; j < w + 1; j++) { table[0][j] = 0; }

    for (int i = 1; i < n + 1; i++) {
      for (int j = 1; j < w + 1; j++) {
        int valNotIncluded = table[i - 1][j];
        if (wt[i - 1] <= j) {  // item can fit
          table[i][j] = Math.max(
            val[i - 1] + valNotIncluded,
            valNotIncluded
          );
        } else {
          table[i][j] = valNotIncluded;
        }
      }
    }

    return table[n][w];
  }
}
