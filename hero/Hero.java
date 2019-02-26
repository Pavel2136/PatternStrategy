package hero;

import WeaponBehavior.IWeaponBehavior;

public abstract class Hero {
    IWeaponBehavior weaponBehavior;

    public Hero(){
    }

    public abstract void display();

    public void move() {
        System.out.println("Let's go");
    }

    public void fight() {
        weaponBehavior.useWeapon();
    }

    public void setWeaponBehavior(IWeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }
}
