package com.andev.practice1;

public class SmallCat extends Lion {

    public SmallCat(int age, int power, int loud) {
        super(age, power, loud);
    }


    @Override
    public void print() {
        System.out.println("NOOOOOO ");
    }
}
