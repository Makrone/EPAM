package com.epam.jwd.home.task2.parser;

import java.util.List;

import com.epam.jwd.home.task2.domain.TextPart;

public interface Parser {

	List<TextPart> parse(String text);

}
