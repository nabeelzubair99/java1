
public class asciiArt {
	static final int SIZE = 1;
	static final int DRAW_ME = 2;
	static final int PERCENTAGE = 3;

	public void mainDisplay() {
		creatingAPicture();
	}

	private void creatingAPicture() {

		for (int i = 0; i <= SIZE; i++) {
			String star = "*";
			String backslash = "\\";
			String percentage = "%";

			System.out.println("*");
			for (int x = 0; x <= DRAW_ME; x++) {

				System.out.println(star += star);
				System.out.println(backslash += star);

				for (int y = 0; y <= PERCENTAGE; y++) {
					System.out.println(star += percentage);
					System.out.println(star += backslash);
				}
			}

		}
	}

}
