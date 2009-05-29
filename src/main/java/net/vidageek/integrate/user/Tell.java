package net.vidageek.integrate.user;

import net.vidageek.integrate.Project;
import net.vidageek.integrate.exception.IntegrateException;

final public class Tell {

    private final String message;

    public Tell() {
        message = "";
    }

    private Tell(final Tell tell) {
        message = tell.message;
    }

    private Tell(final Tell tell, final String messagePart) {
        message = tell.message + messagePart;
    }

    public Tell user() {
        return new Tell(this);
    }

    public Tell that(final Project project) {
        return new Tell(this, "project");
    }

    public void exists() {
        throw new IntegrateException(message + " already exists");
    }

}
