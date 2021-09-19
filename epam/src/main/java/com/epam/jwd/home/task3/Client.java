package com.epam.jwd.home.task3;

import java.util.Random;

import org.apache.log4j.Logger;

public class Client implements Runnable {
	
	private Logger log = Logger.getLogger(Client.class);

	private CallCenter callCenter;
	private String name;
	private Random rand = new Random();

	public Client(CallCenter callCenter, String name) {
		super();
		this.callCenter = callCenter;
		this.name = name;
	}

	public void run() {
		log.info("Клиент " + name + " звонит в CallCenter");
		callCenter.startCall();
		try {
			log.info("Клиент разговаривает");
			Thread.sleep(rand.nextInt(1900) +100);
		} catch (InterruptedException e) {
			log.error(e.getMessage());
		}
		log.info("Клиент " + name + " завершил звонок");
		callCenter.finishCall();

	}

}
