package java_day04;

import java.util.Scanner;

public class Conditional_Test2 {
	public static void main(String[] args) {
		// 사용자로부터 국어, 영어, 수학 점수를 각각
		// 입력받아 평균점수를 구하고, 등급을 출력하시오.
		// 평균점수가 90점 이상이면 A, 80점 이상은 B,
		// 70점 이상 C, 나머지 D
		
		// 사용자로부터 입력받을 점수들
		// 점수들을 int로 변환하여 세 과목을 더하고 나누기 3
		// if문을 사용하여 등급을 출력.
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		double avg = 0;
		
		System.out.print("국어 : ");
		int guk = sc.nextInt();
		
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		sum = guk + eng + math;
		avg = sum / 3.0;
		
		System.out.println("평균 : " + avg);
		
		int result = (int) Math.round(avg);
		System.out.println("반올림한 값 : " + result);
		
		if ( result >= 90 ) {
			System.out.println("A등급");
		} else if ( result >= 80 ) {
			System.out.println("B등급");
		} else if ( result >= 70 ) {
			System.out.println("C등급");
		} else {
			System.out.println("D등급");
		}
	}
}
