package com.epam.jwd.home.task2.parser.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.epam.jwd.home.task2.domain.Sign;
import com.epam.jwd.home.task2.domain.TextPart;
import com.epam.jwd.home.task2.domain.Whitespace;
import com.epam.jwd.home.task2.domain.Word;
import com.epam.jwd.home.task2.parser.Parser;

public class SentenceParser implements Parser {

	@Override
	public List<TextPart> parse(String text) {
		if (text == null) {
			return Collections.emptyList();
		}

		List<TextPart> parts = new ArrayList<>();
		String[] sentenceParts = text.split("\\s+");
		for (int i = 0; i < sentenceParts.length; i++) {
			String s = sentenceParts[i];
			if (s.length() > 0) {

				int counter = 0;
				int startIndex = 0;
				while (counter < s.length()) {
					if (!Character.isLetterOrDigit(s.charAt(counter))) {
						if (startIndex < counter) {
							Word word = new Word(s.substring(startIndex, counter));
							parts.add(word);
						}
						startIndex = counter + 1;

						Sign sign = new Sign(s.charAt(counter));
						parts.add(sign);
					}
					counter++;
				}

				if (startIndex < counter) {
					Word word = new Word(s.substring(startIndex, counter));
					parts.add(word);
				}
			}
			if (i < sentenceParts.length - 1) {
				parts.add(new Whitespace());
			}
		}
		return parts;
	}

}
