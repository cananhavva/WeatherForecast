package com.canan.user;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.canan.common.geography.City;
import com.canan.utils.Logging;
import com.canan.utils.MongoUtilities;

public class UserClient implements Runnable {
	private static final String NAME = UserClient.class.getSimpleName();
	
	@Override
	public void run() {
		Logging.getInstance().logInfo(UserClient.NAME + " is up and runnig");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen hangi ülke ile çalışmak istediğinizi seçiniz");
		Iterable<String> countries = MongoUtilities.INSTANCE.getCountries();
		int i = 1;
		for (String country : countries) {
			System.out.println(i++ + " " + country);
		}
		int sel = scan.nextInt();
		scan.nextLine();
		System.out.println("SELECTED COUNTRY: " + MongoUtilities.INSTANCE.getCountries().get(sel - 1));
		ArrayList<City> cities = MongoUtilities.INSTANCE.getCities(MongoUtilities.INSTANCE.getCountries().get(sel - 1));
		Iterator<City> cirtIterator = cities.iterator();
		
		System.out.println("Hangi şehir için hava durumu deðerlerini almak istiyorsunuz");
		i = 1;
		while (cirtIterator.hasNext()) {
			City city = (City) cirtIterator.next();
			System.out.println(i++ + " " + city.getName());
		}
		sel = scan.nextInt();
		scan.nextLine();
		System.out.println("SELECTED CITY: " + cities.get(sel - 1));
		scan.close();
		
	}
	
	public String getName() {
		return UserClient.NAME;
	}
}