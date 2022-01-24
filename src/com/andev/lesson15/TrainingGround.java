package com.andev.lesson15;

public class TrainingGround {
    public static void main(String[] args) {
        Hero warrior = new Warrior("Виктор", 15);
        Hero mage = new Mage("Василий", 20);
        Hero archer = new Archer("Петр", 10);

        Enemy enemy = new Enemy("Зомби", 100);

        attackEnemy(enemy, warrior, mage, archer);
    }

    public static void attackEnemy(Enemy enemy, Hero... heroes) {
        while (enemy.isAlive()) {
            for (Hero hero : heroes) {
                if (enemy.isAlive()) {
                    hero.attackEnemy(enemy);
                }
            }
        }
    }
}