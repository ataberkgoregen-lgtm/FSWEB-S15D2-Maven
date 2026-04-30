package org.example;

import org.example.entity.*;

import java.awt.image.ComponentSampleModel;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Task task1 = new Task("ProjectA", "Fix login bug", "ann", Status.IN_PROGRESS, Priority.HIGH);
        Task task2 = new Task("ProjectA", "Write unit tests", "ann", Status.IN_PROGRESS, Priority.MED);

        Task task3 = new Task("ProjectB", "Design database schema", "bob", Status.IN_PROGRESS, Priority.HIGH);
        Task task4 = new Task("ProjectB", "Deploy to staging", "bob", Status.IN_PROGRESS, Priority.LOW);

        Task task5 = new Task("ProjectC", "Code review", "carol", Status.IN_PROGRESS, Priority.LOW);

        Task task6 = new Task("ProjectC", "Update documentation", null, Status.IN_PROGRESS, Priority.LOW);

        Set<Task> annsTasks = new HashSet<>();
        annsTasks.add(task1);
        annsTasks.add(task2);

        Set<Task> bobsTasks = new HashSet<>();
        bobsTasks.add(task3);
        bobsTasks.add(task4);

        Set<Task> carolsTasks = new HashSet<>();
        carolsTasks.add(task5);

        Set<Task> unassignedTasks = new HashSet<>();
        unassignedTasks.add(task6);

        // 3. TaskData instance oluştur
        TaskData taskData = new TaskData(annsTasks, bobsTasks, carolsTasks, unassignedTasks);

        System.out.println("Ann's tasks: " + taskData.getAnnsTasks());
        System.out.println("Ann's tasks: " + taskData.getBobsTasks());
        System.out.println("Ann's tasks: " + taskData.getAnnsTasks());

        System.out.println("Ann's tasks: " + taskData.getAnnsTasks());


        StringSet.findUniqueWords();
    }
}