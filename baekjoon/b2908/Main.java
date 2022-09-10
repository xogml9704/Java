package baekjoon.b2908;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] arr = sc.nextLine().split(" ");
		
		String[] arr1 = arr[0].split("");
		String[] arr2 = arr[1].split("");
		String a = "";
		String b = "";
		
		for(int i=0; i<arr1.length; i++) {
			a += arr1[2-i];
			b += arr2[2-i];
		}
		if (Integer.parseInt(a) < Integer.parseInt(b)) {
			System.out.println(b);
		} else {
			System.out.println(a);
		}
	}
}
