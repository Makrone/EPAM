package com.epam.jwd.home.log4j;

import org.apache.log4j.Logger;

public class Log4jDemo {

	private static Logger logger = Logger.getLogger(Log4jDemo.class);

	public static void main(String[] args) {

		logger.info("тест инфо");
		logger.debug("тест debug");
		logger.warn("тест warn");
		logger.error("тест error");

	}

}
