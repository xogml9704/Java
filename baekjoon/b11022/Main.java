package baekjoon.b11022;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = Integer.parseInt(sc.nextLine());
		
		String[] arr = new String[2];
		int[] arr2 = new int[t];
		int[] arr3 = new int[t];
		int[] arr4 = new int[t];
		
		for(int i=0; i < t; i++) {
			arr = sc.nextLine().split(" ");
			arr2[i] = Integer.parseInt(arr[0]);
			arr3[i] = Integer.parseInt(arr[1]);
			arr4[i] = arr2[i] + arr3[i];
		}
		
		for(int i=0; i<arr2.length; i++) {
			System.out.println("Case #"+(i+1)+": "+arr2[i]+" + "+arr3[i]+" = "+arr4[i]);
		}
	}
}
