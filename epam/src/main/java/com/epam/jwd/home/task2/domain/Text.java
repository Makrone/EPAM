package com.epam.jwd.home.task2.domain;

import java.util.ArrayList;
import java.util.List;

import com.epam.jwd.home.task2.parser.Parser;
import com.epam.jwd.home.task2.parser.impl.TextParser;

public class Text implements TextPart {
	
	private List <TextPart> parts = new ArrayList <>();
	private static final  Parser parser = new TextParser();
	

	public Text(String text) {
		super();
		this.parts = parser.parse(text);
	}

	@Override
	public void print() {
		for ( TextPart t: parts) {
			t.print();
		}
		
	}
	
	
	

}
