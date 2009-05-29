package net.vidageek.integrate;

final public class Name implements DomainObject {

    private final String name;

    public Name(final String string) {
        name = string;
    }

    public String asString() {
        return name;
    }

}
