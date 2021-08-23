package com.epam.jwd.home.task2.domain;

import java.util.ArrayList;
import java.util.List;

import com.epam.jwd.home.task2.parser.Parser;
import com.epam.jwd.home.task2.parser.impl.TextParser;

public class Word implements TextPart {
		
		private List <TextPart> innerParts = new ArrayList <>();
		private static final  Parser parser = new TextParser();
		


		public Word() {
			super();
		}

		public Word(String text) {
			super();
			this.innerParts = parser.parse(text);
		}

		@Override
		public void print() {
			// TODO Auto-generated method stub
			
		}

	}

