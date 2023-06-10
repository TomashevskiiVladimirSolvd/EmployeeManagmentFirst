package com.laba.solvd.db.model;

import java.util.List;


public class Projects {
    private long id;
    private String name;
    private List<Tasks> tasks;
    public Projects(){};

    public Projects(long id,String name){
        this.id=id;
        this.name=name;
    }

    public List<Tasks> getTasks() {
        return tasks;
    }

    public void setTasks(List<Tasks> tasks) {
        this.tasks = tasks;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
