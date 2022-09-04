package baekjoon.b10871;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");
        String[] number = sc.nextLine().split(" ");
        int[] last = new int[number.length];

        int[] arr2 = new int[arr.length];
        int[] number2 = new int[number.length];

        for(int i=0; i<arr.length; i++) {
            arr2[i] = Integer.parseInt(arr[i]);
        }

        for(int i=0; i<number.length; i++) {
            number2[i] = Integer.parseInt(number[i]);
        }
        int j = 0;
        
        for(int i=0; i<number2.length; i++) {
            if(number2[i] < arr2[1]) {
                last[j] = number2[i];
                j++;
            }
        }

        for(int i=0; i<last.length; i++) {
            if(last[i] == 0) {

            } else {
                System.out.print(last[i]+" ");
            }
        }

    }  
}
