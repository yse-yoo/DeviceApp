package model;

import java.io.FileWriter;
import java.io.IOException;

public class Editor extends Software {

	final static String appName = "Editor App"; 

	public Editor() {
		super(appName);
	}
	
	public void save(String path, String message) {
		System.out.println("save: " + path);
		
		try {
			FileWriter writer = new FileWriter(path);
			writer.write(message);
			writer.close();

			System.out.println("ファイルを保存しました");
		} catch (IOException e) {
			System.out.println("ファイルが書き込めませんでした");
		}
		
	}
}
