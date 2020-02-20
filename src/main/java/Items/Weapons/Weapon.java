package Items.Weapons;

import Items.IAffectHealthPoints;

public class Weapon implements IAffectHealthPoints {

    private String type;
    private int affectPoints;

    public Weapon(String type, int affectPoints){
        this.type = type;
        this.affectPoints = affectPoints;
    }

    public int getAffectPoints(){
        return this.affectPoints;
    }

    public void affectHealth() {

    }
}
