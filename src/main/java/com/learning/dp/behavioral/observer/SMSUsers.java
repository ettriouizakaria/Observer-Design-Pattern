package com.learning.dp.behavioral.observer;

public class SMSUsers implements Observer{

    private String desc;
    private String userInfo;
    private Subject subject;

    public SMSUsers( String userInfo){
        this.userInfo = userInfo;
    }

    @Override
    public void update(Subject subject ,String desc) {
        this.desc = desc;
        this.subject = subject;
        display();
    }

    private void display(){
        System.out.println("SMS - " + "["+userInfo+"]: " + subject.getSubjectDetails() + " : " + desc );
    }
}
