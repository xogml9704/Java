package baekjoon.b1712;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] arr = sc.nextLine().split(" ");
		
		int a = Integer.parseInt(arr[0]);
		int b = Integer.parseInt(arr[1]);
		int c = Integer.parseInt(arr[2]);
		
		if(c <= b) {
			System.out.println("-1");
		} else {
			System.out.println((a/(c-b))+1);
		}
	}
}