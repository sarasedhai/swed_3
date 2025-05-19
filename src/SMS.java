
public class SMS extends Notification {
    private String message;

    @Override
    public String notifyUser() {
        return "SMS sent: " + message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
