package ZZJava_Game;

import java.util.Scanner;
//조용한 곳 찾기 알고리즘 코드 

public class algotest02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt(); // X좌표
		int b = sc.nextInt(); // Y좌표
		
		int R = sc.nextInt(); // 공사 현장의 소음의 크기
		
		int N = sc.nextInt(); // 나무 그늘의 수
	
		int far[] = new int[N]; 

		for (int i = 0; i < N; i++) {
			int N_x = sc.nextInt(); //그늘을 나타내는 X좌표
			int N_y = sc.nextInt(); //그늘을 나타내는 Y좌표

			far[i] = (int) ((Math.pow((N_x - a),2)) + (Math.pow((N_y - b),2))); 
			//(x-a)^2 + (y-b)^2 

			if (far[i] < (int)(Math.pow(R, 2))) { //(R)^2
				System.out.println("noisy");
			} 
			else {
				System.out.println("silent");
			}
		}
	}
}



