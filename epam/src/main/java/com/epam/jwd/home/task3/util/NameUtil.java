package com.epam.jwd.home.task3.util;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class NameUtil {

	private static Random rand = new Random();
	private static Map<Integer, String> names = new HashMap<>();

	static {
		names.put(0, "Олег");
		names.put(1, "Рома");
		names.put(2, "Петя");
		names.put(3, "Витя");
		names.put(4, "Антон");
		names.put(5, "Андрей");
	}

	public static String getName(int index) {
		return names.get(index);
	}

	public static int count() {
		return names.size();
	}

	public static String getRandomName() {
		return names.get(rand.nextInt(names.size()));
	}

}
