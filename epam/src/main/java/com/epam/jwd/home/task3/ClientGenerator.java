package com.epam.jwd.home.task3;

import org.apache.log4j.Logger;

import com.epam.jwd.home.task3.domain.Client;
import com.epam.jwd.home.task3.util.NameUtil;

public class ClientGenerator implements Runnable {

	private Logger log = Logger.getLogger(ClientGenerator.class);

	private CallCenter callCenter;

	public ClientGenerator(CallCenter callCenter) {
		super();
		this.callCenter = callCenter;
	}

	@Override
	public void run() {
		for (;;) {
			log.info("Дзынь-Дзынь-Дзынь");
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				log.error(e.getStackTrace());
			}
			new Thread(new Client(callCenter, NameUtil.getRandomManName())).start();
		}

	}

}
