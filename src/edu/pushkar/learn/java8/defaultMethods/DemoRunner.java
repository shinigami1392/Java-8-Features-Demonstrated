package edu.pushkar.learn.java8.defaultMethods;

public class DemoRunner {
	public static void main(String[] args) {
		ImplementBothInterfaces both = new ImplementBothInterfaces();
		ImplementOneInterface one = new ImplementOneInterface();
		ImplementThreeInterfaces three = new ImplementThreeInterfaces();
		
		both.commonTask("Study");
		both.doStuffSpecificToImplementation();
		
		one.commonTask("Work from implementation1");
		one.doStuffSpecificToImplementation();
		
		three.commonTask("Work from implementation3");
		three.doStuffSpecificToImplementation();
	}
}
