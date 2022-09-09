package model;

public class Camera extends Software {

	final static String appName = "Camera App"; 

	public Camera() {
		super(appName);
	}
	
	public void shoot() {
		System.out.println("save a picture.");
	}
}
