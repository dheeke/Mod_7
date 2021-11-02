import static org.junit.Assert.*;

import org.junit.Test;

public class FirstLineTest {

	@Test
	public void test() {
		Text_Analyzer test = new Text_Analyzer();
		String output = test.ParseFile();
		assertEquals("The Project Gutenberg", output);
	}

}
