package net.vidageek.integrate.scm;

import net.vidageek.fs.Folder;

public interface SCM {

    void checkOut(Folder projectFolder);

    void update(Folder projectFolder);

    RepositoryURL repositoryURL();

}
