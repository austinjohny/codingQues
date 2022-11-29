package com.austin.basics;

public class PrimeNosTillN {

    public static boolean checkPrime(int num){
        if(num == 1)
            return false;
        for(int i = 2;i*i<=num;i++){
            if(num % i == 0)
                return false;
        }
        return true;
    }

    public static void printPrime(int lastNum){
        for(int i = 2;i<=lastNum;i++){
            if(checkPrime(i))
                System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void printPrimeWithEndPoints(int firstNum,int lastNum){
        for(int i = firstNum;i<=lastNum;i++){
            if(checkPrime(i))
                System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void sieveOfEratrosthenes(int lastNum){
        boolean tempArr[] = new boolean[lastNum+1];
        for(int i = 0;i< tempArr.length;i++){
            tempArr[i] = true;
        }
        for(int i = 2;i * i< tempArr.length;i++){
            if(checkPrime(i)){
                for(int j = i*i;j< tempArr.length;j=j+i){
                    tempArr[j] = false;
                }
            }
        }
        for(int i = 2;i< tempArr.length;i++){
            if(tempArr[i])
                System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
//        printPrime(100);
//        printPrimeWithEndPoints(30,40);
//        sieveOfEratrosthenes(50);
        System.out.println(checkPrime(49));
    }
}
