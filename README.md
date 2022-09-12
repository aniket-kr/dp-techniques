# Dynamic Programming Techniques <!-- omit in toc -->
DP Techniques is a repo that houses all the code that was authored
by me when I was learning the dynamic programming techniques. The code
structure and content is heavily inspired by the
[Dynamic Programming](https://www.youtube.com/playlist?list=PL_z_8CaSLPWekqhdCPmFohncHwz8TY2Go)
YouTube series by **Aditya Verma**.

## Problems
| Sr No | Problem                                                                                            | Time Complexity | Space Complexity | Variables                                             |
| ----: | -------------------------------------------------------------------------------------------------- | --------------- | ---------------- | ----------------------------------------------------- |
|     1 | [Knapsack (Recursive)](/src/io/github/aniket_kr/dp/knapsack/RecursiveKnapsack.java)                | `O(2^n)`        | `O(1)`           | `n` = number of items                                 |
|     2 | [Knapsack (Top Down, Memoization)](/src/io/github/aniket_kr/dp/knapsack/TopDownKnapsack.java)      | `O(n*w)`        | `O(n*w)`         | `n` = number of items <br> `w` = capacity of knapsack |
|     3 | [Knapsack (Bottom Up, Tabulation)](/src/io/github/aniket_kr/dp/knapsack/BottomUpKnapsack.java)     | `O(n*w)`        | `O(n*w)`         | `n` = number of items <br> `w` = capacity of knapsack |
|     4 | [Subset Sum (Recursive)](/src/io/github/aniket_kr/dp/subsetsum/SubsetSum.java)                     | `O(2^n)`        | `O(1)`           | `n` = length of `nums[]`                              |
|     5 | [Subset Sum (Top Down, Memoization)](/src/io/github/aniket_kr/dp/subsetsum/TopDownSubsetSum.java)  | `O(n*t)`        | `O(n*t)`         | `n` = length of `nums[]` <br> `t` = target sum        |
|     6 | [Subset Sum (Bottom Up, Tabulation)](/src/io/github/aniket_kr/dp/subsetsum/BottomUpSubsetSum.java) | `O(n*t)`        | `O(n*t)`         | `n` = length of `nums[]` <br> `t` = target sum        |


---
Maintained with ❤️ by [Aniket Kumar](https://www.linkedin.com/in/aniket-kumarr/)
