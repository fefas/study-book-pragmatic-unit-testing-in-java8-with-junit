package iloveyouboss;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.*;

public class ScoreCollectionTest {
	private ScoreCollection collection = null;

	@Before
	public void create() {
		collection = new ScoreCollection();
	}

	@Test
	public void answersArithmeticMeanOfTwoNumbers() {
		collection.add(() -> 5);
		collection.add(() -> 7);

		int actualResult = collection.arithmetocMean();
		
		assertThat(actualResult, equalTo(6));
	}

	@Test(expected=IllegalArgumentException.class)
	public void throwsExceptionWhenAddingNull() {
		collection.add(null);
	}

	@Test
	public void answerZeroWhenNoElementsAdded() {
		assertThat(collection.arithmetocMean(), equalTo(0));
	}

	@Test
	public void dealsWithIntegerOverflow() {
		collection.add(() -> Integer.MAX_VALUE);
		collection.add(() -> 1);

		assertThat(collection.arithmetocMean(), equalTo(1073741824));
	}
}
