package test;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] arr = new String[2][2];

        for(int i=0; i<2; i++) {
            arr[i] = sc.nextLine().split("");

            System.out.println(arr[i][0]);
            System.out.println(arr[i][1]);
        }

    }
}
