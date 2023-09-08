package com.niet.sd;
import java.util.*;
public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        int a,b;
        a = Integer.parseInt(s[0]);
        b = Integer.parseInt(s[1]);
        int area = a*b;
        int peri = 2*(a+b);
        System.out.println(area+ " " + peri);
    }
}
