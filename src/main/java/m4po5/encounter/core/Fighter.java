package m4po5.encounter.core;

public class Fighter{
	private PhysicalEncounter encounter;
	
	public Fighter(PhysicalEncounter encounter) {
		this.encounter = encounter;
	}
	
	public boolean isAlive() {
		if (encounter.getHitPoints() > 0)
			return true;
		else
			return false;
	}
	
	public int getDamagePoints() {
		if (!isAlive())
			return 0;
		else
			return (int)Math.floor(encounter.getStrength() + ( encounter.getLevel() / 10 ) );
	}
	
	public void receiveDamage(int damagePoints) {
		int damage = damagePoints - encounter.getArmorPoints();
		if (damage > 0) {
			encounter.setHitPoints(encounter.getHitPoints() - damage);
		}
	}
	
	public void attemptDodge(int damagePoints, int dex) {
		double myDex = encounter.getDextirity();
		double baseDodge = 0.5;
		double mod = 0.0;
		double dodgeChance = 0.0;
		
		// dex == mydex => dodgechance 0.5
		// 2*dex == mydex => dodgechance 1
		// dex == 2*mydex => dodgechance 0
		
		if (myDex >= dex)
			mod = (1 - (dex / myDex));
		else
			mod = (1 - (myDex / dex)) * -1;
		
		dodgeChance = baseDodge + mod;
		
		boolean hasDodged = Math.random() <= ( dodgeChance);
		
		if(!hasDodged) {
			receiveDamage(damagePoints);
		}
	}
}
