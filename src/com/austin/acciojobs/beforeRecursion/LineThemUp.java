/*
An eccentric coach asks players on the team to line up alphabetically at the start of practice.
The coach does not tell the players whether they need to line up in increasing or decreasing order,
 so they guess. If they guess wrong, the coach makes them run laps before practice.

Given a list of names, you are to determine if the list is in increasing alphabetical order,
decreasing alphabetical order or neither.

You have to complete solve function which consist of array s of strings of size N as
input and returns string answer as output

Input Format
The input consists of a single test case. The first line will contain the number N of people on the team (2≤N≤20).
Following that are N lines, each containing the name of one person. A name will be at least 2 characters
and at most 12 characters in length and will consist only of capital letters, and with no white spaces
(sorry BILLY BOB and MARY JOE). Duplicates names will not be allowed on a team.

Output Format
Output a single word i.e. INCREASING if the list is in increasing alphabetical order,
DECREASING if it is in decreasing alphabetical order, and otherwise NEITHER.

    Example 1
    Input
    5
    JOE
    BOB
    ANDY
    AL
    ADAM

    Output
    DECREASING

Constraints
2 <= N <= 20

 */

package com.austin.acciojobs.beforeRecursion;

import java.util.Scanner;

public class LineThemUp {

    public static String checkOrder(String[] arr){
        int flag = 0;
        for(int i = 0;i<arr.length-1;i++){
            if(arr[i].compareTo(arr[i+1]) > 0){
                flag--;
            }
            else {
                flag++;
            }
        }
        if(flag == arr.length-1) {
            return "INCREASING";
        }
        else if(flag == -(arr.length-1)){
            return "DECREASING";
        }
        return "NEITHER";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] strArr = new String[n];
        for(int i = 0;i < n;i++){
            strArr[i] = sc.next();
        }
        String res = checkOrder(strArr);
        System.out.println(res);
    }
}
