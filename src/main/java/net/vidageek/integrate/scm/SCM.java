package net.vidageek.integrate.scm;

import net.vidageek.integrate.structure.Folder;

public interface SCM {

    void checkOut(Folder projectFolder);

    void update(Folder projectFolder);

    RepositoryURL repositoryURL();

}
