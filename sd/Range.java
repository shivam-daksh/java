package com.niet.sd;
import java.util.*;
public class Range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] ar = sc.nextLine().split(" ");
        int a = Integer.parseInt(ar[0]);
        int b = Integer.parseInt(ar[1]);
        int c = Integer.parseInt(ar[2]);
        if(a<c){
            if(b<c){
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
        }
        else {
            System.out.println("No");
        }

    }
}
