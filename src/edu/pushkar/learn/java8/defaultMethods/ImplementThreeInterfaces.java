package edu.pushkar.learn.java8.defaultMethods;

public class ImplementThreeInterfaces implements InterfaceDemo1, InterfaceDemo2, InterfaceDemo3{

	@Override
	public void doStuffSpecificToImplementation() {
		System.out.println("Doing stuff specific to implementation in " + ImplementThreeInterfaces.class.getSimpleName());
	}

	@Override
	public void commonTask(String task) {
		// TODO Auto-generated method stub
		InterfaceDemo3.super.commonTask(task);
	}

}
