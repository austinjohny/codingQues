package com.austin.basics;

import java.util.Scanner;

public class Calculator {

    public static int product(int num1,int num2){
        return num1*num2;
    }
    public static int sum(int num1,int num2){
        return num1+num2;
    }
    public static int sub(int num1,int num2){
        return num1-num2;
    }
    public static int divide(int num1,int num2){
        return num1/num2;
    }
    public static int rem(int num1,int num2){
        return num1%num2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        int n1 = sc.nextInt(),n2 = sc.nextInt();
        switch (ch){
            case '+':
                System.out.println(sum(n1,n2));
                break;
            case '-':
                System.out.println(sub(n1,n2));
                break;
            case '/':
                System.out.println(divide(n1,n2));
                break;
            case '*':
                System.out.println(product(n1,n2));
                break;
            case '%':
                System.out.println(rem(n1,n2));
                break;
            default:
                System.out.println("Invalid expression");
        }
    }
}
