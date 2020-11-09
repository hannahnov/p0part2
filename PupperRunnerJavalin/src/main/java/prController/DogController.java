package prController;

import java.util.ArrayList;

import io.javalin.http.Context;
import pr.pojos.Dog;
import pr.pojos.Owner;
import prService.Database;
import prService.OwnerService;
import prService.OwnerServiceFullStack;

public class DogController {
	
	OwnerService ownerService = new OwnerServiceFullStack();
	Database data = new Database();
	
	public void createGuest(Context ctx) {
		
		System.out.println("Responding to post owner request");
		
		int dogId = Integer.parseInt(ctx.formParam("dogId"));
		
		String name = ctx.formParam("name");
		
		int skillLevel = Integer.parseInt(ctx.formParam("skillLevel"));
		
		boolean isAvailable = Boolean.parseBoolean(ctx.formParam("isAvail"));

		
		Owner owner = new Owner();
		Dog dog = new Dog(dogId, name, owner, skillLevel, isAvail) {
		
		ctx.html(owner.getName());
		
	}
	
	public void getOwner(Context ctx) {
		//TODO
	}
	
	public void getAllOwners() {
		//TODO
	}

}

