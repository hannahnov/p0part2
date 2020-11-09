package prController;

import java.util.ArrayList;

import io.javalin.http.Context;
import pr.pojos.Dog;
import pr.pojos.Owner;
import prService.Database;
import prService.OwnerService;
import prService.OwnerServiceFullStack;

public class OwnerController {
	
	OwnerService ownerService = new OwnerServiceFullStack();
	Database data = new Database();
	
	public void createGuest(Context ctx) {
		
		System.out.println("Responding to post owner request");
		
		String userName = ctx.formParam("userName");
		
		int age = Integer.parseInt(ctx.formParam("age"));
		
		int password = Integer.parseInt(ctx.formParam("password"));
		
		int numDogs = Integer.parseInt(ctx.formParam("number of dogs"));

		
		Owner owner = new Owner(userName, age, password, numDogs);
		
		ownerService.createOwner(owner, data);
		
		ctx.html(owner.getName());
		
	}
	
	public void getOwner(Context ctx) {
		//TODO
	}
	
	public void getAllOwners() {
		//TODO
	}

}
