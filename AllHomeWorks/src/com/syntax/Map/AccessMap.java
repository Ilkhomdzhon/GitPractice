package com.syntax.Map;

import java.util.*;
import java.util.Map.Entry;

abstract class Country {

	String countryName;
	int population;
	double averageSalary;

	public Country(String countryName, int population, double averageSalary) {
		this.countryName = countryName;
		this.population = population;
		this.averageSalary = averageSalary;

	}

	public abstract void live();

	public abstract void work();

	public void imigrate() {
		System.out.println("All peoples from " + countryName + " imigrating to developed countries");
	}

}

class Tajikistan extends Country {

	public Tajikistan(String countryName, int population, double averageSalary) {
		super(countryName, population, averageSalary);

	}

	@Override
	public void live() {
		System.out.println(population + " in " + countryName + " live in peace");

	}

	@Override
	public void work() {
		System.out.println(countryName + " pays on average for middle class " + averageSalary);

	}

	@Override
	public void imigrate() {
		System.out.println("All peoples from " + countryName + " imigrating to developed countries");
	}

}

class NorthKorea extends Country {

	public NorthKorea(String countryName, int population, double averageSalary) {
		super(countryName, population, averageSalary);

	}

	@Override
	public void live() {
		System.out.println(countryName + " consist of " + population);

	}

	@Override
	public void work() {
		System.out.println(countryName + " pay for workers on average " + averageSalary);

	}

	@Override
	public void imigrate() {
		System.out.println("All peoples from " + countryName + " escaping to developed countries");
	}

}

class Russia extends Country {

	public Russia(String countryName, int population, double averageSalary) {
		super(countryName, population, averageSalary);

	}

	@Override
	public void live() {
		System.out.println(countryName + " consist of " + population);

	}

	@Override
	public void work() {
		System.out.println(countryName + " explotering their people and imigrants by paying" + averageSalary);

	}

	@Override
	public void imigrate() {
		System.out.println("All peoples from " + countryName + " escaping to developed countries");
	}

}

public class AccessMap {

	public static void main(String[] args) {

		Map<Integer, Country> country = new LinkedHashMap<>();

		country.put(1, new Tajikistan("Tajikistan", 9000000, 980));
		country.put(2, new NorthKorea("North Korea", 18000000, 500));
		country.put(3, new Tajikistan("Russia", 280000000, 1200));

		Collection<Country> county = country.values();

		for (Country a : county) {
			a.live();
			a.work();
			a.imigrate();
			System.out.println("------------------------------------");

		}

		Set<Entry<Integer, Country>> count = country.entrySet();

		for (Entry<Integer, Country> b : count) {

			b.getValue().live();
			b.getValue().imigrate();
			b.getValue().work();

			System.out.println("=================================================");

		}

		Iterator<Entry<Integer, Country>> iter = count.iterator();
		while (iter.hasNext()) {

			Entry<Integer, Country> ccc = iter.next();

			ccc.getValue().live();
			ccc.getValue().work();
			ccc.getValue().imigrate();
			System.out.println("**********************************************");
		}

		Set<Integer> key = country.keySet();
			 
		 	for(Integer a :key) {
		 		Country obj =country.get(a);
		 		obj.imigrate();
		 		obj.live();
		 		
		 	}

		 	
		 		Iterator<Integer>iter1= key.iterator();
		 			 
		 		while (iter1.hasNext()) {
		 			int b =iter1.next();
		 			System.out.println(b);
		 		}
	}

}
