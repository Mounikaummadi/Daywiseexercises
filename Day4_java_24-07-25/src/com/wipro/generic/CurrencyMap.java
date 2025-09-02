package com.wipro.generic;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CurrencyMap {

	public static void main(String[] args) {
		Map<String, String> currencyMap=new TreeMap<>();
		currencyMap.put("Ind", "Rupee");
		currencyMap.put("Usa", "Dollar");
		currencyMap.put("Uk", "Euro");
		currencyMap.put("", "Rupee");
		for(Map.Entry<String,String> k:currencyMap) {
			
		}

	}

}
