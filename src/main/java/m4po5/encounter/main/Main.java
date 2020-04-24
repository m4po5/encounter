package m4po5.encounter.main;

import m4po5.encounter.core.Encounter;
import m4po5.encounter.engine.Spawner;

public class Main {
	public static void main (String[] args) {
		System.out.println("You have an Encounter!");
		
		Spawner spawner = new Spawner();
		Encounter en = spawner.genEncounter();
		
		System.out.println("It's a " + en.getName() + "!");
	}
}
