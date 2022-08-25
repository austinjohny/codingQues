package com.austin.basics;
import java.util.*;

public class Patterns {

    public static void stairCase(int n){
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                if(i >= n - j - 1){
                    System.out.print("#");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       stairCase(4);
    }
}
