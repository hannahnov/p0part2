package pr.pojos;

public class Runner {

	//runners and dogs with similar skill levels will be matched
	private int skillLevel;
	
	private boolean isAvailable;

	private String userName;
	
	private int age;
	
	private int password;
	
	
	public Runner() {
		
	}
	
	public Runner(String userName, int age, int password, int skillLevel, boolean isAvailable) {
		this.userName = userName;
		this.age = age;
		this.password = password;
		this.skillLevel = skillLevel;
		this.isAvailable = isAvailable;
	}
	
	public int getSkillLevel() {
		return this.skillLevel;
	}

	public void setSkillLevel(int skillLevel) {
		this.skillLevel = skillLevel;
	}

	public boolean isRunnerAvailable() {
		return isAvailable;
	}

	public void changeRunnerAvailability(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	
	public String getName() {
		return userName;
	}

	public void setName(String userName) {
		this.userName = userName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}
	
}