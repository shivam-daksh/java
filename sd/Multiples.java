package com.niet.sd;
import java.util.*;
public class Multiples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int mul3 = 0, mul5 = 0, total=0;
        for(int i = 1; i<=N; i++){
            if(i%3==0){
                mul3++;
            }
            if(i%5==0){
                mul5++;
            }
        }
        total = mul5+mul3;
        System.out.println(total);

    }
}
