package com.niet.sd;
import java.util.Scanner;
public class Watch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int h,m,s;
        h = S/(3600);
        m = (S%3600)/60;
        s = ((S%3600)%60)/60;
        System.out.println(h);
        System.out.println(m);
        System.out.println(s);
    }
}
