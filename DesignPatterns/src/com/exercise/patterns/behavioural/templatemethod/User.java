package com.exercise.patterns.behavioural.templatemethod;

public class User extends Record {
    @Override
    protected void validate() {
        System.out.println("In User.validate() .");
    }
    @Override
    public void beforeSave() {
        System.out.println("In User.beforeSave() .");
    }
}
