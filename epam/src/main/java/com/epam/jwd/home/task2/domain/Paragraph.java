package com.epam.jwd.home.task2.domain;

import java.util.ArrayList;
import java.util.List;

import com.epam.jwd.home.task2.parser.Parser;
import com.epam.jwd.home.task2.parser.impl.ParagraphParser;

public class Paragraph implements TextPart {

	private List<TextPart> parts = new ArrayList<>();
	private static final Parser parser = new ParagraphParser();

	public Paragraph(String text) {
		super();
		this.parts = parser.parse(text);
	}

	@Override
	public void print() {
		for (TextPart t : parts) {
			t.print();
		}

	}
}
