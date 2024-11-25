package flower.store.mail;

public class Client {
    private static long idCounter = 0;

    private final long id;
    private final String name;
    private final int age;
    private final String sex;

    public Client(String name, int age, String sex) {
        this.id = idCounter++;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }
}

