package io.github.aniket_kr.dp.equalsumpartition;

import java.util.Arrays;

public class RecursiveEqualSumPartition implements EqualSumPartition {

  @Override
  public boolean canPartition(int[] nums) {
    int sum = Arrays.stream(nums).sum();
    if (sum % 2 != 0) { return false; }  // odd sum can't be split evenly
    return recursive(nums, sum, 0, nums.length);
  }

  private boolean recursive(int[] nums, int t, int s, int n) {
    if (t - s == s) { return true; }
    if (n == 0) { return false; }

    return recursive(nums, t, s, n - 1) || recursive(nums, t, s + nums[n - 1], n - 1);
  }
}
