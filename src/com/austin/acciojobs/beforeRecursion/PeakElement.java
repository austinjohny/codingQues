/*
An element is called a peak element if its value is not smaller than the value of its adjacent elements(if they
exists).
For first and last element consider only the element next to it.
Given an array arr[] of size n, find the index of first peak element.
If peak element does not exist print -1.

Input Format
Input consists of two lines.
First line contains an integer n.
Next line contains n spaced integers.

Output Format
Return the index of the peak element in zero based indexing if present, else return -1

    Example 1
    Input
    4
    5 10 20 15

    Output
    2

    Explanation
    20 is greater than both of its neighbours. Hence 20 is the peak element, So output is 2

    Example 2
    Input
    7
    10 20 15 2 23 64 67

    Output
    1

    Explanation
    20 is greater than both of its neighbors. Hence 20 is the peak element, So output is 1

Constraints
1<=n<=10^6

1<=arr[i]<=10^6
 */

package com.austin.acciojobs.beforeRecursion;

public class PeakElement {
}
