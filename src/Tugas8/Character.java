package com.src.Tugas8;

public abstract class Character{
    private int defence;
    private int attack;
    private int HP;

    public int angka = 10;

    Character( int defence, int attack, int HP){
        this.defence = defence;
        this.attack = attack;
        this.HP = HP;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public abstract boolean attack();

    public void receiveDamage(int damage){
        int totalDamage;
        if (damage > defence) {
            totalDamage = damage - defence;
        }else{
            totalDamage = 0;
        }

        this.HP -= totalDamage;
        if (HP <= 0) {
            setHP(0);
        }
    }

    public void info(){
        System.out.println("HP          : "+getHP());
        System.out.println("Attack      : "+getAttack());
        System.out.println("Defence     : "+getDefence());
    }
}
