/**
	* File: Lesson 4.1: While Loops and accumulators
	* Author: Owais Ali Khan
	*	Date Created: April 8, 2026
	*	Date Last Modified: April 8, 2026
	*/

public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static String seriesInclusive(int n) {
		if (n <= 0) {
			return "";
		}
		
		String result = "1";
		int i = 1;
		while (i < n) {
			i++;
			result = result + " " + i;
		}
		return result;
	}

	public static String seriesExclusive(int n) {
		if (n <= 0) {
			return "";
		}

		String result = "0";
		int i = 0;
		while (i < n-1) {
			i++;
			result = result + " " + i;
		}
		return result;
	}

	

}
