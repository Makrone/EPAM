package com.epam.jwd.home.task3;

import org.apache.log4j.Logger;

public class CallCenter {

	private Logger log = Logger.getLogger(CallCenter.class);

	private int freeOperators = 3;

	public CallCenter() {
		super();
	}

	public CallCenter(int freeOperators) {
		super();
		this.freeOperators = freeOperators;
	}

	public synchronized void startCall() {
		Long startTime = System.currentTimeMillis() / 1000;
		
		while (freeOperators < 1) {
			try {
				log.info("Гудок-Гудок-Гудок. Клиент ожидает: " + ((System.currentTimeMillis() / 1000) - startTime) + " секунд" );
				wait();
			} catch (InterruptedException e) {
				log.error(e.getMessage());
			}
		}
		freeOperators--;
		log.info("Оператор поднял трубку, оставшееся кол-во свободных операторов: " + freeOperators );
		notify();
	}

	public synchronized void finishCall() {
		freeOperators++;
		log.info("Оператор закончил разговор, оставшееся кол-во свободных операторов: " + freeOperators);
		notify();
	}

}
