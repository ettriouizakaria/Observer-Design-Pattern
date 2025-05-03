package com.learning.dp.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class CommentaryObject implements Subject{

    private final List<Observer> observers;
    private String desc;
    private final String subjectDetails;

    public CommentaryObject(String subjectDetails){
        observers = new ArrayList<>();
        this.subjectDetails = subjectDetails;
    }

    @Override
    public void setDesc(String desc) {
        this.desc = desc;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers){
            observer.update(this, desc);
        }
    }

    @Override
    public String getSubjectDetails() {
        return subjectDetails;
    }
}
