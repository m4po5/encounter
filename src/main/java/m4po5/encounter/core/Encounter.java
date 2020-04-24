package m4po5.encounter.core;

public class Encounter  implements PhysicalEncounter {
	private String name;
	private String encounterClass;
	private int level;
	private int strength;
	private int dextirity;
	private int hitpoints;
	private int armorpoints;
	
	public Encounter(String encounterClass) {
		this.name = "the Encounter";
		this.encounterClass = encounterClass;
		this.level = 1;
		this.strength = 0;
		this.dextirity = 0;
		this.hitpoints = 1;
		this.armorpoints = 0;
	}
	

	public String getEncounterClass() {
		return encounterClass;
	}

	public void setEncounterClass(String encounterClass) {
		this.encounterClass = encounterClass;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setLevel(int level) {
		this.level = level;
	}
	
	public int getLevel() {
		return level;
	}
	
	public int getStrength() {
		return strength;
	}
	
	public void setStrength(int strength) {
		this.strength = strength;	
	}


	public int getDextirity() {
		return dextirity;
	}


	public void setDextirity(int dextirity) {
		this.dextirity = dextirity;
	}
	
	public int getHitPoints() {
		return hitpoints;
	}
	
	public void setHitPoints(int hitPoints) {
		this.hitpoints = hitPoints;
	}
	
	public int getArmorPoints() {
		return armorpoints;
	}
	
	public void setArmorPoints(int armorPoints) {
		this.armorpoints = armorPoints;
	}
}
