package ZZJava_Game;

import java.util.Scanner;

public class algotest01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n == 0) {
			System.out.print("다시");
		} 
		else {
			
			System.out.println(n);
			String a = sc.next();
			String b = sc.next();

			System.out.print("hello " + a + ", ");
			System.out.print(b + ".");

		}

	}

}
