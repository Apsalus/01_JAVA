package edu.kh.abs.model.vo;

public class Shark extends TypePisces {

	@Override
	public void swimming() {
		System.out.println("상어가 수영한다");
	}

	@Override
	public void eat() {
		System.out.println("상어가 밥을 먹는다");
	}

	@Override
	public void cry() {
		System.out.println("상어가 소리를 낸다");
	}

	@Override
	public void move() {
		System.out.println("상어가 움직인다");
	}

}