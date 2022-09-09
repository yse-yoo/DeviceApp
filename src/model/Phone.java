package model;

public class Phone extends Software {

	final static String appName = "Phone App"; 

	public Phone() {
		super(appName);
	}
	
	public void call(String number) {
		System.out.println(number);
	}
}
