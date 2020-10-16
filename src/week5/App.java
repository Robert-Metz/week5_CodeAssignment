package week5;

public class App {

	public static void main(String[] args) {
		
		Logger log = new AsteriskLogger();
		Logger error = new AsteriskLogger();
		Logger logSpace = new SpacedLogger();
		Logger errorSpace = new SpacedLogger();
		
		log.log("I am finishing my homework");
		error.error("Help");
		logSpace.log("I am finishing my homework");
		errorSpace.error("Help");

	}

}
