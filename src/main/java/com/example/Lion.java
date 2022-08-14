package com.example;

import java.util.List;

public class Lion {

    boolean hasMane;

    public Lion(String sex) throws Exception {
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самей или самка");
        }
    }

    private IFeline ifeline;
    public Lion (IFeline ifeline){
        this.ifeline = ifeline;
    }

    public int getKittens() {
        return ifeline.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    private Animal animal;
    public Lion (Animal animal){
        this.animal = animal;
    }

    public List<String> getFood() throws Exception {
        return animal.getFood("Хищник");
    }
}
