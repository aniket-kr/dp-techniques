package io.github.aniket_kr.dp.countsubsetsum;

import java.util.Arrays;

public class RecursiveCountSubsetSum implements CountSubsetSum {

  @Override
  public int countSubsets(int[] nums, int targetSum) {
    assert targetSum > 0; // does not work for 0 yet
    assert Arrays.stream(nums).filter(num -> num <= 0).count() == 0;

    return recursive(nums, targetSum, nums.length);
  }

  private int recursive(int[] nums, int t, int n) {
    if (t == 0) { return 1; }
    if (n == 0) { return 0; }

    int notIncludedCount = recursive(nums, t, n - 1);
    if (nums[n - 1] <= t) {
      return recursive(nums, t - nums[n - 1], n - 1) + notIncludedCount;
    } else {
      return notIncludedCount;
    }
  }
}
