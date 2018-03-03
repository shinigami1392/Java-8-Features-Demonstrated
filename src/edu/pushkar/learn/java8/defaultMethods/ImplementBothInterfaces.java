package edu.pushkar.learn.java8.defaultMethods;

public class ImplementBothInterfaces implements InterfaceDemo1, InterfaceDemo2{

	@Override
	public void doStuffSpecificToImplementation() {
		System.out.println("Doing stuff specific to implementation in " + ImplementBothInterfaces.class.getSimpleName());
	}

	@Override
	public void commonTask(String task) {
		InterfaceDemo1.super.commonTask(task);
	}

}
