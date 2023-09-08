package com.niet.sd;
import java.util.Scanner;
public class Sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] ar = sc.nextLine().split(" ");
        int a = Integer.parseInt(ar[0]);
        int b = Integer.parseInt(ar[1]);
        int c = Integer.parseInt(ar[2]);
        String[] arr = new String[3];

        if(a<c && b<c){
            if(a<b){
                arr[0] = Integer.toString(a);
                arr[1] = Integer.toString(b);
                arr[2] = Integer.toString(c);
            }
            else {
                arr[0] = Integer.toString(b);
                arr[1] = Integer.toString(a);
                arr[2] = Integer.toString(c);
            }
        }
        else if (a>c && b>c){
            if(a<b) {
                arr[0] = Integer.toString(c);
                arr[1] = Integer.toString(a);
                arr[2] = Integer.toString(b);
            }
            else {
                arr[0] = Integer.toString(c);
                arr[1] = Integer.toString(b);
                arr[2] = Integer.toString(a);
            }
        }
        String result = String.join(" ", arr);
        System.out.println(result);

    }
}
