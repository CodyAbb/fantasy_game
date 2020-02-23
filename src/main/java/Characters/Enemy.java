package Characters;

import Items.IAffectHealthPoints;
import Items.Protectives.IProtect;
import Items.Treasure.Treasure;
import Items.Weapons.Weapon;

import java.util.ArrayList;

public abstract class Enemy implements ICharacter {

    private int healthPoints;
    private IAffectHealthPoints equippedWeapon;
    private IProtect equippedProtection;
    private ArrayList<Treasure> treasure;

    public Enemy( int healthPoints, IAffectHealthPoints weapon, IProtect protective){
        this.healthPoints = healthPoints;
        this.equippedWeapon = weapon;
        this.equippedProtection = protective;
        this.treasure = new ArrayList<Treasure>();
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public ArrayList<Treasure> getTreasure() {return this.treasure;}

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
