package com.epam.jwd.home.task2.domain;

public class Sign implements TextPart {

	private Character sign;

	public Sign(Character sign) {
		super();
		this.sign = sign;
	}

	@Override
	public void print() {
		System.out.print(sign);
	}

	public Character getSign () { 
		return sign;
	}
	

}
