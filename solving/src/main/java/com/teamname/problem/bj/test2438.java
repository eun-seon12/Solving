package com.teamname.problem.bj.solving.src.main.java.com.teamname.problem.bj;

import java.util.Scanner;

public class test2438 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int i,j;


    for (i=1; i<=N; i++){
        for (j=1;j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
    }
}
}