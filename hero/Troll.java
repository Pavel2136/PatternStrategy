package hero;

import WeaponBehavior.AxeBehavior;

public class Troll extends Hero {

    public Troll() {
        weaponBehavior = new AxeBehavior();
    }

    @Override
    public void display() {
        System.out.println("I'll destroy The Mediterranean Land");
    }
}
