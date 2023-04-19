package Questions_Marks;

public class Main {

	public static String QuestionsMarks(String str) {

		boolean result = false;

		for (int i = 0; i < str.length(); i++) {
			char c1 = str.charAt(i);
			if (Character.isDigit(c1)) {
				int sayi1 = Character.getNumericValue(c1);

				for (int j = i + 1; j < str.length(); j++) {
					char c2 = str.charAt(j);
					if (Character.isDigit(c2)) {
						int sayi2 = Character.getNumericValue(c2);
						if (sayi1 + sayi2 == 10) {
							int counter = 0;
							for (int k = i + 1; k < j; k++) {
								if (str.charAt(k) == '?') {
									counter++;
								}
							}

							if (counter == 3) {
								result = true;
								break;
							} else {
								result = false;
								return "false";
							}
						}
					}
				}
			}
		}

		return result ? "true" : "false";
	}

	public static void main(String[] args) {
		System.out.print(QuestionsMarks("9???1???9??1???9"));
	}

}
