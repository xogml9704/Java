package baekjoon.b2675;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = Integer.parseInt(sc.nextLine());
		String[] arr = new String[2];
		
		for(int i=0; i<t; i++) {
			String sum = "";
			arr = sc.nextLine().split(" ");
			int repeat = Integer.parseInt(arr[0]);
			String[] word = new String[arr[1].length()];
			word = arr[1].split("");
			for(int j=0; j<word.length; j++) {
				for(int k=0; k<repeat; k++) {
					sum += word[j];
				}
			}
			System.out.println(sum);
		}
	}
}

