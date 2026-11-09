package org.example;

public class Main {
    static void main(String[] args) {
        System.out.println("Информация о SoundMaker: ");
        SoundMaker.printInfo();

        Dog dog1 = new Dog("Имя1", "Порода1", 28.5, true);
        Dog dog2 = new Dog("Имя2", "Порода2", 22.0, false);

        Cat cat1 = new Cat("Имя4", "Рыжий", 18.0, true);
        Cat cat2 = new Cat("Имя5", "Серый", 15.5, false);

        System.out.println("Интерфейс SoundMaker: ");
        SoundMaker[] soundMakers = { dog1, dog2, cat1, cat2 };
        for (SoundMaker sm : soundMakers) {
            System.out.print("Тип звука [" + sm.getSoundType() + "]: ");
            sm.makeSound();
        }

        System.out.println("Интерфейс Movable: ");
        Movable[] movers = { dog1, dog2, cat1, cat2 };
        for (Movable m : movers) {
            m.move();
        }

        System.out.println("Интерфейс Feedable: ");
        Feedable[] animals = { dog1, dog2, cat1, cat2 };
        for (Feedable animal : animals) {
            System.out.println("Голоден? " + animal.isHungry());
            animal.feed();
        }
    }
}