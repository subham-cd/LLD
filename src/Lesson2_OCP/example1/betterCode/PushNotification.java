package Lesson2_OCP.example1.betterCode;

public class PushNotification implements  Notifcation{
    @Override
    public void send() {
        System.out.println("Sending Push Notifications.....");
    }
}
