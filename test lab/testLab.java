
public class testLab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Testing my first java program");
		System.out.println("2+2 = " + (2 + 2));

		// this is lab 2 stuff
		String cat, hen, duck, goose, sheep, pig;
		cat = "cat";
		hen = "hen";
		duck = "duck";
		goose = "goose";
		sheep = "sheep";
		pig = "pig";

		singSong.overallSong(cat);
		singSong.overallSong(hen);
		singSong.overallSong(duck);
		singSong.overallSong(goose);
		singSong.overallSong(sheep);
		singSong.overallSong(pig);

		// this is lab 3 stuff

		asciiArt x = new asciiArt();
		x.mainDisplay();

		// we are going to test the string practice class.
		StringPractice.isFace('Q');
		int indexOfFirstFace = StringPractice.indexOfFirstFace("Jack");
		System.out.println(indexOfFirstFace);
		;
	}

}
