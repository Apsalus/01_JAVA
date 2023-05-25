package com.hw4.view;

import java.util.Scanner;

import com.hw4.controller.MemberController;

public class MemberMenu {

	private MemberController mc = new MemberController();
	protected Scanner sc = new Scanner(System.in);
	
	
	public void mainMenu() {
		int memberInput = 0;
		do {
			System.out.println("====== 회원 관리 메뉴 ======");
			System.out.println("1. 신규회원 등록 ");
			System.out.println("2. 회원 정보 검색 ");
			System.out.println("3. 회원 정보 수정 ");
			System.out.println("4. 회원 정보 삭제 ");
			System.out.println("5. 회원 전보 출력 ");
			System.out.println("6. 회원 정보 정렬 ");
			System.out.println("0. 프로그램 종료 ");
			System.out.print("메뉴 입력 >>> ");
			memberInput = sc.nextInt();
			sc.nextLine();
			
			switch(memberInput) {
			case 1: insertMember(); break;
			case 2: searchMember(); break;
			case 3: updateMember(); break;
			case 4: deleteMember(); break;
			case 5: printAllMember(); break;
			case 6: sortMember(); break;
			case 0: System.out.println("프로그램을 종료합니다"); break;
			default: System.out.println("잘못된 번호입니다 메뉴번호중에서 골라주세요");
			}
			
			
		}while(memberInput != 0);
	}
	public void insertMember() {
		// 1. 현재 회원 수(memberCount)가 최대 회원 수(SIZE)를 넘어설 경우 return 처리
		// 2. 아이디를 입력 받아 MemberController의 checkId() 메소드로 전달 >> 결과 값
		// 2_1. 결과 값이 null이 아닌 경우 즉, 동일한 아이디가 존재하는 경우
		//      "동일한 아이디가 존재합니다. 회원등록 실패" 출력
		// 2_2. 결과 값이 null인 경우 즉, 동일한 아이디가 존재하지 않는 경우
		//     나머지 회원 정보 입력 받도록(비밀번호, 이름, 나이, 성별, 이메일)
		//     입력 받은 정보를 Member의 매개변수 생성자를 이용하여 객체 생성 후
		//     MemberController의 insertMember() 메소드로 전달
		//     "성공적으로 회원 등록이 되었습니다." 출력
	}
	public void searchMember() {
	
	}
	public void updateMember() {
		
	}
	public void deleteMember() {
		
	}
	public void printAllMember() {
		
	}
	public void sortMember() {
		
	}
}
