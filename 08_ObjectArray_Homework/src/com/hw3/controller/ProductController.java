package com.hw3.controller;

import java.util.Scanner;

import com.hw3.model.vo.Product;

public class ProductController {

	private Product[] pro = null;
	// 초기화 블럭을 이용하여 10개의 Product 배열 크기 할당
	{
		pro = new Product[10];
	}
	public static int count;
	
	Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		// 메뉴 출력 --> do~while 문으로 반복 실행 처리함
		int input = 0;
		do {
			System.out.println("===== 제품 관리 메뉴 =====");
			System.out.println("1 제품 정보 추가");
			System.out.println("2 제품 전체 조회");
			System.out.println("0 프로그램 종료");
			
			System.out.print("메뉴 입력 >>> ");
			input = sc.nextInt();
			sc.nextLine();
			switch(input) {
			case 1 : productInput(); break;
			case 2 : productPrint(); break;
			case 0 : System.out.println("프로그램을 종료합니다"); break;
			default : System.out.println("1~3까지의 숫자만 입력해 주세요");
			}
			
		} while(input != 0);
	}
	
	
	
	public void productInput() {
		// 키보드로 도서 정보를 입력 받아 객체 생성
		// -> Product 생성자 내부에서 ProductController의 count 클래스 변수 값이 1씩 증가
		System.out.println("***제품 정보 추가***");
		
		// 배열에 남은 공간이 없을 경우
		if(pro[9] != null) {
			System.out.println("제품 정보 저장 실패(저장 공간 부족)");
		}
		System.out.print("제품번호 : ");
		int pId = sc.nextInt();
		System.out.print("제품명 : ");
		
		String pName = sc.next();
		System.out.print("제품 가격 : ");
		int price = sc.nextInt();
		System.out.print("제품 세금 : ");
		double tax = sc.nextDouble();
		
		
		for(int i = 0; i < pro.length; i++) {
			if(pro[i] == null) {
				pro[i] = new Product(pId, pName, price, tax);
				
				break;
			}
		}
		
//		pro[count] = new Product(pId, pName, price, tax);
		System.out.println("제품 정보 저장 성공");
			
		
		
		// 현재 카운트 인덱스에 생성한 주소 저장
	}
	
	public void productPrint() {
		for(int i = 0; i < pro.length; i++) {
			System.out.println(pro[i].information());
		}
	}
}
				
			
						
				
				
