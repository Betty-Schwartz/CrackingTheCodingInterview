package Chapter1;

import static org.junit.Assert.*;

import org.junit.Test;

public class UniqueCharacterStringTest {

	@Test
	public void test() {
		UniqueCharacterString firstTest = new UniqueCharacterString(); 
//		assertFalse(firstTest.doesStringContainUniqueCharacters("betty"));
		assertTrue(firstTest.doesStringContainUniqueCharacters("Samuel"));
	}

}
