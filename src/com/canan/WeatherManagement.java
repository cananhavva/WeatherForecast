package com.canan;

import com.canan.business.BusinessClient;
import com.canan.rawdata.WeatherClient;
import com.canan.user.UserClient;
import com.canan.utils.Logging;

public class WeatherManagement {
	
	public static void main(String[] args) {
		
		Logging.getInstance().logInfo("Weather Management System is startin...");
		(new BusinessClient()).run();
		(new WeatherClient()).run();
		(new UserClient()).run();
		Logging.getInstance().logInfo("Weather Management System has started");
	}
	
}
