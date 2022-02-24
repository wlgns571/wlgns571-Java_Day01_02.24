package java_day04;

public class LoopFor {
	public static void main(String[] args) {
		
		System.out.println("반복문 시작 3");
		System.out.println("반복문 시작 2");
		System.out.println("반복문 시작 1");
		System.out.println("반복문 시작");

		// 반복문
		// for문 ( 초기화식, 조건식, 증감식 )
		for( int intVal = 0; intVal < 10; intVal++ ) {
			System.out.println(intVal);
		}
		
		/*
		 * 디버깅 모드
		 * 코드라인 좌측 행번호 부분을 더블클릭하면 breakpoint(초록점)이
		 * 생깁니다. Ctrl + shift + b ( breakpoint 단축키)
		 * 토클 형식이라 더블클릭 혹은 단축키로 생성/삭제 가능
		 * 코드를 한줄 한줄 실행해보며, 변수에 어떤 값이 담기는지 확인할때 주로 사용
		 * 상단 Run 버튼 좌측에 벌레모양의 아이콘을 클릭하면
		 * 디버깅 모드가 활성화.
		 * 디버깅 모드에서 적합한 화면 스타일(Perspective)로 전환
		 * 할거냐는 메시지 창이 뜬다.
		 * 오케이 하면 디버깅모드가 활성화 되어 현재 코드들이
		 * 위에서부터 실행되다가 breakpoint가 있는 지점에 멈추어 대기를 한다.
		 * 이후 상단의 Run - step over [단축키 F6] 을 실행하면
		 * 한줄한줄 실행이 된다.
		 * 디버깅 모드를 종료하려면 Terminate [단축키 Ctrl + F2]
		 * 이후 원래 화면으로 돌아오려면 우측 상단의 Perspective 버튼에서Java를 선택.
		 */
		
		// 실수로 Ctrl + Shift + F11 을 하면 Coverage 활성화
		// 코드 검사기능으로 작성을 잘 했으면 녹색, 못했으면 적색으로 표기
		// 각종 view들은 window -> show view 안에 다 들어있다.
		
		// 1부터 20까지 더하기
		int num = 0;
		for ( int i = 0; i <= 20; i++ ) {
			num += i;
		}
		System.out.println("1부터 20까지 더하면 " + num);
		
		for ( int i = 0; i < 10; i = i + 1 ) {
			System.out.println(i);
		}
		
		for ( int i = 0; i < 10; i += 1 ) {
			System.out.println(i);
		}
		
		for ( int i = 0; i < 10; i += 2 ) {
			System.out.println(i);
		}
		
		for ( double j = 0; j < 2; j += 0.2 ) {
			System.out.println(j);
			// 실수인 float과 double의 연산은 정확하지 않다.
			// 비추천한다.
		}
		
		// 구구단 1 ~ 9단
		// 2 x 1 = 2
		// 2 x 2 = 4
		// 2 x 3 = 6
		// 2 x 9 = 18
		
		for ( int i = 1; i <= 9; i++ ) {
			for ( int j = 2; j <= 9; j++ ) {
				System.out.print( j + " x " + i + " = " + (i*j) + "\t" );
			}
			System.out.println();
		}
		// 가끔 Console 창이 돌아다닐때,
		// 우측 상단 Perspective 버튼에서
		// Java Perspective 버튼 마우스 우클릭 reset클릭
		
		for ( int i = 0; i < 10; i++ ) {
			System.out.println(i);	
		}
		
		System.out.println("\n==============================\n");
		
		// 1부터 10까지중 홀수만 출력
		for ( int i = 1; i <= 10; i += 2) {
			System.out.println(i);
		}
	}
}
