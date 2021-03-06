package pr.pojos;

public class Dog {
	
	
	//runners and dogs with similar skill levels will be matched
	
	private int skillLevel;
	
	private int dogId;
	
	private String name;
	
	private Owner owner;
	
	private boolean isAvailable;

	public Dog() {
		
	}
	
	public Dog(String name, Owner owner, int skillLevel, boolean isAvail) {
		this.name = name;
		this.owner = owner;
		this.skillLevel = skillLevel;
		this.isAvailable = isAvail;
	}

	public String getDogName() {
		return name;
	}

	public void setDogName(String name) {
		this.name = name;
	}

	public Owner getDogOwner() {
		return owner;
	}

	public void setDogOwner(Owner owner) {
		this.owner = owner;
	}
	
	public void setSkillLevelDog(int skillLevel) {
		this.skillLevel = skillLevel;
	}
	
	public int getSkillLevelDog() {
		return this.skillLevel;
	}

	public boolean isDogAvailable() {
		return isAvailable;
	}

	public void changeDogAvailability(boolean isAvail) {
		this.isAvailable = isAvail;
	}
	
	public int getDogid() {
		return dogId;
	}

	public void setDogId(int dogId) {
		this.dogId = dogId;
	}
	

}
