package com.epam.jwd.home.task2.parser.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.epam.jwd.home.task2.domain.Paragraph;
import com.epam.jwd.home.task2.domain.TextPart;
import com.epam.jwd.home.task2.parser.Parser;

public class TextParser implements Parser {

	@Override
	public List<TextPart> parse(String text) {
		if (text == null) {
			return Collections.emptyList();
		}
		String[] stringParagraph = text.split("\\n");
		List<TextPart> parts = new ArrayList<>(stringParagraph.length);
		for (String p : stringParagraph) {
			TextPart t = new Paragraph(p);
			parts.add(t);
		}
		return parts;
	}

}
