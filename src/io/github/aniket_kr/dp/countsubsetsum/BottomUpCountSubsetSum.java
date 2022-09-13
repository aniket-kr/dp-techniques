package io.github.aniket_kr.dp.countsubsetsum;

import java.util.Arrays;

public class BottomUpCountSubsetSum implements CountSubsetSum {

  @Override
  public int countSubsets(int[] nums, int targetSum) {
    assert targetSum >= 0;
    assert Arrays.stream(nums).filter(num -> num < 0).count() == 0;

    return bottomUp(nums, targetSum, nums.length);
  }

  private int bottomUp(int[] nums, int t, int n) {
    int[][] table = new int[n + 1][t + 1];
    for (int j = 0; j < t + 1; j++) { table[0][j] = 0; }
    table[0][0] = 1;

    for (int i = 1; i < n + 1; i++) {
      for (int j = 0; j < t + 1; j++) {
        int notIncludedCount = table[i - 1][j];
        if (nums[i - 1] <= j) {
          table[i][j] = table[i - 1][j - nums[i - 1]] + notIncludedCount;
        } else {
          table[i][j] = notIncludedCount;
        }
      }
    }

    return table[n][t];
  }

}
