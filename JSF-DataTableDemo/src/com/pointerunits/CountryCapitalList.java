package com.pointerunits;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped

public class CountryCapitalList {
	private HashMap<String, String> countryAndCapital;
	
	public CountryCapitalList() {

	}
	
	public HashMap<String, String> getCountryAndCapital() {
		return countryAndCapital;
	}
	public void setCountryAndCapital(HashMap<String, String> countryAndCapital) {
		this.countryAndCapital = countryAndCapital;
	}
	
	public List<String> getCountryKeyAsList() {
		return new ArrayList<String>(this.countryAndCapital.keySet());
	}
	
	public String loadCountryAndDisplayCaptials() {
		if(this.countryAndCapital == null) {
			System.out.println("Intialize....");
			this.countryAndCapital = new HashMap<String, String>();
			this.countryAndCapital.put("Afghanistan", "Kabul");
			this.countryAndCapital.put("Albania", "Tirana");
			this.countryAndCapital.put("Algeria", "Algiers");
			this.countryAndCapital.put("Andorra", "Andorra la Vella");
			this.countryAndCapital.put("Angola", "Luanda");
			this.countryAndCapital.put("Antigua and Barbuda", "Saint John's");
			this.countryAndCapital.put("Argentina", "Buenos Aires");
			this.countryAndCapital.put("Armenia", "Yerevan");
			this.countryAndCapital.put("Australia", "Canberra");
			this.countryAndCapital.put("Austria", "Vienna");
			this.countryAndCapital.put("Azerbaijan", "Baku");
			this.countryAndCapital.put("The Bahamas", "Nassau");
			this.countryAndCapital.put("Bahrain", "Manama");
			this.countryAndCapital.put("Bangladesh", "Dhaka");
			this.countryAndCapital.put("Barbados", "Bridgetown");
			this.countryAndCapital.put("Belarus", "Minsk");
			this.countryAndCapital.put("Belgium", "Brussels");
			this.countryAndCapital.put("Belize", "Belmopan");
			this.countryAndCapital.put("Benin", "Porto-Novo");
			this.countryAndCapital.put("Bhutan", "Thimphu");
			this.countryAndCapital.put("Bolivia", "La Paz (administrative); Sucre (judicial)");
			this.countryAndCapital.put("Bosnia and Herzegovina", "Sarajevo");
			this.countryAndCapital.put("Botswana", "Gaborone");
			this.countryAndCapital.put("Brazil", "Brasilia");
			this.countryAndCapital.put("Brunei", "Bandar Seri Begawan");
			this.countryAndCapital.put("Bulgaria", "Sofia");
			this.countryAndCapital.put("Burkina Faso", "Ouagadougou");
			this.countryAndCapital.put("Burundi", "Bujumbura");
			this.countryAndCapital.put("Cambodia", " Phnom Penh");
			this.countryAndCapital.put("Cameroon", "Yaounde");
			this.countryAndCapital.put("India", "New Delhi");
			this.countryAndCapital.put("Nigeria", "Abuja");
			this.countryAndCapital.put("Zimbabwe", "Harare"); 
		} 
		return "displayDataTable";
	}
}
