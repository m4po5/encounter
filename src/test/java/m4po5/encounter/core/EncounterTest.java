package m4po5.encounter.core;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import m4po5.encounter.core.Encounter;

class EncounterTest {

	@Test
	void test() {
		String name = "Dragon";
		
		Encounter en = new Encounter(name);
		
		assertEquals(name, en.getName());
	}

}
