package com.syntax.AllTasks;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

class Example {
	public static void main(String[] args) {
		List<Map<String, Object>> dataList = new ArrayList<>();
		Map<String, Object> appleMap = new LinkedHashMap<>();

		appleMap.put("Items", "Apple");
		appleMap.put("Price", 20.00);
		appleMap.put("Quantity", 10);
		dataList.add(appleMap);
		Map<String, Object> orangeMap = new LinkedHashMap<>();
		orangeMap.put("Items", "Orange");
		orangeMap.put("Price", 21.99);
		orangeMap.put("Quantity", 10);
		dataList.add(orangeMap);
		double totalPurchase = 0.0;
		for (Map<String, Object> key : dataList) {
			String items = key.get("Items").toString();
			double price = Double.parseDouble(key.get("Price").toString());
			double quantity = Double.parseDouble(key.get("Quantity").toString());
			double subTotal = price * quantity;
			System.out.println(
					"Items:" + items + " Price: " + price + " Quantity: " + quantity + " SubTotal:" + subTotal);
			totalPurchase += subTotal;
		}
		System.out.println("Your Purchase total : " + totalPurchase);
	}
}