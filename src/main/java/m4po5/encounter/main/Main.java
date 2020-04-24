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
		int dex = 6;
		
		while(fighter.isAlive()) {
			int hp = en.getHitPoints();
			System.out.println("The " + en.getEncounterClass() + " has " + hp + " hitpoints left.\nYou strike at the vile creatue,");
			
			fighter.dodge(dmg, dex);
			
			
			if (hp == en.getHitPoints())
				System.out.println("but " + en.getName() + " has dodged your attack!");
			else
				System.out.println("and you hit with " + dmg + " points of damage!");
			
		}
		
		System.out.println("Hussah! You defeated a harmless creature in battle!");
		
	}
}
