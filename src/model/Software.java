package model;

public class Software implements ISoftware {
	
	public Software(String name) {
		this.name = name;
	}

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void launch() {
		System.out.println(this.name + " is launched.");
	}

}
