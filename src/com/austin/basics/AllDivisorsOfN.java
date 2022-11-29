package com.austin.basics;

public class AllDivisorsOfN {

    public static void naiveApproach(int num){
        int temp = 1;
        while(temp <= num){
            if(num%temp == 0)
                System.out.print(temp+" ");
            temp++;
        }
    }

    public static void betterApproach(int num){         // T.C = O(sqrt(n))
        int i = 1;                                      // but result will not be sorted
        while(i*i <= num){
            if(num%i == 0) {
                System.out.print(i + " ");

                if (i != num / i) {
                    System.out.print(num / i + " ");
                }
            }
            i++;
        }
    }

    public static void bestApproach(int num){       // here approach is same but will be in sorted order
        int i = 1;
        while(i*i <= num){
            if(num % i == 0)
                System.out.print(i+" ");
            i++;
        }
        while(i >= 1){
            if(num % i == 0){
                if(i != num/i){
                System.out.print(num/i +" ");
                }
            }
            i--;
        }
    }

    public static void main(String[] args) {
        naiveApproach(2000);
        System.out.println();
        betterApproach(2000);
        System.out.println();
        bestApproach(200);
    }
}
