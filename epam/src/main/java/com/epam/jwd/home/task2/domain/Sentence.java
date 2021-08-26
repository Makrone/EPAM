package com.epam.jwd.home.task2.domain;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.epam.jwd.home.task2.parser.Parser;
import com.epam.jwd.home.task2.parser.impl.SentenceParser;

public class Sentence implements TextPart {

	private List<TextPart> parts = new ArrayList<>();
	private static final Parser parser = new SentenceParser();

	public Sentence(String text) {
		super();
		this.parts = parser.parse(text);
	}

	@Override
	public void print() {
		parts.stream().forEach(TextPart::print);

	}

	public void removeWords(Integer size, Character letter) {
		if (parts != null) {
			Iterator<TextPart> iterator = parts.iterator();
			while (iterator.hasNext()) {

				TextPart p = iterator.next();
				if (p instanceof Word) {
					Word word = (Word) p;
					if (word.length() == size && letter.equals(word.getLetter(0))) {
						iterator.remove();
					}
				}
			}

		}
	}

//	public boolean isQuestSentence(Character sign) {
//		if (parts!=null) {
//			Iterator<TextPart> iterator = parts.iterator();	
//			while (iterator.hasNext()) {
//				TextPart s = iterator.next();
//				if (s instanceof Character) {
//					Character sign = (Character) s;
//						if ((Charter)sign == sign.equals("?")) {
//							return true;
//					
//				}
//			}
//				
//			}
//	}
	
	
				}

//}
