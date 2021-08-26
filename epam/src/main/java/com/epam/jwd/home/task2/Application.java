package com.epam.jwd.home.task2;

import com.epam.jwd.home.task2.domain.Text;
import com.epam.jwd.home.task2.service.FileReaderUtil;

public class Application {
	public static void main(String[] args) {
		String textFromFile = FileReaderUtil.readFile("storage/text.txt");
		
		
		Text text = new Text(textFromFile);
		text.removeWords(3, 'a');
		text.print();
		

	}

}
