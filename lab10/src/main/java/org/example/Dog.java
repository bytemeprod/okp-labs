package org.example;

public class Dog implements SoundMaker, Movable, Feedable {
    private String name;
    private String breed;
    private double speed;
    private boolean hungry;

    public Dog(String name, String breed, double speed, boolean hungry) {
        this.name = name;
        this.breed = breed;
        this.speed = speed;
        this.hungry = hungry;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " (" + breed + ") лает");
    }

    @Override
    public String getSoundType() {
        return "Лай";
    }

    @Override
    public void move() {
        System.out.println(name + " бежит со скоростью " + speed + " км/ч.");
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
            System.out.println(name + " не голоден.");
        }
    }

    @Override
    public boolean isHungry() {
        return hungry;
    }

    @Override
    public String toString() {
        return "Собака: " + name + " [Порода: " + breed + ", Скорость: " + speed + " км/ч, Голоден: " + hungry + "]";
    }
}