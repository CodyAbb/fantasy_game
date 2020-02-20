package Characters;

import Items.IAffectHealthPoints;

import java.util.ArrayList;
import java.util.HashMap;

public class Player implements ICharacter {

    private String name;
    private int healthPoints;

    private HashMap treasure;
    private ArrayList<IAffectHealthPoints> damageGiverInventory;
    private ArrayList protectionInventory;

    private IAffectHealthPoints equippedWeapon;
//    private IProtect equippedProtection;

    public Player(String name) {
        this.name = name;
        this.healthPoints = 100;
        this.treasure = new HashMap();
        this.damageGiverInventory = new ArrayList<IAffectHealthPoints>();
        this.protectionInventory = new ArrayList();
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

    public int giveDamage(){
        return this.equippedWeapon.getAffectPoints();
    }

    public void takeDamage(int damage){
        this.healthPoints -= damage;
    }

    public void equipDamageGiver(int index){
        this.equippedWeapon = damageGiverInventory.get(index);
    }
}
