package flower.store.user;

import java.time.LocalDate;

public class AppUserBuilder {
    private long id;
    private String email;
    private LocalDate dob;

    public AppUserBuilder id(long id) {
        this.id = id;
        return this;
    }

    public AppUserBuilder email(String email) {
        this.email = email;
        return this;
    }

    public AppUserBuilder dob(LocalDate dob) {
        this.dob = dob;
        return this;
    }

    public AppUser build() {
        return new AppUser(id, email, dob);
    }
}

