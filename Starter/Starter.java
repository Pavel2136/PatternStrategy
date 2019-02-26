package Starter;

import WeaponBehavior.SwordBehavior;
import hero.*;

public class Starter {
    public static void main(String[] args) {

        Hero king = new King();
        Hero queen = new Queen();
        Hero knight = new Knight();
        Hero troll = new Troll();

        System.out.println("King");
        king.display();
        king.move();
        king.fight();
        //king.setWeaponBehavior(new SwordBehavior());
        //king.fight();
        System.out.println();

        System.out.println("Queen");
        queen.display();
        queen.move();
        queen.fight();
        System.out.println();

        System.out.println("Knight");
        knight.display();
        knight.move();
        knight.fight();
        System.out.println();

        System.out.println("Troll");
        troll.display();
        troll.move();
        troll.fight();
    }
}
