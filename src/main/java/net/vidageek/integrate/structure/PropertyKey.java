package net.vidageek.integrate.structure;

import net.vidageek.integrate.DomainObject;

final public class PropertyKey implements DomainObject {

    private final String key;

    public PropertyKey(final String key) {
        this.key = key;
    }

    public String asString() {
        return key;
    }

}
