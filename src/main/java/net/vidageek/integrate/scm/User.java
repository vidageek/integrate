package net.vidageek.integrate.scm;

import net.vidageek.integrate.Name;
import net.vidageek.integrate.Password;

final public class User {

    private final Name name;
    private final Password password;

    public User(final Name name, final Password password) {
        this.name = name;
        this.password = password;
    }

    public Name name() {
        return name;
    }

    public Password password() {
        return password;
    }

}
