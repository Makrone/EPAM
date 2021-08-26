package com.epam.jwd.home.task2.domain;

import java.util.ArrayList;
import java.util.List;

import com.epam.jwd.home.task2.parser.Parser;
import com.epam.jwd.home.task2.parser.impl.WordParser;

public class Word implements TextPart {

	private List<TextPart> parts = new ArrayList<>();
	private static final Parser parser = new WordParser();

	public Word(String text) {
		super();
		this.parts = parser.parse(text);
	}

	@Override
	public void print() {
		for (TextPart t : parts) {
			t.print();
		}
	}

	public Character getLetter(Integer index) {
		if (parts.size() > index) {
			return ((Letter) parts.get(index)).getLetter();

		} else {
			throw new IndexOutOfBoundsException("Выход за пределы листа");
		}

	}

	public Integer length() {
		return parts.size();
	}

}
