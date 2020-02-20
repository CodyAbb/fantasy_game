package Items.Weapons;

import Items.IAffectHealthPoints;
import Items.Item;

public class Weapon extends Item implements IAffectHealthPoints {

    private int affectPoints;

    public Weapon(String name, int affectPoints){
        super(name);
        this.affectPoints = affectPoints;
    }

    public void affectHealth() {

    }
}
