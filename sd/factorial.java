package com.niet.sd;
import java.util.*;
public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int fact =1;
        for (int i = N; i>=1; i--){
            fact*=i;
        }
        System.out.println(fact);
    }
}
