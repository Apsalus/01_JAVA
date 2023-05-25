package com.hw3.run;

import com.hw3.model.vo.Product;

public class Run {

	public static void main(String[] args) {
		// 초기값을 부여한 두개의 객체 생성
		Product pro = new Product("Samsung", "Galaxy S9", "Blue", 960000);
		Product pro2 = new Product("LG", "G6", "Red", 820000);
		
		// 1. 두 객체의 정보 출력 처리 : toString() 사용
		System.out.println("생성한 첫 번째 객체의 값 : " + pro.toString());
		System.out.println("생성한 두 번째 객체의 값 : " + pro2.toString());
		System.out.println("===================================================================");
	
		// 2. 두 객체의 값이 일치하는지 결과 출력 처리 : equals() 사용
		System.out.println(pro.equals(pro2));
		System.out.println("===================================================================");
		
		// 3. 두 객체의 해쉬코드값 출력 : hashCode() 사용
		System.out.println(pro.hashCode());
		System.out.println(pro2.hashCode());
		System.out.println("===================================================================");
	}

}
