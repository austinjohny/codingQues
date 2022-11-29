/*
Print a sequence of numbers starting with N where A[0] = N, without using loop, in which A[i+1] = A[i] - 5, until A[i] > 0. After that A[i+1] = A[i] + 5. Repeat it until A[i] = N.

Input Format
The first line of the input contains the integer N.

Output Format
Print the corresponding pattern.

Example 1
Input:

16
Output:

16 11 6 1 -4 1 6 11 16
Explanation:

The value decreases until it is greater than 0. After that, it increases and stops when it becomes 16 again.

Example 2
Input:

10
Output:

10 5 0 5 10
Explanation:

It follows the same logic as per the above example.

Constraints
1 ≤ N ≤ 10^4
 */

package com.austin.acciojobs.Recursion;

public class PrintPattern {
}
