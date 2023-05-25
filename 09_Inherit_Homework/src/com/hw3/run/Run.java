package com.hw3.run;

import java.util.Arrays;

import com.hw3.model.vo.Product;

public class Run {

	public static void main(String[] args) {
	
		String str = "최수진,김민수,이현경,김수현";
		
		String[] arr = str.split(",");
		
		String s1 = arr[0];
		String s2 = arr[1];
		String s3 = arr[2];
		String s4 = arr[3];
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		
		
	}

}
