package Lesson2_OCP.example1.ProblematicCode;

import java.util.List;

public class NotificationSender {

    public void sendNotification(List<NotificationType> notificationTypes){
        for(NotificationType type :notificationTypes){
            if(type == NotificationType.SMS){
                type.SMSNotification();
            } else if (type == NotificationType.Whatsapp) {
                type.SendWhatsappNotification();
            } else if (type == NotificationType.Email) {
                type.sendEmail();

            }
        }
    }
}


//problem :this code know to much about notification type
//extendibility problem

//its violate open close principle:A class should be open for extension and close for modify

//how can improve :to make concrete class

//like emial sender sms sender whatsapp sender and each have on method

//but her also problem

//so we use abstract class
