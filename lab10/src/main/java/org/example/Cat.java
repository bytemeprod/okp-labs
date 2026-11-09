package org.example;

public class Cat implements SoundMaker, Movable, Feedable {
    private String name;
    private String color;
    private double speed;
    private boolean hungry;

    public Cat(String name, String color, double speed, boolean hungry) {
        this.name = name;
        this.color = color;
        this.speed = speed;
        this.hungry = hungry;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " (" + color + ") мяукает");
    }

    @Override
    public String getSoundType() {
        return "Мяуканье";
    }

    @Override
    public void move() {
        System.out.println(name + " идет со скоростью" + speed + " км/ч.");
    }

    @Override
    public double getSpeed() {
        return speed;
    }

    @Override
    public void feed() {
        if (hungry) {
            hungry = false;
            System.out.println(name + " поел");
        } else {
            System.out.println(name + " не голоден");
        }
    }

    @Override
    public boolean isHungry() {
        return hungry;
    }

    @Override
    public String toString() {
        return "Кошка: " + name + " [Окрас: " + color + ", Скорость: " + speed + " км/ч, Голоден: " + hungry + "]";
    }
}