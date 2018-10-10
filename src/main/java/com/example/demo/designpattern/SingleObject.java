package com.example.demo.designpattern;

public class SingleObject {
	// 让构造函数私有化，这样该类在外部不会被实例化
	private SingleObject() {}
	
	/*懒汉式，线程安全*/
	// 创建SingleObject的一个变量
	private static SingleObject instance;
	// 获取唯一可用的对象，第一次调用时要先构建
	public static synchronized SingleObject getInstance() {
		if (instance == null) {
			instance = new SingleObject();
		}
		return instance;
	}
	
	/*饿汉式，线程不安全*/
	/*// 创建SingleObject的一个对象
	private static SingleObject instance = new SingleObject();
	// 获取唯一可用的对象
	public static SingleObject getInstance() {
		return instance; 
	}
	
	public void showMessage() {
		System.out.println("Hello World！");
	}*/
	
	/*双检锁*/
	/*private static SingleObject instance;
	public static SingleObject getInstance() {
		if (instance == null) {
			synchronized (SingleObject.class) {
				if (instance == null) {
					instance = new SingleObject();
				}
			}
		}
		return instance;
	}*/
	
	
}
