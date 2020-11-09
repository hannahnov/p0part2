package prService;

import java.util.Scanner;

import org.apache.log4j.Logger;

import pr.pojos.Runner;

public class RunnerService {
	
	private static Logger log = Logger.getRootLogger();

	public RunnerService() {
		
	}
	
	public String askName() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter your username");
			String name = sc.next();
			return name;
		}
	
	
	public int askRunnerID() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter your password");
			
			int ID = sc.nextInt();
			return ID;
		}
	
	
	public int askAge() {
		Scanner sc = new Scanner(System.in);
			System.out.println("Please enter your age"); 
			
			int age = sc.nextInt();
			return age;
		}
	
	
	public int askSkillLevel() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter your skill level \n 1: BEGINNER, 2: INTERMEDIATE, 3: EXPERT");	
			int skillLevel = sc.nextInt();
			
			return skillLevel;
		}
	
	public Runner logRunnerIn(Database data, String username, int password) {
		for (int i = 0; i < data.runners.size(); i++) {
			if ((data.getRunner(i).getName().compareTo(username)  == 0 )&& data.getRunner(i).getPassword() == password) {
				System.out.println("Signed in.");
				return data.getRunner(i);
			}
		}
		System.out.println("Invalid username or password");
		log.info("no user found");
		return null;
	}
	
	public Runner createRunner(Runner runner, Database data) {
		System.out.println("Creating" + runner + "object");
		data.addRunner(runner);
		return runner;
	}
	public Runner createRunner(Database data) {
		Runner runner = new Runner();
		
		runner.setName(askName());
		runner.setPassword(askRunnerID());
		runner.setAge(askAge());
		runner.changeRunnerAvailability(true);
		runner.setSkillLevel(askSkillLevel());
		
		data.addRunner(runner);
		System.out.println("Account created");
		log.info("runner added to database.runners");
		return runner;
	}

}
