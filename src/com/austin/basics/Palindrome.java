package com.austin.basics;

import java.util.Scanner;

public class Palindrome {

    public static boolean checkPalindrome(int n){
        int rev = 0,temp = n;
        while(temp != 0){
            int lastDigit = temp % 10;
            rev = 10 * rev + lastDigit;
            temp /= 10;
        }
        if(rev == n)
            return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(checkPalindrome(num));
    }
}
