package com.teamname.problem.bj.solving.src.main.java.com.teamname.problem.bj;

import java.util.Scanner;

public class test2439 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int N= sc.nextInt();

        for (int i=1; i<=N; i++){
            for (int j=1; j<=N-i; j++){
                System.out.print(" ");
            }
            for (int k=1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
