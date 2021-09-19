package com.epam.jwd.home.task3;

public class Application {

	public static void main(String[] args) {

		CallCenter callCenter = new CallCenter();

		ClientGenerator threadGenerator = new ClientGenerator(callCenter);
		Thread thread = new Thread(threadGenerator);
		thread.start();
	}

}
