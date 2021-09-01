package test;

import java.util.Scanner;

public class PersonTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in) ;
		System.out.println("** 주민번호를 입력 하세요 => ");
		String no = sc.nextLine();  // 900909-1234567
		System.out.println("** 이름을 입력 하세요 => ");
		String name = sc.nextLine(); // 홍길동
		
		System.out.println("** 2000 년 이전 출생 **");
		// 성별구분 : 1 , 2
		Person p1 = new Person (no, name);
		p1.infoPrint();
		
		System.out.println("\n** 이름 변경 후 출력하기 **");
		p1.setName("김길동");
		p1.infoPrint();
		
		System.out.println("\n** 2000 년 이후 출생 **");
		// 성별구분 : 3 , 4
		Person p2 = new Person ("020202-4023456","홍길순");
		p2.infoPrint();
		sc.close();
 
	} // main
} // class
