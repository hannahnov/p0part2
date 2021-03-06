package pr.pojos;

import java.util.ArrayList;


public class Owner {
	
	private int numDogs;

    private ArrayList <Dog> dogs = new ArrayList<>();

    private String userName;
	
	private int age;
	
	private int password;
	
	public Owner() {
		
	}
	
	public Owner (String userName, int age, int password, int numDogs) {
		this.userName = userName;
		this.age = age;
		this.password = password;
		this.numDogs = numDogs;
	}


	public int getNumDogs() {
		return numDogs;
	}


	public void setNumDogs(int numDogs) {
		this.numDogs = numDogs;
	}


	public ArrayList<Dog> getDogs() {
		return dogs;
	}


	public void addDog(Dog dog) {
		dogs.add(dog);
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
