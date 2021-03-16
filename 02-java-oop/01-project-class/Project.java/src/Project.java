
public class Project {
	private String fullName;
	private String description;
	
	public String elevatorPitch(String name, String desc) {
		this.fullName = name;
		this.description = desc;
		return "Name: " + name + "; Description: " + desc;
	}

	
	public String getfullName() {
		return fullName;
	}
	
	public void setfullName(String name) {
		this.fullName = name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDesc(String description) {
		this.description = description;
	}
	
	public Project() {
		
	}
	
	public Project(String fullName) {
		this.fullName = fullName;
	}
	
	public Project(String fullName, String description) {
		this.fullName = fullName;
		this.description = description;
	}
	
}
