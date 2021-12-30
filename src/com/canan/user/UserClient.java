package com.canan.user;

import com.canan.utils.Logging;

public class UserClient implements Runnable {
	private static final String NAME = "User Client";
	
	@Override
	public void run() {
		Logging.getInstance().logInfo(UserClient.NAME + " is up and runnig");
	}
	
}
