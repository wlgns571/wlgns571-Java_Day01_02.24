package java_day04;

import java.util.Scanner;

public class Conditional_Test1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력해주세요 : ");
		String name = sc.nextLine();
		
		System.out.print("연락처를 \"-\"없이 입력해주세요 : ");
		String phone = sc.nextLine();
		
		System.out.print("나이를 입력해주세요 : ");
		String age = sc.nextLine();
		
		if ( ( name.length() > 0 ) 
				&& ( phone.length() == 11 || phone.length() == 10 ) 
				&& ( Integer.parseInt(age) >= 14 ) ) {
			System.out.println("회원가입 버튼이 활성화 됩니다.");
		} else {
			System.out.println("회원가입 불가");
		}
	}
}
