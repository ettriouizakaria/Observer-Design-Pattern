package com.learning.dp.behavioral.observer;

public class TestObserver {
    public static void main(String[] args) {
        Subject subject = new CommentaryObject("Football Match: RMA vs FCB");

        Observer observer1 = new SMSUsers("User 1");
        Observer observer2 = new SMSUsers("User 2");

        Observer observer3 = new MailUsers("User 3");

        subject.addObserver(observer1);
        subject.addObserver(observer2);
        subject.addObserver(observer3);

        subject.setDesc("RMA 1 : 0 FCB ");

        Subject subject2 = new CommentaryObject("Football Match: INT vs PSG");

        Observer observer4 = new SMSUsers("User 4");
        Observer observer5 = new MailUsers("User 5");
        Observer observer6 = new MailUsers("User 6");

        subject2.addObserver(observer4);
        subject2.addObserver(observer5);
        subject2.addObserver(observer6);

        subject2.setDesc("INT 0 : 1 PSG ");

        subject2.removeObserver(observer5);

        subject2.setDesc("INT 1 : 1 PSG ");
    }
}
