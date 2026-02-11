package Lesson2_OCP.example1.betterCode;

public class EmailNotification implements Notifcation{
    @Override
    public void send() {
        System.out.println("Sending email");
    }
}
