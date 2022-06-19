package com.src.Tugas8;

public class Healer extends Character{
    Healer(int defence, int attack, int HP){
        super(defence, attack, HP);
    }

    public void heal(){
        setHP(getHP() + 25);
    }

    @Override
    public boolean attack() {
        boolean hit;
        double randomNum = (double)(Math.random() * 11);

        if (randomNum <= 8.5) {
            hit = true;
        }else{
            hit = false;
        }

        return hit;
    }
}
