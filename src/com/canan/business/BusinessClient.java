package com.canan.business;

import com.canan.utils.Logging;

public class BusinessClient implements Runnable {
	private static final String NAME = "Business Client";
	
	@Override
	public void run() {
		Logging.getInstance().logInfo(BusinessClient.NAME + " is up and runnig");
	}
}
