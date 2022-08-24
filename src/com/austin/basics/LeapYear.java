package com.austin.basics;
import java.util.*;

public class LeapYear {

    public static boolean check(int year){
        if(year % 4 == 0) {
            if (year % 100 == 0 && year % 400 != 0)
                return false;
            return true;
        }
        return false;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        System.out.println("The year "+year+" is leap year: "+check(year));
    }
}
