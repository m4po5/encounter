package m4po5.encounter.engine;

import m4po5.encounter.core.Encounter;

public class Spawner {
	public Encounter genEncounter() {
		Encounter encounter;
		double rnd = Math.random();
		
		if(rnd <= 0.4)
			encounter = spawnGoblin();
		else if (rnd <= 0.7)
			encounter = spawnUnicorn();
		else
			encounter = spawnDragon();
		
		return encounter;
	}
	
	private Encounter spawnDragon() {
		Encounter dragon = new Encounter("Dragon");
		dragon.setName("Fafnir the Worst");
		dragon.setStrength(10);
		dragon.setDextirity(6);
		dragon.setHitPoints(200);
		dragon.setArmorPoints(20);
		
		return dragon;
	}
	
	private Encounter spawnUnicorn() {
		Encounter dragon = new Encounter("Unicorn");
		dragon.setName("Eladiel Binggong");
		dragon.setStrength(6);
		dragon.setDextirity(12);
		dragon.setHitPoints(60);
		dragon.setArmorPoints(2);
		
		return dragon;
	}
	
	private Encounter spawnGoblin() {
		Encounter dragon = new Encounter("Goblin");
		dragon.setName("Bill B. Boggens");
		dragon.setStrength(2);
		dragon.setDextirity(4);
		dragon.setHitPoints(10);
		dragon.setArmorPoints(0);
		
		return dragon;
		
	}
}
