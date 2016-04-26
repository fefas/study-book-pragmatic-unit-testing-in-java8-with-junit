package iloveyouboss;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class ScoreCollectionTest {

	@Test
	public void answersArithmeticMeanOfTwoNumbers() {
		// arrange
		ScoreCollection collection = new ScoreCollection();
		collection.add(() -> 5);
		collection.add(() -> 7);
		
		// act
		int actualResult = collection.arithmetocMean();
		
		// assert
		assertThat(actualResult, equalTo(6));
	}

}
