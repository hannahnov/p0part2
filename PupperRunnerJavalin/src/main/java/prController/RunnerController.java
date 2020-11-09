package prController;

import io.javalin.http.Context;
import pr.pojos.Runner;
import prService.Database;
import prService.RunnerService;

public class RunnerController {
	
	RunnerService runnerService = new RunnerServiceFullStack();
	
	Database data = new Database();
	
	public void createGuest(Context ctx) {
		
		System.out.println("Responding to post Runner request");
		
		String userName = ctx.formParam("name");
		
		int age = Integer.parseInt(ctx.formParam("age"));
		
		int password = Integer.parseInt(ctx.formParam("password"));
		
		int skillLevel = Integer.parseInt(ctx.formParam("skillLevel"));
		
		boolean isAvailable = Boolean.parseBoolean(ctx.formParam("isAvailable"));
		
		Runner runner = new Runner(userName, age, password, skillLevel, isAvailable);
		
		runnerService.createRunner(runner, data);
		
		ctx.html(runner.getName());
		
	}
	
	public void getGuest(Context ctx) {
		//TODO
	}
	
	public void getAllGuests() {
		//TODO
	}

}
