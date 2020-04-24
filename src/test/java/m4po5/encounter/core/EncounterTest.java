package m4po5.encounter.core;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EncounterTest {

	@Test
	void test() {
		String encounterClass = "Dragon";
		Encounter en = new Encounter(encounterClass);
		
		assertEquals(encounterClass, en.getEncounterClass());
	}

}
