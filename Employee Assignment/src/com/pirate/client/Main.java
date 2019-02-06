package com.pirate.client;

import com.pirate.bean.Address;
import com.pirate.bean.City;
import com.pirate.bean.Country;
import com.pirate.repo.Repository;
import com.pirate.service.Service;

public class Main {

	public static void main(String[] args) {
		Service service = new Service(new Repository());
		
		City city = new City();
		city.setCityName("Talwade");
		
		Country country = new Country();
		country.setCity(city);
		country.setCountryName("Pune");
		
		Address address = new Address();
		address.setAddressLine("Viraj Homebase");
		address.setCountry(country);
		
		System.out.println(service.createEmployee(123, "Shubham", address));
		System.out.println(service.searchByName("Shubham"));
	}

}
