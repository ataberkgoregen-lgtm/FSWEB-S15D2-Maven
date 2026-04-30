package org.example.entity;

import java.util.HashSet;
import java.util.Set;

public class TaskData {
    private Set<Task> annsTasks;
    private Set<Task> bobsTasks;
    private Set<Task> carolsTasks;
    private Set<Task> unassignedTasks;


    public TaskData(Set<Task> annsTasks, Set<Task> obsTasks, Set<Task>carolsTasks, Set<Task> unassignedTasks) {
        this.annsTasks = annsTasks; // Değer burada atanıyor. final kuralı bozulmaz.
        this.bobsTasks = obsTasks;
        this.carolsTasks = carolsTasks;
        this.unassignedTasks = unassignedTasks;
    }

    public Set<Task> getAnnsTasks() {
        return annsTasks;
    }

    public Set<Task> getCarolsTasks() {
        return carolsTasks;
    }

    public Set<Task> getBobsTasks() {
        return bobsTasks;
    }

    public Set<Task> getUnassignedTasks() {
        return unassignedTasks;
    }

    public Set<Task> getTasks(String param) {
        if (param.equals("ann")){
            return annsTasks;
        } else if(param.equals("bob")) {
            return bobsTasks;
        }else if(param.equals("carol")) {
            return carolsTasks;
        } else if (param.equals("all")) {
            Set<Task> allTasks = new HashSet<>();
            allTasks.addAll(annsTasks);
            allTasks.addAll(bobsTasks);
            allTasks.addAll(carolsTasks);
            return allTasks;
        }
        return new HashSet<>();
    }


    public Set<Task> getUnion( Set<Task> taskSet1,  Set<Task> taskSet2) {
        Set<Task> allTasks = new HashSet<>();
        allTasks.addAll(taskSet1);
        allTasks.addAll(taskSet2);
        return allTasks;
    }

    public Set<Task> getIntersection(Set<Task> taskSet1,  Set<Task> taskSet2) {
        taskSet1.retainAll(taskSet2);
        return taskSet1;
    }


    public Set<Task> getDifferences(Set<Task> taskSet1, Set<Task> taskSet2) {
        taskSet1.removeAll(taskSet2);
        return taskSet1;
    }

}
