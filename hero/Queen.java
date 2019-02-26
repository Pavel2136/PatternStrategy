package hero;

import WeaponBehavior.KnifeBehavior;

public class Queen extends Hero {

    public Queen() {
        weaponBehavior = new KnifeBehavior();
    }

    @Override
    public void display() {
        System.out.println("I'm the Queen of The Mediterranean Land");
    }
}
