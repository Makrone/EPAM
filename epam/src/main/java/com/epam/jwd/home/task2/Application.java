package com.epam.jwd.home.task2;

import com.epam.jwd.home.task2.domain.Text;
import com.epam.jwd.home.task2.service.FileReaderUtil;

public class Application {
	public static void main(String[] args) {
		String textFromFile = FileReaderUtil.readFile("storage/text.txt");
		
		
		Text text = new Text(textFromFile);
		text.print();
		
		
		

//		Pattern pattern = Pattern.compile("\\b[^.!?]+[.!?]+");		
//		Matcher matcher = pattern.matcher(text);
//		Pattern patternWord = Pattern.compile("\\b[^\\s]+[\\w]");
//		Pattern patternLetter = Pattern.compile("([A-Za-z0-9-])");
//		while (matcher.find()) { 
//			String substring = text.substring(matcher.start(), matcher.end());
//			System.out.println(substring);
//			Matcher matcherWord = patternWord.matcher(substring);
//			Matcher matcherLetter = patternLetter.matcher (substring);
//			while (matcherWord.find()) { 
//				String word = substring.substring(matcherWord.start(), matcherWord.end());
//				System.out.println(word);
//				while (matcherLetter.find()){
//					String letter = text.substring(matcherLetter.start(), matcherLetter.end());
//				//	System.out.println(letter);
//					
//				}
//				
//				
//			}
//				
//			}

	}

}
