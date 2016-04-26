package iloveyouboss;

import java.util.ArrayList;
import java.util.List;

public class ScoreCollection {
	private List<Scoreable> scores = new ArrayList<>();
	
	public void add(Scoreable score)
	{
		scores.add(score);
	}
	
	public int arithmetocMean()
	{
		int total = scores.stream().mapToInt(Scoreable::getScore).sum();
		return total / scores.size();
	}
}