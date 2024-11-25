package flower.store.mail;

public class BirthdayMailCode implements MailCode {
    @Override
    public String generateMessage(Client client) {
        return "Happy Birthday, " + client.getName() + "! There are some presents in our shop just for 49.99$ instead of 50.00$";
    }
}