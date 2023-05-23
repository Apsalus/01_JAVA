package edu.kh.array2.practice.service;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeService {

	Scanner sc = new Scanner(System.in);
	
	public void practice7() {
		String[] students = {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배",
							"송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"};
		
		// 3행 2열 짜리 2차원 문자열 배열 2개를 새로 선언 및 할당하여
		// 학생 이름을 2차원 배열에 순서대로 저장하고 아래와 같이 출력하시오
		// (첫 번째 2차원 배열이 모두 저장된 경우 두 번째 2차원 배열에 저장 진행)
		
		String[][] student = {
				{"강건강", "남나나"}, 
				{"도대담", "류라라"}, 
				{"문미미", "박보배"}, 
		};
	
		String[][] student2 = {
				{"송성실", "윤예의"}, 
				{"진재주", "차천축"}, 
				{"피풍표", "홍하하"}
		};
		
		String[][] class1 = new String[3][2];
		System.out.println("== 1분단 ==");
		for(int i = 0; i < class1.length; i++) {
			for(int j = 0; j < class1[i].length; j++) {
				class1[i][j] = student[i][j];
				
				System.out.print(class1[i][j] + " ");
				}
			System.out.println();
			
		}
		
		
		String[][] class2 = new String[3][2];
		System.out.println("== 2분단 ==");
		for(int i = 0; i < class2.length; i++) {
			for(int j = 0; j < class2[i].length; j++) {
				class2[i][j] = student2[i][j];
				System.out.print(class2[i][j] + " ");
			}
			System.out.println();
			
		}
		
		
		
		
	}

	public void practice8() {
		// 위 문제에서 자리 배치한 것을 가지고 학생 이름을 검색하여 
		// 해당 학생이 어느 자리에 앉았는지 출력하세요.
		String[][] student = {
				{"강건강", "남나나"}, 
				{"도대담", "류라라"}, 
				{"문미미", "박보배"}, 
		};
	
		String[][] student2 = {
				{"송성실", "윤예의"}, 
				{"진재주", "차천축"}, 
				{"피풍표", "홍하하"}
		};
		
		String[][] class1 = new String[3][2];
		System.out.println("== 1분단 ==");
		for(int i = 0; i < class1.length; i++) {
			for(int j = 0; j < class1[i].length; j++) {
				class1[i][j] = student[i][j];
				
				System.out.print(class1[i][j] + " ");
				}
			System.out.println();
			
		}
		
		
		String[][] class2 = new String[3][2];
		System.out.println("== 2분단 ==");
		for(int i = 0; i < class2.length; i++) {
			for(int j = 0; j < class2[i].length; j++) {
				class2[i][j] = student2[i][j];
				System.out.print(class2[i][j] + " ");
			}
			System.out.println();
			
		}
		System.out.println("============================");
		System.out.print("검색할 학생 이름을 입력하세요 : ");
		String input = sc.next();
		
		for(int i = 0; i < class1.length; i++) {
			for(int j = 0; j < class1[i].length; j++) {
				if(class1[i][j].equals(input)) {
					if(j == 0) {
						System.out.println("검색하신 " + input + "학생은 1분단 " + (i+1) + " 번째 줄에 왼쪽에 있습니다.");
					} else {
						System.out.println("검색하신 " + input + "학생은 1분단 " + (i+1) + " 번째 줄에 오른쪽에 있습니다.");
						
					}
				}
			}
			
			}
		

		for(int i = 0; i < class2.length; i++) {
			for(int j = 0; j < class2[i].length; j++) {
				if(class2[i][j].equals(input)) {
					if(j == 0) {
						System.out.println("검색하신 " + input + "학생은 2분단 " + (i+1) + " 번째 줄에 왼쪽에 있습니다.");
					} else {
						System.out.println("검색하신 " + input + "학생은 2분단 " + (i+1) + " 번째 줄에 오른쪽에 있습니다.");
						
					}
				}
			}
			
			}
		
		
		
	}

	public void practice9() {
		// String 2차원 배열 6행 6열을 만들고 행의 맨 위와 제일 앞 열은 
		// 각 인덱스를 저장하세요.
		// 그리고 사용자에게 행과 열을 입력 받아 해당 좌표의 값을 'X'로 변환해 2차원 
		// 배열을 출력하세요.
		
		
		String[][] arr = {
				{" ", "0", "1", "2", "3", "4"},
				{"0", " ", " ", " ", " ", " "},
				{"1", " ", " ", " ", " ", " "},
				{"2", " ", " ", " ", " ", " "},
				{"3", " ", " ", " ", " ", " "},
				{"4", " ", " ", " ", " ", " "}
		};
		try {
			
			System.out.print("행 인덱스 입력 : ");
			int row = sc.nextInt();
			System.out.print("열 인덱스 입력 : ");
			int column = sc.nextInt();
			for(int i = 0; i < arr.length; i++) {
				for(int j = 0; j < arr[i].length; j++) {
					System.out.print(arr[i][j] + " ");
					if(arr[i].equals(arr[row]) && arr[j].equals(arr[column])) {
						arr[row][column] = "X";
						
						System.out.print(arr[row][column]);
						
					}
				}
				System.out.println();
			}
		} catch (Exception e) {
			System.out.println("6보다 작은수 입력바람");
		}
	}
	
	public void practice10() {
		String[][] arr = {
				{" ", "0", "1", "2", "3", "4"},
				{"0", " ", " ", " ", " ", " "},
				{"1", " ", " ", " ", " ", " "},
				{"2", " ", " ", " ", " ", " "},
				{"3", " ", " ", " ", " ", " "},
				{"4", " ", " ", " ", " ", " "}
		};
		
			int row;
			do {
				System.out.print("행 인덱스 입력 : ");
				row = sc.nextInt();
				System.out.print("열 인덱스 입력 : ");
				int column = sc.nextInt();
				
				for(int i = 0; i < arr.length; i++) {
					for(int j = 0; j < arr[i].length; j++) {
						System.out.print(arr[i][j] + " ");
						if(arr[i].equals(arr[row]) && arr[j].equals(arr[column])) {
							arr[row][column] = "X";
							
							System.out.print(arr[row][column]);
							
						}
					}
					System.out.println();
				}
			} while(row != 99);
			
			if(row == 99) {
				System.out.println("프로그램 종료");
			}
		
		
	}
	
}
				
		
		
		

