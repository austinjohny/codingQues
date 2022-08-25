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
    public static void star(int n){
        if(n%2 == 0){
            System.out.println("Can't be a star");
            return;
        }
        for(int i = 0; i < n;i++){
            for(int j = 0;j<n;j++){
                if(i <= n/2){
                    if(j >= n/2 -i && j <= n/2 +i){
                        System.out.print("#");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                else{
                    if(j >= (n/2 - (n-1-i)) && j <= (n/2 + (n-1-i))){
                        System.out.print("#");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
//       stairCase(4);
        star(11);
    }
}
