package com.github.dank0851;
/*
* У каждого животного есть ограничения на действия
* (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
 */
public class Dog extends Animal {
    private static int dogCount = 0;

    public Dog() {
        dogCount++;
    }

    public static int getDogCount() {
        return dogCount;
    }

    @Override
    public void run(int distance) {
        if (distance <= 500) {
            System.out.println("Собака пробежала " + distance + " м.");
        } else {
            System.out.println("Собака не может преодолеть такое расстояние.");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= 10) {
            System.out.println("Собака проплыла " + distance + " м.");
        } else {
            System.out.println("Собака не умеет плавать на такие дальности.");
        }
    }
}
