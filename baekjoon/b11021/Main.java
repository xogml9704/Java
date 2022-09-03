package baekjoon.b11021;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = Integer.parseInt(sc.nextLine());
		
		String[] arr = new String[2];
		int[] arr2 = new int[t];
		
		for(int i=0; i < t; i++) {
			arr = sc.nextLine().split(" ");
			arr2[i] = Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]);
		}
		
		for(int i=0; i<arr2.length; i++) {
			System.out.println("Case #"+ (i+1) + ": " + arr2[i]);
		}
	}
}
