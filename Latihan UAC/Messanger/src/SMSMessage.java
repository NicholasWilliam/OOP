public class SMSMessage extends Message {

    public SMSMessage(ILogin login, String sender, String recipient, String content) {
        super(login, sender, recipient, content);
    }

    @Override
    public void send(String username, String token) {
        if (login.authenticate(username, token)) {
            System.out.println("SMS sent successfully from " + sender + " to " + recipient + ": " + content);
        } else {
            System.out.println("SMS authentication failed.");
        }
    }
}