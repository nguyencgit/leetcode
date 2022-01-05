package panagram;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

	/*
	 * Complete the 'pangrams' function below.
	 *
	 * The function is expected to return a STRING. The function accepts STRING s as
	 * parameter.
	 */

	public static String pangrams(String s) {
		// Write your code here
		s = s.toLowerCase();
		int count = 0;
		String[] letters = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
				"s", "t", "u", "v", "w", "x", "y", "z" };
		for (int i = 0; i < letters.length; i++) {
			if (s.indexOf(letters[i]) > -1) {
				count++;
			}
		}
		if (count == 26) {
			return "pangram";
		} else {
			return "not pangram";
		}

	}

}

public class Solution {
	public static void main(String[] args) throws IOException {
//		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//		String s = bufferedReader.readLine();
//
//		String result = Result.pangrams(s);
//
//		bufferedWriter.write(result);
//		bufferedWriter.newLine();
//
//		bufferedReader.close();
//		bufferedWriter.close();
		String s = "We promptly judged antique ivory buckles for the prize";
		System.out.println(Result.pangrams(s));

	}
}
/*
 * A pangram is a string that contains every letter of the alphabet. Given a
 * sentence determine whether it is a pangram in the English alphabet. Ignore
 * case. Return either pangram or not pangram as appropriate.
 * 
 * Example
 * 
 * The string contains all letters in the English alphabet, so return pangram.
 * 
 * Function Description
 * 
 * Complete the function pangrams in the editor below. It should return the
 * string pangram if the input string is a pangram. Otherwise, it should return
 * not pangram.
 * 
 * pangrams has the following parameter(s):
 * 
 * string s: a string to test Returns
 * 
 * string: either pangram or not pangram Input Format
 * 
 * A single line with string .
 * 
 * Constraints
 * 
 * 
 * Each character of ,
 * 
 * Sample Input
 * 
 * Sample Input 0
 * 
 * We promptly judged antique ivory buckles for the next prize
 * 
 * Sample Output 0
 * 
 * pangram
 * 
 * Sample Explanation 0
 * 
 * All of the letters of the alphabet are present in the string.
 * 
 * Sample Input 1
 * 
 * We promptly judged antique ivory buckles for the prize
 * 
 * Sample Output 1
 * 
 * not pangram
 * 
 * Sample Explanation 0
 * 
 * The string lacks an x.
 */
