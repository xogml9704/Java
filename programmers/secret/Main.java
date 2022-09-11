package programmers.secret;

public class Main {
	public static void main(String[] args) {
		int n = 5;
		int[] arr1 = {9, 20, 28, 18, 11};
		int[] arr2 = {30, 1, 21, 17, 28};
		int[] number1Arr = new int[n];
		int[] number2Arr = new int[n];
		int[] reverse = new int[n];
		int[] reverse2 = new int[n];
		String[] output = new String[n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				number1Arr[j] = arr1[i] % 2;
				arr1[i] = arr1[i] / 2;
				number2Arr[j] = arr2[i] % 2;
				arr2[i] = arr2[i] / 2;
			}
			int a = 0;
			for(int j=n-1; j>=0; j--) {
				reverse[a] = number1Arr[j];
				reverse2[a] = number2Arr[j];
				a++;
			}
			String finish = "";
			for(int j=0; j<n; j++) {
				if(reverse[j] + reverse2[j] > 0) {
					finish += "#";
				} else {
					finish += " ";
				}
			}
			output[i] = finish;
		}
		
		for(int i=0; i<output.length; i++) {
			System.out.println(i+" | "+output[i]);
		}
	}
}
