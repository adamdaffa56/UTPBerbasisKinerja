package com.src.Tugas8;

public class Titan extends Character{
    Titan(int defence, int attack, int HP) {
        super(defence, attack, HP);
    }

    @Override
    public boolean attack() {
        boolean hit;
        double randomNum = (double)(Math.random() * 11);

        if (randomNum <= 4) {
            hit = true;
        }else{
            hit = false;
        }

        return hit;
    }
}
