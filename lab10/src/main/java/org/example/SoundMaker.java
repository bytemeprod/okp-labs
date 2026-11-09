package org.example;

public interface SoundMaker {
    void makeSound();
    String getSoundType();

    static void printInfo() {
        System.out.println("интерфейс определяет звук животных");
    }
}