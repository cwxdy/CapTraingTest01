package com.example.demo.designpattern;

import java.util.HashMap;
import java.util.Map;

public class MultiObject {
	private MultiObject() {}
	private static Map<String, MultiObject> objMap = new HashMap<>();
	private static MultiObject obj1 = new MultiObject();
	private static MultiObject obj2 = new MultiObject();
	static {
		objMap.put("first", obj1);
		objMap.put("second", obj2);
	}
	public static synchronized MultiObject getInstance(String key) {
		return objMap.get(key);
	}
}
