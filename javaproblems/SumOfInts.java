package javaproblems;

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

class Solution6 {

	/*
	 * Complete the 'simpleArraySum' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts
	 * INTEGER_ARRAY ar as parameter.
	 */

	public static int simpleArraySum(List<Integer> ar) {
		// Write your code here
		int result = 0;
		for (int i = 0; i < ar.size(); i++) {
			result = result+ (int)ar.get(i);
		}
		return result;
	}



}

public class SumOfInts {
	public static void main(String[] args) throws IOException {
//		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//		int arCount = Integer.parseInt(bufferedReader.readLine().trim());
//
//		List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//				.map(Integer::parseInt).collect(toList());
//
//		int result = Result.simpleArraySum(ar);
//
//		bufferedWriter.write(String.valueOf(result));
//		bufferedWriter.newLine();
//
//		bufferedReader.close();
//		bufferedWriter.close();
		List<Integer> ar = new ArrayList<Integer>();
		ar.add(1);
		ar.add(2);
		System.out.println(Solution6.simpleArraySum(ar));
		
	}


}
