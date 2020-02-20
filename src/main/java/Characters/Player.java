package Characters;

import Items.IAffectHealthPoints;
import Items.Protectives.IProtect;

import java.util.ArrayList;
import java.util.HashMap;

public class Player implements ICharacter {

    private String name;
    private int healthPoints;

    private HashMap treasure;
    private ArrayList<IAffectHealthPoints> damageGiverInventory;
    private ArrayList<IProtect> protectionInventory;


    private IAffectHealthPoints equippedWeapon;
    private IProtect equippedProtection;

    public Player(String name) {
        this.name = name;
        this.healthPoints = 100;
        this.treasure = new HashMap();
        this.damageGiverInventory = new ArrayList<IAffectHealthPoints>();
        this.protectionInventory = new ArrayList<IProtect>();
    }

    public String getName() {
        return name;
    }

    public ArrayList getProtectionInventory() {
        return protectionInventory;
    }

    public IAffectHealthPoints getEquippedWeapon() {
        return equippedWeapon;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public HashMap getTreasure() {
        return treasure;
    }

    public ArrayList getDamageGiverInventory() {
        return damageGiverInventory;
    }

    public void addToDamageGiverInventory(IAffectHealthPoints damageGiver){
        this.damageGiverInventory.add(damageGiver);
    }

    public void addToProtectionInventory(IProtect protective){
        this.protectionInventory.add(protective);
    }

    public int giveDamage(){
        return this.equippedWeapon.getAffectPoints();
    }

    public void takeDamage(int damage){
        damage = equippedProtection.negateDamage(damage);
        this.healthPoints -= damage;
    }

    public void equipDamageGiver(int index){
        this.equippedWeapon = damageGiverInventory.get(index);
    }

    public void equipProtective(int index){
        this.equippedProtection = protectionInventory.get(index);
    }
}
