package net.vidageek.integrate;

final public class Password implements DomainObject {

    private final String password;

    public Password(final String password) {
        this.password = password;
    }

    public String asString() {
        return password;
    }

}
