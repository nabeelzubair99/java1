
public class singSong {
	public static void overallSong(String animalName) {
		// just going to be using static methods

		if (animalName == "cat") {
			theChorus(animalName);
			newLine();
			catRepeatVerse();

		} else if (animalName == "hen") {
			theChorus(animalName);
			newLine();
			hen();
			newLine();
			catRepeatVerse();

		} else if (animalName == "duck") {
			theChorus(animalName);
			newLine();
			duck();
			newLine();
			hen();
			newLine();
			catRepeatVerse();

		} else if (animalName == "goose") {
			theChorus(animalName);
			newLine();
			goose();
			newLine();
			duck();
			newLine();
			hen();
			newLine();
			catRepeatVerse();

		} else if (animalName == "sheep") {
			theChorus(animalName);
			newLine();
			sheep();
			newLine();
			goose();
			newLine();
			duck();
			newLine();
			hen();
			newLine();
			catRepeatVerse();
		} else if (animalName == "pig") {
			theChorus(animalName);
			newLine();
			pig();
			newLine();
			sheep();
			newLine();
			goose();
			newLine();
			duck();
			newLine();
			hen();
			newLine();
			catRepeatVerse();
			newLine();
		}
	}

	private static void theChorus(String animalName) {
		System.out.println("Bought me a " + animalName + " and the " + animalName + " pleased me");
		System.out.println("I fed my " + animalName + "under yonder tree.");
	}

	private static void hen() {
		System.out.println("Hen goes chimmy-chuck, chimmy-chuck,");
	}

	private static void duck() {
		System.out.println("duck goes quack quack!");
	}

	private static void goose() {
		System.out.println("duck goes hissy! hissy!");
	}

	private static void sheep() {
		System.out.println("sheep goes baa, baa!");
	}

	private static void pig() {
		System.out.println("pig goes oink, oink!");
	}

	private static void catRepeatVerse() {
		System.out.println("Cat goes fiddle-i-fee");
	}

	private static void newLine() {
		System.out.println("\n");
	}

}
