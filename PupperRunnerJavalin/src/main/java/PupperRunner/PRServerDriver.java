package PupperRunner;



import io.javalin.Javalin;
import prController.OwnerController;
import prController.RunnerController;

public class PRServerDriver {
	
	private static OwnerController ownerController = new OwnerController();
	private static RunnerController runnerController = new RunnerController();
	
	public static void main(String[] args) {
		Javalin app = Javalin.create().start(9090); //sets up and starts our server
		app.get("/hello", ctx -> ctx.html("Hello World"));
		app.post("/createGuest", ctx -> guestController.createGuest(ctx));
	}

}