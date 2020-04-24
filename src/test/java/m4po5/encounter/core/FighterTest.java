package m4po5.encounter.core;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FighterTest {
	private Encounter warrior;
	private Fighter fighter;
	
	@BeforeEach
	void setup() {
		warrior = new Encounter("Warrior");
		warrior.setHitPoints(25);
		
		fighter = new Fighter(warrior);
	}
	
	@Test
	public void FighterTest_isAlive() {
		warrior.setHitPoints(25);
		
		assertTrue(fighter.isAlive());
	}
	
	@Test
	public void FighterTest_isAlive_shouldBeFalseAtZeroHitPoints() {
		warrior.setHitPoints(0);
		
		assertFalse(fighter.isAlive());
	}
	
	@Test
	public void FighterTest_isAlive_leathalDamageShouldKillFighter() {
		warrior.setHitPoints(1);
		
		fighter.receiveDamage(1000);
		
		assertFalse(fighter.isAlive());
	}

	@Test
	public void FighterTest_getDamagePoints_shouldEqualStrengthAtFirstLevel() {
		int strength = 10;
		warrior.setStrength(strength);
		
		int dmg = fighter.getDamagePoints();
		
		assertEquals(strength, dmg);
	}
	
	@Test
	public void FighterTest_getDamagePoints_shouldIncreaseDamageWithLevel() {
		int strength = 10;
		int level = 10;
		int dmgLvl1;
		int dmgLvl2;
		warrior.setStrength(strength);
		
		dmgLvl1 = fighter.getDamagePoints();
		warrior.setLevel(level);
		dmgLvl2 = fighter.getDamagePoints();
		
		assertTrue(dmgLvl1 < dmgLvl2);
	}
	
	@Test
	public void FighterTest_getDamagePoints_deadPeopleDontDoDamage() {
		int strength = 10;
		int hitpoints = 0;
		int dmg = 100;
		
		warrior.setStrength(strength);
		warrior.setHitPoints(hitpoints);
		dmg = fighter.getDamagePoints();
		
		assertEquals(0, dmg);
	}
	
	@Test
	public void FighterTest_receiveDamage_armorPointsShouldDecreaseIncomingDamage() {
		int dmg = 6;
		int armor = 5;
		int hitpoints = 10;
		warrior.setArmorPoints(armor);
		warrior.setHitPoints(hitpoints);
		
		fighter.receiveDamage(dmg);
		
		assertEquals(9, warrior.getHitPoints());
	}
	
	@Test
	public void FighterTest_receiveDamage_exceedingArmorPointsShouldNotAddHitPoints() {
		int dmg = 5;
		int armor = 10;
		int hitpoints = 10;
		warrior.setArmorPoints(armor);
		warrior.setHitPoints(hitpoints);
		
		fighter.receiveDamage(dmg);
		
		assertFalse(warrior.getHitPoints() > hitpoints);
	}
	
	@Test
	public void FighterTest_dodge_twiceGreaterDexShouldNegateDamage() {
		int mydex = 10;
		int dex = 5;
		int hitPoints = 20;
		int dmg = 10;
		
		warrior.setDextirity(mydex);
		warrior.setHitPoints(hitPoints);
		fighter.attemptDodge(dmg, dex);
		
		assertEquals(warrior.getHitPoints(), hitPoints);		
	}
	
	@Test
	public void FighterTest_dodge_twiceSmallerDexShouldReceiveDamage() {

		int mydex = 10;
		int dex = 20;
		int hitPoints = 20;
		int dmg = 10;
		
		warrior.setDextirity(mydex);
		warrior.setHitPoints(hitPoints);
		fighter.attemptDodge(dmg, dex);
		
		assertEquals(warrior.getHitPoints(), hitPoints - dmg);	
	}
}
