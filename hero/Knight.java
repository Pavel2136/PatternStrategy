package hero;

import WeaponBehavior.SwordBehavior;

public class Knight extends Hero {

    public Knight() {
        weaponBehavior = new SwordBehavior();
    }

    @Override
    public void display() {
        System.out.println("I'm the best knight in The Mediterranean Land");
    }
}
