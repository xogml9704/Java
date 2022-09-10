package baekjoon.b1157;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		char[] arr = new char[a.length()];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = a.charAt(i);
			if(arr[i] >= 'a' && arr[i] <= 'z') {
				arr[i] -= 32;
			}
		}
		int[] count = new int[26];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<26; j++) {
				if(arr[i] == 'A'+j) {
					count[j]++;
					break;
				}
			}
		}
		int max = 0;
		char finish = 0;
		for(int i=0; i<count.length; i++) {
			if(max < count[i]) {
				max = count[i];
				finish = (char) ('A'+i);
				
			} else if(max == count[i]) {
				finish = '?';
			}
		}
		System.out.println(finish);
	}
}
