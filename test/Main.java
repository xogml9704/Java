package test;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		
		String x = "100";
		String y = "123450";
		String answer = "";
	      int[] xCount = new int[10];
	      for (int i = 0; i < x.length(); i++) {
	         xCount[x.charAt(i) - '0']++;
	      }

	      String ansStr = "";
	      for (int i = 0; i < y.length(); i++) {
	         if (xCount[y.charAt(i) - '0'] > 0) {
	            ansStr += y.charAt(i);
	            xCount[y.charAt(i) - '0']--;
	         }
	      }

	      if (ansStr == "")
	         answer = "-1";
	      else {
	         boolean isAllZero = true;
	         for (int i = 0; i < ansStr.length(); i++) {
	            if (ansStr.charAt(i) != '0') {
	               isAllZero = false;
	               break;
	            }
	         }
	         if (isAllZero){
	            answer = "0";
	            }
	         else {
	            char[] arr = ansStr.toCharArray();
	            Arrays.sort(arr);
	            String ans = arr.toString();
	            answer = ans;
	         }
	      }
	      System.out.println(answer);

	}
}
