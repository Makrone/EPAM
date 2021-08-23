package com.epam.jwd.home.task2.parser.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.epam.jwd.home.task2.domain.Sign;
import com.epam.jwd.home.task2.domain.TextPart;
import com.epam.jwd.home.task2.parser.Parser;

public class SentenceParser implements Parser{
	
	
	@Override
	public List<TextPart> parse(String text) {
		if(text == null) { 
			return Collections.emptyList();
		}
		
		String[] sentenceParts = text.split("\\s+");
		List<TextPart> parts = new ArrayList<>();
		for (String s : sentenceParts) {
			int firstCharIndex = indexOfFirstLetter(s);
            int lastCharIndex = indexOfLastLetter(s);
            for (int i = 0; i < firstCharIndex; i++) {

			
            }
		}
		return null;
	}
	
	private static int indexOfFirstLetter(String sentencePart) {
        for (int i = 0; i < sentencePart.length(); i++) {
            if (Character.isLetterOrDigit(sentencePart.charAt(i))) {
                return i;
            }
        }
        return 0;
    }

    private static int indexOfLastLetter(String sentencePart) {
        for (int i = sentencePart.length() - 1; i >= 0; i--) {
            if (Character.isLetterOrDigit(sentencePart.charAt(i))) {
                return i;
            }
        }
        return sentencePart.length() - 1;
    }
	
	
	

}
