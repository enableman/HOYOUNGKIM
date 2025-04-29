package test1;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

        // 사용자로부터 첫 번째 숫자 입력 받기
        System.out.print("첫 번째 숫자를 입력하세요: ");
        int num1 = scan.nextInt();

        // 사용자로부터 두 번째 숫자 입력 받기
        System.out.print("두 번째 숫자를 입력하세요: ");
        int num2 = scan.nextInt();

        // 두 숫자의 합 계산
        int sum = num1 + num2;

        // 결과 출력
        System.out.println("두 숫자의 합: " + sum); 
        
        scan.close();

	}

}

