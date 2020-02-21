package Characters;

import Items.IAffectHealthPoints;
import Items.Protectives.IProtect;

public class HellKnight extends Enemy {
    public HellKnight(int healthPoints, IAffectHealthPoints weapon, IProtect protective) {
        super(healthPoints, weapon, protective);
    }
}
