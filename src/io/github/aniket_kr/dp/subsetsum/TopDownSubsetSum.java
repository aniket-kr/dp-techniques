package io.github.aniket_kr.dp.subsetsum;

import java.util.Arrays;

public class TopDownSubsetSum implements SubsetSum {

  @Override
  public boolean sumExists(int[] nums, int targetSum) {
    int[][] memo = new int[nums.length + 1][targetSum + 1];
    for (int i = 0; i < nums.length + 1; i++) {
      Arrays.fill(memo[i], -1);
    }

    return topDown(memo, nums, targetSum, nums.length) > 0;
  }

  private int topDown(int[][] memo, int[] nums, int t, int n) {
    if (t == 0) { return 1; }
    if (n == 0) { return 0; }
    if (memo[n][t] != -1) { return memo[n][t]; }

    int notIncludedResult = topDown(memo, nums, t, n - 1);
    if (nums[n - 1] <= t) {
      memo[n][t] =
          topDown(memo, nums, t - nums[n - 1], n - 1)  // include it
        + notIncludedResult;  // do not include it
    } else {
      memo[n][t] = notIncludedResult;
    }

    return memo[n][t];
  }

}
