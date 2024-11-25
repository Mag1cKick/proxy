package flower.store.mail;

public class MailSender {
    public void sendMail(MailInfo mailInfo) {
        String message = mailInfo.getMailCode().generateMessage(mailInfo.getClient());
        System.out.println("Sending mail to " + mailInfo.getClient().getName() + ": " + message);
    }
}
