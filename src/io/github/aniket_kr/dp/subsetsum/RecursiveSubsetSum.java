package io.github.aniket_kr.dp.subsetsum;

public class RecursiveSubsetSum implements SubsetSum {

  @Override
  public boolean sumExists(int[] nums, int targetSum) {
    return recursive(nums, targetSum, nums.length);
  }

  private boolean recursive(int[] nums, int t, int n) {
    if (t == 0) { return true; }
    if (n == 0) { return false; }

    boolean notIncludedResult = recursive(nums, t, n - 1);
    if (nums[n - 1] <= t) {
      return recursive(nums, t - nums[n - 1], n - 1) || notIncludedResult;
    } else {
      return notIncludedResult;
    }
  }
}
