package prService;

import java.util.ArrayList;

import pr.pojos.Dog;
import pr.pojos.Owner;
import pr.pojos.Pairing;
import pr.pojos.Runner;

public class Database {
	
	public static int dogId = 0;
	
	public static int pairingId = 0;
	
	public ArrayList <Owner> owners = new ArrayList<>();
	
	public ArrayList <Runner> runners = new ArrayList<>();
	
	public ArrayList <Pairing>	pairings = new ArrayList<>();
	
	public ArrayList <Dog> dogs = new ArrayList<>();

	public Database() {
	
	}
	
	
	public void addOwner(Owner owner) {
		owners.add(owner);
	}
	
	public void addRunner(Runner runner) {
		runners.add(runner);
	}
	
	public void addPairing(Pairing pairing) {
		pairings.add(pairing);
		pairing.setPairingId(pairingId);
		pairingId++;
	}
	
	public void addDog(Dog dog) {
		dogs.add(dog);
		dog.setDogId(dogId);
		dogId++;
	}
	
	public Dog getDog(int index) {
		return dogs.get(index);
	}
	
	public Owner getOwner(int index) {
		return owners.get(index);
	}
	
	public Runner getRunner(int index) {
		return runners.get(index);
	}
	
	public Pairing getPairing(int index) {
		return pairings.get(index);
	}
	public void clearDatabase() {
		pairings.clear();
		runners.clear();
		owners.clear();
	}

}
