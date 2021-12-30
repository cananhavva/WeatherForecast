package com.canan;

import com.canan.user.UserClient;
import com.canan.utils.Logging;

public class WeatherManagement {
	
	public static void main(String[] args) {
		Logging.getInstance().logInfo("Weather Management System is startin...");
		
		// BusinessClient businessClient = new BusinessClient();
		// new Thread(businessClient,
		// businessClient.getClass().getSimpleName()).start();
		//
		// WeatherClient weatherClient = new WeatherClient();
		// new Thread(weatherClient, weatherClient.getClass().getSimpleName()).start();
		
		UserClient userClient = new UserClient();
		new Thread(userClient, userClient.getName()).start(); // thread çalýþtýrma
		Logging.getInstance().logInfo("Weather Management System has started");
	}
	
}
