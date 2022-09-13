# Dynamic Programming Techniques <!-- omit in toc -->
DP Techniques is a repo that houses all the code that was authored
by me when I was learning the dynamic programming techniques. The code
structure and content is heavily inspired by the
[Dynamic Programming](https://www.youtube.com/playlist?list=PL_z_8CaSLPWekqhdCPmFohncHwz8TY2Go)
YouTube series by **Aditya Verma**.

## Problems
| Sr No | Problem                                                                                                                                             | Time Complexity | Space Complexity | Variables                                             |
| ----: | --------------------------------------------------------------------------------------------------------------------------------------------------- | --------------- | ---------------- | ----------------------------------------------------- |
|     1 | [Knapsack <br> (Recursive)](/src/io/github/aniket_kr/dp/knapsack/RecursiveKnapsack.java)                                                            | `O(2^n)`        | `O(n)`           | `n` = number of items                                 |
|     2 | [Knapsack <br> (Top Down, Memoization)](/src/io/github/aniket_kr/dp/knapsack/TopDownKnapsack.java)                                                  | `O(n*w)`        | `O(n*w)`         | `n` = number of items <br> `w` = capacity of knapsack |
|     3 | [Knapsack <br> (Bottom Up, Tabulation)](/src/io/github/aniket_kr/dp/knapsack/BottomUpKnapsack.java)                                                 | `O(n*w)`        | `O(n*w)`         | `n` = number of items <br> `w` = capacity of knapsack |
|     4 | [Subset Sum <br> (Recursive)](/src/io/github/aniket_kr/dp/subsetsum/SubsetSum.java)                                                                 | `O(2^n)`        | `O(n)`           | `n` = length of `nums[]`                              |
|     5 | [Subset Sum <br> (Top Down, Memoization)](/src/io/github/aniket_kr/dp/subsetsum/TopDownSubsetSum.java)                                              | `O(n*t)`        | `O(n*t)`         | `n` = length of `nums[]` <br> `t` = target sum        |
|     6 | [Subset Sum <br> (Bottom Up, Tabulation)](/src/io/github/aniket_kr/dp/subsetsum/BottomUpSubsetSum.java)                                             | `O(n*t)`        | `O(n*t)`         | `n` = length of `nums[]` <br> `t` = target sum        |
|     7 | [Equal Sum Partition <br> (Recursive)](/src/io/github/aniket_kr/dp/equalsumpartition/RecursiveEqualSumPartition.java)                               | `O(2^n)`        | `O(n)`           | `n` = length of `nums[]`                              |
|     8 | [Equal Sum Partition <br> (Top Down, Memoization)](/src/io/github/aniket_kr/dp/equalsumpartition/TopDownEqualSumPartition.java)                     | `O(n*s)`        | `O(n*s)`         | `n` = length of `nums[]` <br> `s` = sum of subset     |
|     9 | [**INCOMPLETE** <br> Equal Sum Partition <br> (Top Down, Tabulation)](/src/io/github/aniket_kr/dp/equalsumpartition/BottomUpEqualSumPartition.java) | -               | -                | -                                                     |
|    10 | [Equal Sum Partition <br> (via Subset Sum)](/src/io/github/aniket_kr/dp/equalsumpartition/SubsetSumEqualSumPartition.java)                          | `O(n*s)`        | `O(n*s)`         | `n` = length of `nums[]` <br> `s` = sum of subset     |
|    11 | [Count Subset Sum <br> (Recursive)](/src/io/github/aniket_kr/dp/countsubsetsum/RecursiveCountSubsetSum.java)                                        | `O(2^n)`        | `O(n)`           | `n` = length of `nums[]`                              |
|    12 | [Count Subset Sum <br> (Top Down, Memoization)](/src/io/github/aniket_kr/dp/countsubsetsum/TopDownCountSubsetSum.java)                              | `O(n*s)`        | `O(n*s)`         | `n` = length of `nums[]` <br> `s` = target sum        |
|    13 | [Count Subset Sum <br> (Bottom Up, Tabulation)](/src/io/github/aniket_kr/dp/countsubsetsum/BottomUpCountSubsetSum.java)                             | `O(n*s)`        | `O(n*s)`         | `n` = length of `nums[]` <br> `s` = target sum        |


---
Maintained with ❤️ by [Aniket Kumar](https://www.linkedin.com/in/aniket-kumarr/)
