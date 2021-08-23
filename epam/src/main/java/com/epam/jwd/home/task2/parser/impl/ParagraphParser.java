package com.epam.jwd.home.task2.parser.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.epam.jwd.home.task2.domain.Sentence;
import com.epam.jwd.home.task2.domain.TextPart;
import com.epam.jwd.home.task2.parser.Parser;

public class ParagraphParser implements Parser{
		
		private Pattern pattern = Pattern.compile("\\b[^.!?]+[.!?]+");
		

		@Override
		public List<TextPart> parse(String text) {
			List<TextPart> sentences = new ArrayList<TextPart>();
			
			Matcher matcher = pattern.matcher(text);
			while (matcher.find()) {
				String substring = text.substring(matcher.start(), matcher.end());
				Sentence sentence = new Sentence(substring);
				sentences.add(sentence);
				
			}
			return sentences;
		}
		
		
		

	}