package com.ToDo.ToDo.model;

public class ToDomodel {
    private int number;
    private String task;

    public ToDomodel() {} 

    public ToDomodel(int number, String task) {
        this.number = number;
        this.task = task;
    }

    // Getters and setters
    public int getNumber() { return number; }
    public void setNumber(int number) { this.number = number; }

    public String getTask() { return task; }
    public void setTask(String task) { this.task = task; }
}
