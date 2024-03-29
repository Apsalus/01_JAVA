package edu.kh.oop.cls.model.service;

import java.util.Scanner;
import edu.kh.oop.cls.model.vo.Student;
import edu.kh.oop.cls.model.vo.User;
import edu.kh.oop.cls.model.vo.Webtoon;

public class ClsService {
	// 클래스 접근제한자 확인하기

	public void ex1() {
		Student std = new Student(); 
		// public class인 Student는 import 가능

		//TestVo test = new TestVO();
		// (default) class인 TestVO는 import 불가 (다른패키지 여서)

		System.out.println(std.v1);
		// 다른 패키지에서도 접근 가능한 public만 에러가 없다
	}

	public void ex2() {
		// static 필드 확인 예제

		Student std1 = new Student();		// std1의 경우 인스턴스를 담았지만 지역변수이다.
		Student std2 = new Student();

		System.out.println("std1.schoolName : " + std1.schoolName);
		// public 이기 때문에 직접 가능
		//System.out.println(std1.name); //name이 private라서 접근x

		System.out.println();
		System.out.println("name 수정 전 : " + std1.getName());

		std1.setName("김정욱");
		System.out.println("name 수정 후 : " + std1.getName());

		System.out.println();
		System.out.println("std2.schoolName : " + std2.schoolName);
		// public 이기 때문에 직접 가능

		System.out.println();
		std1.schoolName = "KH고등학교";
		System.out.println("std1에서 scnm 수정 후");
		System.out.println("std1.scnm : " + std1.schoolName);
		System.out.println("std2.scnm : " + std2.schoolName);

		System.out.println();
		Student.schoolName = "KH";
		System.out.println(Student.schoolName);

		/* static
		 * 
		 * 1) 공유 메모리 영역( 또는 정적 메모리 영역) 이라고 함
		 * 
		 * => 프로그램 시작 시 static이 붙은 코드들이
		 * 모두 staic 영역에 생성되고,
		 * 프로그램이 종료될 때까지 사라지지 않음. (정적)
		 * 그리고 static 영역에 생성된 변수는 어디서든 공유가능(공유)
		 * 
		 * 2) 사용법 : 클래스명.변수명
		 * 
		 */
	}

	public void ex3() {
		// 생성자 확인 테스트

		//Student s1 = new Student();
					// 기본 생성자

		// User 기본 생성자를 이용해서 객체 생성
		User u1 = new User();

		// User 객체 필드 초기화 확인
		//System.out.println(u1.getName);
		// ==> 클래스에서 메서드에 getter/setter 가 없으므로
		// 간접 접근 불가능

		System.out.println(u1.getUserId());
		System.out.println(u1.getUserPw());
		System.out.println(u1.getUserName());
		System.out.println(u1.getUserAge());
		System.out.println(u1.getUserGender());

		User u2 = new User();
		System.out.println(u2.getUserId());
		System.out.println(u2.getUserPw());
		System.out.println(u2.getUserName());
		System.out.println(u2.getUserAge());
		System.out.println(u2.getUserGender());

		System.out.println("====================");

		// 문제점 : u1이 참조하고 있는 User 객체와
		//		  u2가 참조하고 있는 User 객체가 필드의 값이 모두 동일함.
		//		  같은 기본생성자로 User객체 생성했기 때문에...

		// 해결 방법 1 : setter를 이용해서 새로운 값을 대입

		u2.setUserId("asdf123");
		u2.setUserPw("a1234");
		u2.setUserName("김담희");
		u2.setUserAge(27);
		u2.setUserGender('F');

		System.out.println(u2.getUserId());
		System.out.println(u2.getUserPw());
		System.out.println(u2.getUserName());
		System.out.println(u2.getUserAge());
		System.out.println(u2.getUserGender());

		// 해결 방법 2 : user 클래스에서 진행

		System.out.println("=================");
		User u3 = new User("test", "pw1234");
		System.out.println(u3.getUserId());
		System.out.println(u3.getUserPw());
		System.out.println(u3.getUserName());
		System.out.println(u3.getUserAge());
		System.out.println(u3.getUserGender());

		System.out.println("=================");
		User u4 = new User("test4", "pw4444");
		System.out.println(u4.getUserId());
		System.out.println(u4.getUserPw());
		System.out.println(u4.getUserName());
		System.out.println(u4.getUserAge());
		System.out.println(u4.getUserGender());

	}

	public void test() {
		Scanner sc = new Scanner(System.in);

		Webtoon test = new Webtoon();

		System.out.print(test.getName() + " : ");
		String inputName = sc.nextLine();
		test.setName(inputName);

		System.out.print(test.getSite() + " : ");
		String inputSite = sc.nextLine();
		test.setSite(inputSite);

		System.out.print(test.getDay() + " : ");
		String inputDay = sc.nextLine();
		if(inputDay.length() == 1) {
			inputDay += "요일";
		}
		test.setDay(inputDay);

		System.out.print(test.getGenre() + " : ");
		String inputGenre = sc.nextLine();
		test.setGenre(inputGenre);

		System.out.println("========================");
		System.out.printf("\"%s\"는(은) \"%s\"에서 \"%s\"에 연재되는 \"%s\"장르의 웹툰 입니다.", 
				test.getName(), test.getSite(), test.getDay(), test.getGenre());
	}
}