package com.austin.basics;

import java.util.Scanner;

public class TrailngZerosOfFactorial {

    public static int findTrailingZeros(int n){
        int temp = n,totalCount = 0,i = 1,count = 1;
        /* first approach */
        while(count != 0){
            count = (int) (temp / Math.pow(5,i));
            totalCount += count;
            i++;
        }
        /* second approach */
        totalCount = 0;
        for(i = 5;i <= n;i = i * 5)
            totalCount += n/i;

        return totalCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int zerosCount = findTrailingZeros(num);
        System.out.println(zerosCount);
    }
}
