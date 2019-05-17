package hackerRank;

import java.util.List;

public class BirthdayChocolate {

	// Complete the birthday function below.
	static int birthday(List<Integer> s, int d, int m) {

		int count = 0;
		int size = s.size();
		// int num = size - m + 1;
		for (int i = 0; i < size - m + 1; i++) {
			int sum = 0;
			for (int j = i; j < i + m && j < size; j++) {
				sum += s.get(i);

			}

			if (sum == d) {
				count++;
			}
		}

		return count;
	}

}
