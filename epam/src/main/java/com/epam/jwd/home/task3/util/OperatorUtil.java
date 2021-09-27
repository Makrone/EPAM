package com.epam.jwd.home.task3.util;

import java.util.ArrayList;
import java.util.List;

import com.epam.jwd.home.task3.domain.Operator;

public class OperatorUtil {

	public static List<Operator> generateOperators(int numberOperator) {
		List<Operator> operators = new ArrayList<>(numberOperator);

		for (int i = 0; i < numberOperator; i++) {
			operators.add(new Operator(NameUtil.getRandomWomanName()));
		}

		return operators;
	}
}
