package fr.tvbarthel.games.chasewhisply.model;

public class WeaponFactory {
	private static final int BASIC_WEAPON_DAMAGE = 1;
	private static final int BASIC_WEAPON_AMMUNITION_LIMIT = 8;
	private static final long BASIC_WEAPON_RELOADING_TIME = 1500;

	public static Weapon createBasicWeapon() {
		Weapon basicWeapon = new Weapon();
		basicWeapon.setDamage(BASIC_WEAPON_DAMAGE);
		basicWeapon.setAmmunitionLimit(BASIC_WEAPON_AMMUNITION_LIMIT);
		basicWeapon.setReloadingTime(BASIC_WEAPON_RELOADING_TIME);
		basicWeapon.reload(BASIC_WEAPON_AMMUNITION_LIMIT);
		return basicWeapon;
	}
}
