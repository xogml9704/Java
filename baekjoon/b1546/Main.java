package baekjoon.b1546;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int subject = Integer.parseInt(sc.nextLine());
		String[] arr = new String[subject];
		int[] arr2 = new int[subject];
		
		arr = sc.nextLine().split(" ");
		
		for(int i=0; i<arr.length; i++) {
			arr2[i] = Integer.parseInt(arr[i]);
		}
		int M = arr2[0];
		for(int i=0; i<arr2.length; i++) {
			if(M < arr2[i]) {
				M = arr2[i];
			}
		}
		double sum = 0;
		for(int i=0; i<arr2.length; i++) {
			sum += (double) arr2[i] / M * 100;
		}
		
		System.out.println(sum / subject);
		
	}
}
