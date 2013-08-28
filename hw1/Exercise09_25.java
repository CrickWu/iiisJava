/** Analysis: ... */

/** Design: ... */

/** Coding : Please indent and format your code properly */
/** Copy and paste your code to replace the template below */
/** Note that your class must be named Exercise09_25 */
import java.util.Scanner;
import java.util.Random;

public class Exercise09_25 {
	private static String[] words = {"write", "that", "program"};
	private static int number, miss;
	private static boolean[] pole = new boolean[26];
	private static boolean[] stat = new boolean[26];
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (true) {
			initialize();
			while (true) {
				print();
				String tmp = input.nextLine();
				char chr = tmp.charAt(0);
				//System.out.println(chr);
				if (stat[chr - 'a'] && pole[chr - 'a'])
					System.out.println("\t" + chr + " is already in the word");
				else if (!stat[chr - 'a']) {
					System.out.println("\t" + chr + " is not in the word");
					miss++;
				}
				else {
					pole[chr - 'a'] = true;
					if (equal(stat, pole)) {
					System.out.println("The word is " + words[number] + ". You missed " + miss + " time.");
					System.out.print("Do you want to guess another word? Enter y or n>");
					tmp = input.nextLine();
					chr = tmp.charAt(0);
					if (chr == 'y') break;
					else
						return;
					}
				}
			}
		}
	}
	private static boolean equal(boolean[] a, boolean[] b) {
		for (int i = 0; i < words[number].length(); i++)
			if (!pole[words[number].charAt(i) - 'a'])
				return false;
		return true;
	}
	private static void print() {
		System.out.print("(Guess) Enter a letter in word ");
		//System.out.println(words[number]);
		for (int i = 0; i < words[number].length(); i++) {
			words[number].charAt(i);
			if (pole[words[number].charAt(i) - 'a'])
				System.out.print(words[number].charAt(i));
			else
				System.out.print("*");
		}
		System.out.print(" > ");
	}
	private static void initialize() {
		Random r = new Random();
		number = r.nextInt(words.length);
		miss = 0;
		for (int i = 0; i < pole.length; i++)
			pole[i] = false;
		for (int i = 0; i < stat.length; i++)
			stat[i] = false;
		for (int i = 0; i < words[number].length(); i++)
			stat[words[number].charAt(i) - 'a'] = true;
	}
}

