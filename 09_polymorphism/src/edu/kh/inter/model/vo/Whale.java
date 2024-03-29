package edu.kh.inter.model.vo;

public class Whale extends TypeMammalia implements WaterLife {

	@Override
	public void breastfeed() {
		System.out.println("고래가 수유한다");
	}

	@Override
	public void eat() {
		System.out.println("고래가 밥을 먹는다");
	}

	@Override
	public void cry() {
		System.out.println("고래가 운다");
	}

	@Override
	public void move() {
		System.out.println("고래가 움직인다");
	}

	@Override
	public void water() {
		System.out.println("고래는 물에서 가장 큽니다");		
	}

}