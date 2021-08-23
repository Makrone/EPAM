package com.epam.jwd.home.task2.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.apache.log4j.Logger;

public class FileReaderUtil {

	public static String readFile(String fileName) {
		File file = new File(fileName);
		StringBuilder sb = new StringBuilder();
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {

			int currentByte;
			while ((currentByte = br.read()) != -1) {
				sb.append((char) currentByte);
			}

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		return sb.toString();

	}

}
