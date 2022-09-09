package model;

public class Editor extends Software {

	final static String appName = "Editor App"; 

	public Editor() {
		super(appName);
	}
	
	public void save(String path, String message) {
		System.out.println("save: " + path);
	}
}
