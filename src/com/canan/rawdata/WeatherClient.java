package com.canan.rawdata;

import com.canan.utils.Logging;

public class WeatherClient implements Runnable {
	private static final String NAME = "Weather Client";
	
	@Override
	public void run() {
		Logging.getInstance().logInfo(WeatherClient.NAME + " is up and runnig");
	}
	
}
