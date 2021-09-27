package com.epam.jwd.home.task3;

import java.util.List;

import com.epam.jwd.home.task3.domain.Operator;
import com.epam.jwd.home.task3.util.OperatorUtil;

public class Application {

	public static void main(String[] args) {

		List<Operator> operators = OperatorUtil.generateOperators(5);
		CallCenter callCenter = new CallCenter(operators);

		ClientGenerator threadGenerator = new ClientGenerator(callCenter);
		Thread thread = new Thread(threadGenerator);
		thread.start();
	}

}
