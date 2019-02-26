package hero;

import WeaponBehavior.BowAndArrowBehavior;

public class King extends Hero {

    public King() {
        weaponBehavior = new BowAndArrowBehavior();
    }

    @Override
    public void display() {
        System.out.println("I'm the King of The Mediterranean Land");
    }
}
