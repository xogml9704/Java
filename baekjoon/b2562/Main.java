package baekjoon.b2562;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[9];
		
		for(int i=0; i<a.length; i++) {
			a[i] = Integer.parseInt(sc.nextLine());
		}
		
		int max = a[0];
		for(int i=0; i<a.length; i++) {
			if(max < a[i]) {
				max = a[i];
			}
		}
		int count = 0;
		for(int i=0; i<a.length; i++) {
			count++;
			if(max == a[i]) {
				break;
			}
		}
		System.out.println(max);
		System.out.println(count);
		
	}
}
