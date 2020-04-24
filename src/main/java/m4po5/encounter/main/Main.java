package m4po5.encounter.main;

import m4po5.encounter.core.Encounter;
import m4po5.encounter.core.Fighter;
import m4po5.encounter.engine.Spawner;

public class Main {
	public static void main (String[] args) {
		System.out.println("You have an Encounter!");
		
		Spawner spawner = new Spawner();
		Object spawn = spawner.genEncounter();
		
		Encounter en = (Encounter)spawn;
		
		System.out.println("It is a " + en.getEncounterClass() + ", " + en.getName() + "!");
		
		Fighter fighter = new Fighter(en);

		int dmg = 50;
		int dex = 8;
		
		while(fighter.isAlive()) {
			wait(3.0);
			
			int hp = en.getHitPoints();
			System.out.println("\nThe " + en.getEncounterClass() + " has " + hp + " hitpoints left.\nYou strike at the vile creatue,");

			wait(2.0);
			
			fighter.attemptDodge(dmg, dex);
			
			if (hp == en.getHitPoints())
				System.out.println("but " + en.getName() + " has dodged your attack!");
			else
				System.out.println("and you hit with " + dmg + " points of damage!");
			
		}
		
		wait(1.0);
		
		System.out.println("\nHussah! You defeated a harmless creature in battle!");
	}
	
	private static void wait(double seconds) {

		try {
			Thread.sleep((long)seconds * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
