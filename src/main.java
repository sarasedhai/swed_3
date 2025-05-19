
public class main {
    public static void main(String[] args) { // demonstrate how all the classees work together
        // Create a user
        User user = new User();
        System.out.println("User created.");

        // Create a subscription and set details 
        Subscription subscription = new Subscription();
        subscription.setFrequency(2.5f);
        subscription.setChannel("Email");
        subscription.setUrl("https://example.com");

        System.out.println("Subscription created with:");
        System.out.println("Frequency: " + subscription.getFrequency());
        System.out.println("Channel: " + subscription.getChannel());
        System.out.println("URL: " + subscription.getUrl());

        // Create website and check for update
        Website website = new Website();
        String updateInfo = website.checkForUpdate();
        System.out.println("Website update check: " + updateInfo);

        // Send SMS notification
        SMS sms = new SMS();
        sms.setMessage("Your subscription is active.");
        System.out.println(sms.notifyUser());

        // Send Email notification
        Email email = new Email();
        email.setEmail("user@example.com");
        System.out.println(email.notifyUser());
    }
}
