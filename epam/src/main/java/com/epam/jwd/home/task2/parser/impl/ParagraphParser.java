package com.epam.jwd.home.task2.parser.impl;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.epam.jwd.home.task2.domain.Sentence;
import com.epam.jwd.home.task2.domain.TextPart;
import com.epam.jwd.home.task2.parser.Parser;

public class ParagraphParser implements Parser {

	@Override
	public List<TextPart> parse(String text) {
		return Arrays.stream(text.split("(?<=[^ ]\\\\.) (?=[^a-z])")).map(s -> new Sentence(s))
				.collect(Collectors.toList());
	}

}