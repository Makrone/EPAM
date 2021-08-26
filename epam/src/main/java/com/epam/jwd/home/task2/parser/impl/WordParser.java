package com.epam.jwd.home.task2.parser.impl;

import java.util.List;
import java.util.stream.Collectors;

import com.epam.jwd.home.task2.domain.Letter;
import com.epam.jwd.home.task2.domain.TextPart;
import com.epam.jwd.home.task2.parser.Parser;

public class WordParser implements Parser {

	@Override
	public List<TextPart> parse(String word) {
		List<TextPart> parts = word.chars().mapToObj(c -> new Letter((char) c)).collect(Collectors.toList());
		return parts;
	}

}
