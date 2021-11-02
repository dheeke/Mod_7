import static org.junit.Assert.*;

import org.junit.Test;

public class lineTest {

	@Test
	public void test() {
		Text_Analyzer test = new Text_Analyzer();
		String output = test.WriteFile();
		assertEquals(null, output);
	}

}
