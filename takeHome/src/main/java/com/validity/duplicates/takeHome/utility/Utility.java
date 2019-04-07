package com.validity.duplicates.takeHome.utility;

import org.apache.commons.codec.language.Metaphone;
import org.apache.commons.text.similarity.LevenshteinDistance;

public class Utility {

	private static LevenshteinDistance levenshtein = new LevenshteinDistance();
	private static Metaphone metaphone = new Metaphone();

	public static boolean isLevenshteinEqual(String first, String second, int offset) {
		if (levenshtein.apply(first, second) <= offset)
			return true;
		else
			return false;
	}

	public static boolean isMetaphoneEqual(String first, String second) {
		if (metaphone.isMetaphoneEqual(first, second))
			return true;
		else
			return false;
	}
}
