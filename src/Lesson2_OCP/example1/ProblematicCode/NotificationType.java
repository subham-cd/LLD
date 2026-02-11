package Lesson2_OCP.example1.ProblematicCode;

public enum NotificationType {

    SMS,
    Email,
    Whatsapp;

    public  void SMSNotification(){
        System.out.println("Sending sms");
    }
    public  void sendEmail(){
        System.out.println("Sending email");
    }
    public   void SendWhatsappNotification(){
        System.out.println("sending Whatsapp notification");
    }
}
