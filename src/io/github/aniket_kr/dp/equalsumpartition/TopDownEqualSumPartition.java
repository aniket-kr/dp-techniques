package io.github.aniket_kr.dp.equalsumpartition;

import java.util.Arrays;

public class TopDownEqualSumPartition implements EqualSumPartition {

  @Override
  public boolean canPartition(int[] nums) {
    int sum = Arrays.stream(nums).sum();
    if (sum % 2 != 0) { return false; }

    int[][] memo = new int[nums.length + 1][sum + 1];
    for (var row : memo) {
      Arrays.fill(row, -1);
    }
    return topDown(memo, nums, sum, 0, nums.length) > 0;
  }

  private int topDown(int[][] memo, int[] nums, int t, int s, int n) {
    if (t - s == s) { return 1; }
    if (n == 0) { return 0; }
    if (memo[n][s] != -1) { return memo[n][s]; }

    memo[n][s] = topDown(memo, nums, t, s, n - 1) + topDown(memo, nums, t, s + nums[n - 1], n - 1);
    return memo[n][s];
  }

}
