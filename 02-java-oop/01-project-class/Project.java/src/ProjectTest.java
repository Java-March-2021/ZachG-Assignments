
public class ProjectTest {

	public static void main(String[] args) {
		Project math = new Project();
		Project englishProject = new Project("English");
		Project scienceProject = new Project("Science", "Really Hard Project");
		
		math.setfullName("Pythagorean Theorem");
		math.setDesc("Hard Project Finished");
		
		String name = math.getfullName();
		String info = math.getDescription();
		System.out.println("Project Name: " + name + ", Description: " + info);
		
		String projectName = englishProject.getfullName();
		System.out.println("The Project Name is: " + projectName);
		
		String elevatorMath = math.elevatorPitch("Math", "Hard Project Finished");
		String elevScience = scienceProject.elevatorPitch("Science", "Really Hard Project");
		System.out.println("name: " + scienceProject.getfullName() + " Desc: " + scienceProject.getDescription());
		System.out.println(elevatorMath);
		System.out.println(elevScience);
		
	}

}
