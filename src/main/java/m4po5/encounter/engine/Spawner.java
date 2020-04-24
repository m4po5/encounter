package m4po5.encounter.engine;

import m4po5.encounter.core.Encounter;

public class Spawner {
	public Encounter genEncounter() {
		Encounter encounter = spawnDragon();
		
		return encounter;
	}
	
	private Encounter spawnDragon() {
		Encounter dragon = new Encounter("Dragon");
		dragon.setName("Fafnir the Worst");
		dragon.setStrength(10);
		dragon.setDextirity(6);
		dragon.setHitPoints(200);
		dragon.setArmorPoints(15);
		
		return dragon;
	}
}
