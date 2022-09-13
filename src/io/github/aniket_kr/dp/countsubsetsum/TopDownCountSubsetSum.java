package io.github.aniket_kr.dp.countsubsetsum;

import java.util.Arrays;

public class TopDownCountSubsetSum implements CountSubsetSum {

  @Override
  public int countSubsets(int[] nums, int targetSum) {
    assert targetSum > 0;
    assert Arrays.stream(nums).filter(num -> num <= 0).count() == 0;

    int[][] memo = new int[nums.length + 1][targetSum + 1];
    for (var row : memo) {
      Arrays.fill(row, -1);
    }
    return topDown(memo, nums, targetSum, nums.length);
  }

  private int topDown(int[][] memo, int[] nums, int t, int n) {
    if (t == 0) { return 1; }
    if (n == 0) { return 0; }
    if (memo[n][t] != -1) { return memo[n][t]; }

    int notIncludedCount = topDown(memo, nums, t, n - 1);
    if (nums[n - 1] <= t) {
      memo[n][t] = topDown(memo, nums, t - nums[n - 1], n - 1) + notIncludedCount;
    } else {
      memo[n][t] = notIncludedCount;
    }

    return memo[n][t];
  }

}
