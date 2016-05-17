package iloveyouboss;

import java.util.ArrayList;
import java.util.List;

public class ScoreCollection {
	private List<Scoreable> scores = new ArrayList<>();
	
	public void add(Scoreable score)
	{
		if (score == null) {
			throw new IllegalArgumentException();
		}

		scores.add(score);
	}
	
	public int arithmetocMean()
	{
		if (scores.size() == 0) {
			return 0;
		}

		long total = scores.stream().mapToLong(Scoreable::getScore).sum();

		return (int) (total / scores.size());
	}
}
