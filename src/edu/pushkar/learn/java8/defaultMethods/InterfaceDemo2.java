package edu.pushkar.learn.java8.defaultMethods;

public interface InterfaceDemo2 {
	public void doStuffSpecificToImplementation();
	
	default public void commonTask(String task){
		System.out.println("Performing " + task + " in IntefraceDemo2");
	}

}
