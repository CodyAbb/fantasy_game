package Characters;

import Items.IAffectHealthPoints;
import Items.Protectives.IProtect;
import Items.Weapons.Weapon;

public abstract class Enemy implements ICharacter {

    private int healthPoints;
    public String type;
    private IAffectHealthPoints equippedWeapon;
    private IProtect equippedProtection;

    public Enemy(String type, int healthPoints, IAffectHealthPoints weapon, IProtect protective){
        this.type = type;
        this.healthPoints = healthPoints;
        this.equippedWeapon = weapon;
        this.equippedProtection = protective;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public String getType() {
        return type;
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
