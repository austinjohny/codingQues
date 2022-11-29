package com.austin.basics;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        int i = 0;
        for(i = 0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        int searchVal = sc.nextInt();
        for(i = 0;i < size;i++){
            if(searchVal == arr[i]) {
                break;
            }
        }
        if(i<size){
            System.out.println(i);
        }
        else{
            System.out.println("Not in array");
        }
    }
}
