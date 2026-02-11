package Lesson2_OCP.example1.betterCode;

import java.util.List;

public class NotificationSender {

    public void sendNotifications(List<Notifcation> notifcations){
        for(Notifcation notifcation:notifcations){
            notifcation.send();
        }
    }
}
