package theLoveLetterMystery;

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
	 * Complete the 'theLoveLetterMystery' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts STRING s
	 * as parameter.
	 */

	public static int theLoveLetterMystery(String s) {
		// Write your code here
		int result = 0;
		StringBuilder sb = new StringBuilder();
		sb.append(s);
		StringBuilder sbReverse = new StringBuilder(sb.reverse());
		int midIndex = s.length() / 2;
		if (sbReverse.equals(sb) == true) {
			result = 0;
		} else {
			for (int i = 0, k = s.length() - 1; i < midIndex; i++, k--) {
				if (s.charAt(i) != s.charAt(k)) {
					result += Math.abs(s.charAt(i) - s.charAt(k));
				}
			}

		}

		return result;
	}

}

public class Solution {
	public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int q = Integer.parseInt(bufferedReader.readLine().trim());
//
//        IntStream.range(0, q).forEach(qItr -> {
//            try {
//                String s = bufferedReader.readLine();
//
//                int result = Result.theLoveLetterMystery(s);
//
//                bufferedWriter.write(String.valueOf(result));
//                bufferedWriter.newLine();
//            } catch (IOException ex) {
//                throw new RuntimeException(ex);
//            }
//        });
//
//        bufferedReader.close();
//        bufferedWriter.close();
		String s = "ababab";

		System.out.println(Result.theLoveLetterMystery(s));
	}
}
