package com.niet.sd;
import java.util.*;
public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a , b, c;
        a = 0;
        b = 1;
        c = 1;
        if (N == 1) {
            System.out.println(1);
        }
         else {
            for (int i = 2; i <= N; i++) {
                c = a + b;
                a = b;
                b = c;
            }
        System.out.println(c);
    }
}
}
