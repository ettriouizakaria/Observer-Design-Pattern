package com.learning.dp.behavioral.observer;

public class MailUsers implements Observer{
    private String desc;
    private String userInfo;
    private Subject subject;

    public MailUsers(String userInfo){
        this.userInfo = userInfo;
    }

    @Override
    public void update(Subject subject, String desc) {
        this.desc = desc;
        this.subject = subject;
        display();
    }

    private void display(){
        System.out.println("Mail - " + "["+userInfo+"]: " + subject.getSubjectDetails() + " : " + desc );
    }
}
