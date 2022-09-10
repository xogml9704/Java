package baekjoon.b10818;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = Integer.parseInt(sc.nextLine());
		
		String[] a = new String[N];
		a = sc.nextLine().split(" ");
		int[] b = new int[N];
		
		for(int i=0; i<a.length; i++) {
			b[i] = Integer.parseInt(a[i]);
		}
		
		
		int max = b[0];
		int min = b[0];
		
		for(int i=0; i<b.length; i++) {
			if(max < b[i]) {
				max = b[i];
			}
			if(min > b[i]) {
				min = b[i];
			}
		}
		System.out.printf("%d %d",min, max);
	}
}
