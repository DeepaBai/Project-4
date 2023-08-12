package org.reverse;

public class Reverse {

	public static void main(String[] args) {

		String s = "Deepa";

		int char_count = 0;

		for (int i = 0; i <= s.length() - 1; i++) {

			char c = s.charAt(i);

			char_count++;

		}

		System.out.println(char_count);

	}
}
