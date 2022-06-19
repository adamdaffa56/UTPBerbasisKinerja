package com.src.Tugas8;

public class Warrior extends Character{
    Warrior(int defence, int attack, int HP) {
        super(defence, attack, HP);
    }

    @Override
    public boolean attack() {
        boolean hit;
        double randomNum = (double)(Math.random() * 11);

        if (randomNum <= 6) {
            hit = true;
        }else{
            hit = false;
        }

        return hit;
    }
}
