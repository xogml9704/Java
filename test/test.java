package test;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int xy = 0;
        int count = 0;

        int t = Integer.parseInt(sc.nextLine());

        for(int i=0; i<t; i++) {
            int a = Integer.parseInt(sc.nextLine());
            String[][] arr = new String[a][a];
            for(int j=0; j<a; j++) {
                arr[j] = sc.nextLine().split("");
            }

            for(int j=0; j<arr.length; j++) {
                for(int k=0; k<arr.length; k++) {
                    if(arr[j][k] == "A") {
                        xy = 1;
                    } else if(arr[j][k] == "B") {
                        xy = 2;
                    } else if(arr[j][k] == "C") {
                        xy = 3;
                    }
                    for(int l=0; l<=xy; l++) {
                        if(arr[j-l][k] == "H") {
                            arr[j-l][k] = "X";
                        }
                        if(arr[j+l][k] == "H") {
                            arr[j+l][k] = "X";
                        }
                        if(arr[j][k-l] == "H") {
                            arr[j][k+l] = "X";
                        }
                        if(arr[j][k+l] == "H") {
                            arr[j][k-l] = "X";
                        }
                    }
                }
            }

            for(int j=0; j<arr.length; j++) {
                for(int k=0; k<arr.length; k++) {
                    if(arr[j][k] == "H") {
                        count++;
                    }
                }
            }

            System.out.println("#"+(i+1)+" "+count);
        }
    }
}
