package com.niet.sd;
import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;
        int num = N;
        while (num>0){
            int d = num%10;
            sum+=(d*d*d);
            num/=10;
        }
        if(sum == N){
        System.out.println("Yes");

        }
        else {
            System.out.println("No");
        }
    }
}
