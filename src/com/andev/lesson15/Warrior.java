package com.andev.lesson15;

public class Warrior extends Hero {
    public Warrior(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " взмахнул мечом в " + enemy.getName());
        enemy.takeDamage(getDamage());
    }
}
