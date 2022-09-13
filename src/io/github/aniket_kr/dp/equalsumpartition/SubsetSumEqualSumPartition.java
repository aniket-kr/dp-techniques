package io.github.aniket_kr.dp.equalsumpartition;

import java.util.Arrays;

import io.github.aniket_kr.dp.subsetsum.BottomUpSubsetSum;

public class SubsetSumEqualSumPartition implements EqualSumPartition {

  @Override
  public boolean canPartition(int[] nums) {
    int sum = Arrays.stream(nums).sum();
    // odd sum can't be equally partitioned
    if (sum % 2 != 0) { return false; }

    // if a subset with sum `sum / 2` exists, then the remaining elements
    // not included in this subset will also sum up to `sum / 2`. Therefore,
    // the problem is not reduced to finding a subset with sum `sum / 2`.
    return new BottomUpSubsetSum().sumExists(nums, sum / 2);
  }
}
