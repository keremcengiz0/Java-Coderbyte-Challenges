package Longest_World;

import java.util.Arrays;

public class Main {

	public static String LongestWord(String sen) {
		sen = sen.replaceAll("[\\[\\].,'!?_@&:/~]", " ");
		String[] splittedSentence = sen.split(" ");

		String[] resultSentence = Arrays.stream(splittedSentence).filter(word -> !word.isEmpty())
				.toArray(String[]::new);

		String result = "";

		if (resultSentence.length == 1) {
			result = resultSentence[0];
			return result;
		}

		result = resultSentence[0];

		for (int i = 1; i < resultSentence.length; i++) {

			if (resultSentence[i].length() > result.length()) {
				result = resultSentence[i];
			} else if (resultSentence[i].length() == result.length()) {
			}
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.print(LongestWord("a confusing /:sentence:/[ this is not!!!!!!!~"));
	}

}
