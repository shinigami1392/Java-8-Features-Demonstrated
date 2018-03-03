package edu.pushkar.learn.java8.defaultMethods;

public class ImplementOneInterface implements InterfaceDemo1{

	@Override
	public void doStuffSpecificToImplementation() {
		System.out.println("Doing stuff specific to implementation in " + ImplementOneInterface.class.getSimpleName());
	}
	
}
