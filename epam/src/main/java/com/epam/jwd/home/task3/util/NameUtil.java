package com.epam.jwd.home.task3.util;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class NameUtil {

	private static Random rand = new Random();
	private static Map<Integer, String> manNames = new HashMap<>();
	private static Map<Integer, String> womanNames = new HashMap<>();

	static {
		manNames.put(0, "Олег");
		manNames.put(1, "Рома");
		manNames.put(2, "Петя");
		manNames.put(3, "Витя");
		manNames.put(4, "Антон");
		manNames.put(5, "Андрей");
		manNames.put(6, "Владислав");
		manNames.put(7, "Сергей");
		manNames.put(8, "Максим");
		manNames.put(9, "Дмитрий");
		manNames.put(10, "Александр");
		manNames.put(11, "Кирилл");
		manNames.put(12, "Матвей");
	}
	static {
		womanNames.put(0, "Анастасия");
		womanNames.put(1, "Ольга");
		womanNames.put(2, "Лилия");
		womanNames.put(3, "Ксения");
		womanNames.put(4, "Александра");
	}

	public static String getRandomManName() {
		return manNames.get(rand.nextInt(manNames.size()));
	}
	public static String getRandomWomanName() {
		return womanNames.get(rand.nextInt(womanNames.size()));
	}

}
