package flower.store.mail;

public class GiftMailCode implements MailCode {
    @Override
    public String generateMessage(Client client) {
        return "Hi " + client.getName() + ", ther is a gift for you!";
    }
}
