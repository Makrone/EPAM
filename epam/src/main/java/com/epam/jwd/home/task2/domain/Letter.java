package com.epam.jwd.home.task2.domain;

public class Letter implements TextPart {

	private Character letter;

	public Letter(Character letter) {
		super();
		this.letter = letter;
	}

	@Override
	public void print() {
		System.out.print(letter);
	}
	
	public Character getLetter () { 
		return letter;
	}

}
