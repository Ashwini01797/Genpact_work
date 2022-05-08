package com.org.genp.day7;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map=new HashMap<>();
		boolean check=map.isEmpty();
		System.out.println("is map empty?");
		map.put(1, "Monday");
		map.put(2, "Friday");
		map.put(10, "Yellow");
		map.put(15, "Black");
		map.put(18, "Blue");
	//	Iterator<Entry<Integer,String>> it=map.entrySet().iterator();
		System.out.println("iterating on map");

	}

}
