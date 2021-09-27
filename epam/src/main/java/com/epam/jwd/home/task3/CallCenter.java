package com.epam.jwd.home.task3;

import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;

import org.apache.log4j.Logger;

import com.epam.jwd.home.task3.domain.Operator;

public class CallCenter {

	private Logger log = Logger.getLogger(CallCenter.class);

	private LinkedBlockingQueue<Operator> freeOperators;

	public CallCenter() {
		super();
	}

	public CallCenter(List<Operator> freeOperators) {
		super();
		this.freeOperators = new LinkedBlockingQueue<Operator>(freeOperators);
	}

	public Operator startCall() {
		Long startTime = System.currentTimeMillis() / 1000;
		Operator operator = freeOperators.poll();
		while (operator == null) {
			try {
				log.info("Гудок-Гудок-Гудок. Клиент ожидает: " + ((System.currentTimeMillis() / 1000) - startTime)
						+ " секунд");
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				log.error(e.getMessage());
			}
			operator = freeOperators.poll();
		}
		log.info("Оператор поднял трубку, оставшееся кол-во свободных операторов: " + freeOperators.size());
		return operator;
	}

	public void finishCall(Operator operator) {
		while (!freeOperators.offer(operator)) {
			log.info(
					"Неудалось добавить оператора в Call-Center, кол-во свободных операторов: " + freeOperators.size());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				log.error(e.getMessage());
			}

		}

		log.info("Оператор закончил разговор, оставшееся кол-во свободных операторов: " + freeOperators.size());
	}

}
