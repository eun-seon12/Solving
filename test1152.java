package com.teamname.problem.bj.solving.src.main.java.com.teamname.problem.bj;

import java.util.Scanner;
import java.util.StringTokenizer;

public class test1152 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StringTokenizer st = new StringTokenizer(sc.nextLine());
        int count = 0;
        while (st.hasMoreTokens()) {
            st.nextToken();
            count++;
        }
        System.out.println(count);
    }
}
