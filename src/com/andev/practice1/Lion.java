package com.andev.practice1;

public abstract class Lion {
    private int age;
    private int power;
    private int loud;

    public Lion(int age, int power, int loud) {
        this.age = age;
        this.power = power;
        this.loud = loud;
    }

    public abstract void print();

}
