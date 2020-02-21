package Characters;

import Items.IAffectHealthPoints;
import Items.Protectives.IProtect;
import Items.Weapons.Weapon;

public abstract class Enemy implements ICharacter {

    private int healthPoints;
    private IAffectHealthPoints equippedWeapon;
    private IProtect equippedProtection;

    public Enemy( int healthPoints, IAffectHealthPoints weapon, IProtect protective){

        this.healthPoints = healthPoints;
        this.equippedWeapon = weapon;
        this.equippedProtection = protective;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public IAffectHealthPoints getEquippedWeapon() {
        return equippedWeapon;
    }

    public IProtect getEquippedProtection() {
        return equippedProtection;
    }

    public int giveDamage() {
        return equippedWeapon.getAffectPoints();
    }

    public void takeDamage(int damage) {
        damage = equippedProtection.negateDamage(damage);
        this.healthPoints -= damage;
    }
}
