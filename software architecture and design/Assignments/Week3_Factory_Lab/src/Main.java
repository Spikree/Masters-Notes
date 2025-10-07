public class Main {
    public static void main(String[] args) {
        // TODO: Create factories for Email, SMS, and Push notifications

        NotificationFactory emailFactory = new EmailFactory();

        NotificationFactory smsFactory = new SMSFactory();

        NotificationFactory pushNotification = new PushFactory();

        // TODO: Use each factory to create a notification and send a message
        Notification email = emailFactory.createNotification();
        email.send("Notification from email");

        Notification sms = smsFactory.createNotification();
        sms.send("Notification from sms");

        Notification push = pushNotification.createNotification();
        push.send("Notification from push");

    }
}