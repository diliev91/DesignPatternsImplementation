package com.exercise.patterns.behavioural.templatemethod;

public abstract class Record {
    public void save() {
        System.out.println("In Record.save() .");
        this.validate();
        this.beforeSave();

    }

    protected void beforeSave(){ };

    protected abstract void validate();
}
