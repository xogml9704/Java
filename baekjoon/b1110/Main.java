package baekjoon.b1110;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] arr = new String[2];
		String n = sc.nextLine();
		if(Integer.parseInt(n) < 10) {
			arr[0] = "0";
			arr[1] = n;
		} else {
			arr = n.split("");
		}
		int count = 1;
		while(true) {
			String tmp = arr[1];
			int a = Integer.parseInt(arr[0])+Integer.parseInt(arr[1]);
			if(a < 10) {
				arr[0] = "0";
				arr[1] = String.valueOf(a);
			} else {
				arr = String.valueOf(a).split("");
			}
			String b = tmp + arr[1];
			int c = Integer.parseInt(b);
			arr = b.split("");
			if(c == Integer.parseInt(n)) {
				break;
			} else {
				count++;
			}
		}
		System.out.println(count);
	}
}
