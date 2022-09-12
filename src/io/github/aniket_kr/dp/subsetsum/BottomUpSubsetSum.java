package io.github.aniket_kr.dp.subsetsum;

public class BottomUpSubsetSum implements SubsetSum {

  @Override
  public boolean sumExists(int[] nums, int targetSum) {
    return bottomUp(nums, targetSum, nums.length);
  }

  private boolean bottomUp(int[] nums, int t, int n) {
    boolean[][] table = new boolean[n + 1][t + 1];
    for (int j = 0; j < t + 1; j++) { table[0][j] = false; }
    for (int i = 0; i < n + 1; i++) { table[i][0] = true; }  // order important

    for (int i = 1; i < n + 1; i++) {
      for (int j = 1; j < t + 1; j++) {
        boolean notIncludedResult = table[i - 1][j];
        if (nums[i - 1] <= j) {
          table[i][j] = table[i - 1][j - nums[i - 1]] || notIncludedResult;
        } else {
          table[i][j] = notIncludedResult;
        }
      }
    }

    return table[n][t];
  }

}
