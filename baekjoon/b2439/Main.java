package baekjoon.b2439;

public class Main {

	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			for(int j=5; j<i; j--) {
				System.out.print("");
			}
			for(int j=0; j<5; j++) {
				System.out.println("*");
			}
			System.out.println();
		}
	}

}
