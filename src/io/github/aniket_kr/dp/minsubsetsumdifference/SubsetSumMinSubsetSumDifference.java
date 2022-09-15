package io.github.aniket_kr.dp.minsubsetsumdifference;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SubsetSumMinSubsetSumDifference implements MinSubsetSumDifference {

  @Override
  public int minDifference(int[] nums) {
    assert nums.length > 0;

    int maxSum = Arrays.stream(nums).sum();
    boolean[] canSubsetSum = subsetSum(nums, maxSum, nums.length);

    return IntStream
      .range(0, canSubsetSum.length)
      .filter(num -> canSubsetSum[num])
      .reduce(maxSum, (minYet, num) -> Math.min(minYet, Math.abs(maxSum - 2*num)));
  }

  private boolean[] subsetSum(int[] nums, int t, int n) {
    boolean[][] table = new boolean[n + 1][t + 1];
    for (int j = 0; j < t + 1; j++) { table[0][j] = false; }
    for (int i = 0; i < n + 1; i++) { table[i][0] = true; }

    for (int i = 1; i < n + 1; i++) {
      for (int j = 1; j < t + 1; j++) {
        boolean notYetIncluded = table[i - 1][j];
        if (nums[i - 1] <= j) {
          table[i][j] = table[i - 1][j - nums[i - 1]] || notYetIncluded;
        } else {
          table[i][j] = notYetIncluded;
        }
      }
    }

    return table[n];
  }
}
