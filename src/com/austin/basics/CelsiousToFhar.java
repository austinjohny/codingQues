package com.austin.basics;

import java.util.Scanner;

public class CelsiousToFhar{

    public static float conversionFun(float cel){
        return (cel*9/5)+32;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float cel = sc.nextFloat();
        System.out.println(conversionFun(cel));
    }
}