package com.learning.dp.behavioral.observer;

public interface Subject extends Commentary {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
    String getSubjectDetails();

}
