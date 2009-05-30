package net.vidageek.integrate;

import net.vidageek.fs.Folder;
import net.vidageek.integrate.scm.Repository;
import net.vidageek.integrate.structure.PropertyFile;
import net.vidageek.integrate.structure.PropertyKey;

final public class Project {

    private final String CONFIG_FILE = "integrate.properties";
    private final Name name;
    private final Repository repository;

    public Project(final Name name, final Repository repository) {
        this.name = name;
        this.repository = repository;
    }

    public Folder createFolderStructure(final Folder rootFolder) {

        Folder projectFolder = rootFolder.openFolder(name().asString());

        projectFolder
                     .openFile(new PropertyFile(CONFIG_FILE))
                     .addProperty(new PropertyKey("url"), repository)
                     .addProperty(new PropertyKey("user"), repository.user().name())
                     .addProperty(new PropertyKey("password"), repository.user().password())
                     .addProperty(new PropertyKey("build.command"), buildCommand())
                     .apply();

        projectFolder.apply();

        projectFolder.openFolder("work").apply();

        return projectFolder;

    }

    public boolean existsOn(final Folder rootFolder) {
        return rootFolder.openFolder(name().asString()).exists();
    }

    public Name name() {
        return name;
    }

    public Repository repository() {
        return repository;
    }

    public Name buildCommand() {
        return null;
    }

}
