package com.epam.jwd.home.task2.domain;

import java.util.ArrayList;
import java.util.List;

import com.epam.jwd.home.task2.parser.Parser;
import com.epam.jwd.home.task2.parser.impl.TextParser;

public class Sign implements TextPart{

		
		private List <TextPart> innerParts = new ArrayList <>();
		private static final  Parser parser = new TextParser();
		


		public Sign() {
			super();
		}

		public Sign(String text) {
			super();
			this.innerParts = parser.parse(text);
		}

		@Override
		public void print() {
			
			
		}
		
		
}
