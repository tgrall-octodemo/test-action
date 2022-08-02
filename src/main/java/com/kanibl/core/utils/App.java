package com.kanibl.core.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.joda.time.LocalDate;

public class App {

    private static Logger logger = LogManager.getLogger(App.class);

	public static void main(String[] args) {
		System.out.println(getLocalCurrentDate());
	}

	private static String getLocalCurrentDate() {

		if (logger.isDebugEnabled()) {
			logger.debug("getLocalCurrentDate() is executed!");
		}

		LocalDate date = new LocalDate();
		return date.toString();

	}

}
