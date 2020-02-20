package Items.Protectives;

public class Armour implements IProtect {

    private String name;
    private int protectionValue;

    public Armour(String name, int protectionValue){
        this.name = name;
        this.protectionValue = protectionValue;
    }

    public int getProtectionValue() {
        return this.protectionValue;
    }

    public int negateDamage(int damage) {
        return damage -= this.protectionValue;
    }
}
