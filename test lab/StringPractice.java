
public class StringPractice {
	/*
	 * returns true if c is one of the characters typically used to represent a
	 * "face card" in a standard deck of playing cards.
	 * 
	 * These include: jack 'J' or 'j' queen 'Q' or 'q' king 'K' or 'k' ace 'A' or 'a
	 */
	public static boolean isFace(char c) {
		/*
		 * placeholder just so that the function compiles. fill in your implementation
		 * here.
		 *
		 * there is a similar placeholder for each of the remaining functions
		 */
		char J = 'J';
		char j = 'j';
		char Q = 'Q';
		char q = 'q';
		char K = 'K';
		char k = 'k';
		char A = 'A';
		char a = 'a';

		if (Character.valueOf(c).compareTo(J) == 0 || Character.valueOf(c).compareTo(j) == 0
				|| Character.valueOf(c).compareTo(Q) == 0 || Character.valueOf(c).compareTo(q) == 0
				|| Character.valueOf(c).compareTo(K) == 0 || Character.valueOf(c).compareTo(k) == 0
				|| Character.valueOf(c).compareTo(A) == 0 || Character.valueOf(c).compareTo(a) == 0) {

			System.out.println("true");
			return true;
		}
		System.out.println("false");
		return false;
	}

	/*
	 * returns the index of the first face-card letter in s or -1 if s contains no
	 * face-card letters
	 */
	public static int indexOfFirstFace(String s) {
		if (s.charAt(0) == 'J' || s.charAt(0) == 'j' || s.charAt(0) == 'Q' || s.charAt(0) == 'q' || s.charAt(0) == 'K'
				|| s.charAt(0) == 'k' || s.charAt(0) == 'A' || s.charAt(0) == 'a') {
			return s.indexOf(s);
		}
		return -1;
	}

	/*
	 * returns the index of the first occurrence of a face-card letter in s starting
	 * from index startPosition or -1 if there are none at index startPosition or
	 * later. Notice that this method has the same name as the previous one, but
	 * that it takes a different number of arguments. This is perfectly legal in
	 * Java. It's called "method overloading"
	 */
	public static int indexOfFirstFace(String s, int startPosition) {
		return -1;
	}

	/*
	 * returns the index of the last occurrence of a face-card letter in s or -1 if
	 * s contains none
	 */
	public static int indexOfLastFace(String s) {
		return -1;
	}

	/*
	 * returns s in reverse. For example, if s is "Apple", the method returns the
	 * String "elppA"
	 */
	public static String reversed(String s) {
		return "";
	}

	/*
	 * returns the number of times that n occurs in h. For example, if h is
	 * "Mississippi" and n is "ss" the method returns 2.
	 */
	public static int numOccurrences(String h, String n) {
		return 0;
	}

	/*
	 * returns true if s is the same backwards and forwards and false otherwise
	 */
	public static boolean sameInReverse(String s) {
		return true;
	}

	/*
	 * returns a new String which is the same as s, but with all of the face-card
	 * letters removed.
	 */
	public static String withoutFaces(String s) {
		return "";
	}

	/*
	 * returns true if s consists only of face-card letters or false otherwise
	 */
	public static boolean containsOnlyFaces(String s) {
		return true;
	}

	/*
	 * returns true if s contains no face-card letters or false otherwise
	 */
	public static boolean containsNoFaces(String s) {
		return true;
	}

	/*
	 * Passed a reference to a person's name in the form FIRST_NAME LAST_NAME. The
	 * method returns a reference to a new String in the form LAST_NAME, FIRST_NAME.
	 *
	 * For example, if we were passed "Spongebob Squarepants", we'd return
	 * "Squarepants, Spongebob". You may assume that the method is passed exactly
	 * two words separated by a single space.
	 */
	public static String lastFirst(String s) {
		return "";
	}
}
