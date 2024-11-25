package flower.store.mail;

public class MailTest {
    public static void main(String[] args) {
        Client client1 = new Client("Alice", 25, "Female");
        Client client2 = new Client("Bob", 30, "Male");

        MailCode birthdayMail = new BirthdayMailCode();
        MailCode giftMail = new GiftMailCode();

        MailInfo mailInfo1 = new MailInfo(client1, birthdayMail);
        MailInfo mailInfo2 = new MailInfo(client2, giftMail);

        MailBox mailBox = new MailBox();
        mailBox.addMailInfo(mailInfo1);
        mailBox.addMailInfo(mailInfo2);

        mailBox.sendAll();
    }
}

