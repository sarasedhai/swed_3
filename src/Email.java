
public class Email extends Notification {
    private String email;

    @Override
    public String notifyUser() {
        return "Email sent to: " + email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
