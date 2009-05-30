package net.vidageek.integrate.scm;

import net.vidageek.fs.Folder;
import net.vidageek.integrate.DomainObject;

final public class Repository implements DomainObject {

    private final User user;
    private final SCM scm;

    public Repository(final SCM scm, final User user) {
        this.scm = scm;
        this.user = user;
    }

    public String asString() {
        return scm.repositoryURL().asString();
    }

    public User user() {
        return user;
    }

    public void checkOut(final Folder projectFolder) {
        scm.checkOut(projectFolder);
    }

    public void update(final Folder projectFolder) {
        scm.update(projectFolder);
    }

}
