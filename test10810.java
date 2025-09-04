package com.teamname.problem.bj.solving.src.main.java.com.teamname.problem.bj;

import java.util.Scanner;

class test10810 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] g = new int[n];
        for(int i = 0; i < m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            for(int j = a; j <= b; j++){
                g[j-1] = c;
            }
        }

        for(int k = 0; k < n; k++){
            System.out.print(g[k]+" ");
        }
    }
}
