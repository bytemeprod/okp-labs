package org.example;

import java.util.Arrays;
import java.util.Comparator;

public class Task {
    private String title;
    private Priority priority;

    public Task(String title, Priority priority) {
        this.title = title;
        this.priority = priority;
    }

    public Priority getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "Приоритет: " + priority + " | Задача: " + title;
    }


    void main() {
        Task[] tasks = {
                new Task("Исправить баг на сервере", Priority.HIGH),
                new Task("Полить цветы в офисе", Priority.LOW),
                new Task("Провести код-ревью", Priority.MEDIUM),
                new Task("Обновить документацию", Priority.LOW),
                new Task("Подготовить срочный релиз", Priority.HIGH)
        };

        System.out.println("Исходный список задач:");
        for (Task t : tasks) {
            System.out.println(t);
        }

        Arrays.sort(tasks, Comparator.comparing(Task::getPriority));

        System.out.println("\nОтсортированные задачи:");
        for (Task t : tasks) {
            System.out.println(t);
        }
    }
}