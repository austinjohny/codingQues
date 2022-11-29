package com.austin.basics;

public class GCD {

    public static int naiveApproach(int a,int b){           // T.C O(n)
        int res = a > b ? b : a;
        while(res > 0){
            if(a % res == 0 && b % res == 0){
                break;
            }
            res--;
        }
        return res;
    }

    public static int betterApproach(int num1,int num2){    // euclidean approach
        while(num1 != num2){                                // GCD(a,b) = GCD(a-b,b) if a > b
            if(num1 > num2)                                 // otherwise value will be -ne
                num1 -= num2;
            else
                num2 -= num1;
        }
        return num1;
    }

    public static int bestApproach(int num1,int num2){   // optimized euclidean method
        if(num2 == 0)
            return num1;
        return betterApproach(num2,num1 % num2);        // check that num2 is written first
    }

    public static void main(String[] args) {
        System.out.println(bestApproach(13,7));
    }
}
