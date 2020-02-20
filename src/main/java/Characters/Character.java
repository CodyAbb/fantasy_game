package Characters;

import Items.Item;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class Character {

    private HashMap treasure;
    private ArrayList inventory;

    public Character() {
        this.treasure = new HashMap();
        this.inventory = new ArrayList();
    }

    public HashMap getTreasure() {
        return treasure;
    }

    public ArrayList getInventory() {
        return inventory;
    }

    public void addToInventory(Item item){
        this.inventory.add(item);
    }
}
