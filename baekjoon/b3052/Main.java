package baekjoon.b3052;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		
		for (int i=0; i<10; i++) {
			int a = Integer.parseInt(sc.nextLine());
			arr[i] = a % 42;
		}
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					break;
				}
			}
		}
		System.out.println(arr.length - count);
				
	}
}
