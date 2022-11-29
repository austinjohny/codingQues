package com.austin.basics;

public class LCM {

    public static int naiveApproach(int num1,int num2){
        int res = Math.max(num1,num2);
        while(res%num1 != 0 || res%num2 != 0){
            res++;
        }
        return res;
    }

    public static int computeGCD(int a,int b){
        if(b == 0)
            return a;
        return computeGCD(b,a%b);
    }

    public static int bestApproach(int num1,int num2){          // here we compute GCD then
        return num1*num2/computeGCD(num1,num2);                 // a * b = LCM(a,b) * GCD(a,b)
    }

    public static void main(String[] args) {
        System.out.println(naiveApproach(7,13));
        System.out.println(bestApproach(7,13));
    }
}
