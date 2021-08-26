package com.epam.jwd.home.task2.domain;

import java.util.ArrayList;
import java.util.List;

import com.epam.jwd.home.task2.parser.Parser;
import com.epam.jwd.home.task2.parser.impl.TextParser;

public class Text implements TextPart {

	private List<TextPart> parts = new ArrayList<>();
	private static final Parser parser = new TextParser();

	public Text(String text) {
		super();
		this.parts = parser.parse(text);
	}

	@Override
	public void print() {
		for (int i = 0; i < parts.size(); i++) {
			TextPart part = parts.get(i);
			part.print();
			if (i < parts.size() - 1) {
				System.out.println();
			}
		}
	}

	// Из текста удалить все слова заданной длины, начинающиеся на согласную букву. (задание 12)
	public void removeWords(Integer size, Character letter) {

		if (parts != null) {
			parts.stream().forEach(p -> {
				((Paragraph) p).removeWords(size, letter);
			});
		}

	}

}
